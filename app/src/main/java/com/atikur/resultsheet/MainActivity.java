package com.atikur.resultsheet;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.app.admin.DeviceAdminReceiver;
import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.NetworkInterface;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private TelephonyManager telephonyManager;
    private int imeiStatus = 0;
    private TextView userStatus;
    private String userName="";
    private AppPreferences appPreferences = null;
    private Button demoButton;

    private void launchHomeScreen() {


        if (appPreferences.getString(AppPreferences.USER_ID) == null) {
            // startActivity(new Intent(SigninActivity.this, VerifyPhoneActivity.class));

        }else {
            startActivity(new Intent(MainActivity.this, ClassSelectorActivity.class));
        }
        finish();
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userStatus=findViewById(R.id.userStatus);
        demoButton=findViewById(R.id.button_demo);

        appPreferences = new AppPreferences(this);
        if (appPreferences.getString(AppPreferences.USER_ID) != null) {
            launchHomeScreen();
            finish();
        }else {
            String imeiId = getUniqueIMEIId(this);

            // deviceId();
            getMovieData(imeiId);
        }



        // Toast.makeText(this, "Hello"+getMacAddr(), Toast.LENGTH_SHORT).show();
        // Toast.makeText(this, "he" + getUniqueIMEIId(this), Toast.LENGTH_SHORT).show();

        demoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,ClassSelectorActivity.class));
            }
        });


    }


    public static String getUniqueIMEIId(Context context) {
        try {

            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(Context.TELEPHONY_SERVICE);
            String imei;

            if (ContextCompat.checkSelfPermission(context, android.Manifest.permission.READ_PHONE_STATE) == PackageManager.PERMISSION_GRANTED) {

                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                    imei = telephonyManager.getImei();
                } else {
                    imei = telephonyManager.getDeviceId();
                }

                if (imei != null && !imei.isEmpty()) {
                    return imei;
                } else {
                    return android.os.Build.SERIAL;
                }
            }

        } catch (Exception e) {
            StringWriter errors = new StringWriter();
            e.printStackTrace(new PrintWriter(errors));
            return errors.toString();
//e.printStackTrace();
        }

        return "not_found";
    }

//    private void deviceId() {
//        telephonyManager = (TelephonyManager) getSystemService(this.TELEPHONY_SERVICE);
//        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.READ_PHONE_STATE) != PackageManager.PERMISSION_GRANTED) {
//            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.READ_PHONE_STATE}, 101);
//            return;
//        }
//    }
//
//    @Override
//    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
//        switch (requestCode) {
//            case 101:
//                if (grantResults[0] == PackageManager.PERMISSION_GRANTED) {
//                    if (ActivityCompat.checkSelfPermission(this, Manifest.permission.READ_PHONE_STATE) != PackageManager.PERMISSION_GRANTED) {
//                        ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.READ_PHONE_STATE}, 101);
//                        return;
//                    }
//                    String imeiNumber = telephonyManager.getDeviceId();
//                    Toast.makeText(MainActivity.this, imeiNumber, Toast.LENGTH_LONG).show();
//                } else {
//                    Toast.makeText(MainActivity.this, "Without permission we check", Toast.LENGTH_LONG).show();
//                }
//                break;
//            default:
//                super.onRequestPermissionsResult(requestCode, permissions, grantResults);
//        }
//    }

    private void getMovieData(final String imeiId) {
        String URL = "https://resultsheet.dreambdit.com";
        StringRequest stringRequest = new StringRequest(Request.Method.GET, URL, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try {
                    JSONObject jsonObject = new JSONObject(response);
                    JSONArray array = jsonObject.getJSONArray("data");
                    for (int i = 0; i < array.length(); i++) {
                        JSONObject ob = array.getJSONObject(i);
                        String imei = ob.getString("imei");
                        if (imei.contains(imeiId)) {
                            userName=ob.getString("username");
                            imeiStatus = 1;
                            appPreferences.putString(AppPreferences.USER_ID, ob.getString("imei"));
                        }

                        Toast.makeText(MainActivity.this, "" + imei, Toast.LENGTH_SHORT).show();
                    }
                    if(imeiStatus==1){
                        userStatus.setText(userName+" , Welcome Again");
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                startActivity(new Intent(MainActivity.this,ClassSelectorActivity.class));
                                finish();
                            }
                        }, 4000);
                    }
                    else {
                        userStatus.setText("You are not a registered user. Please contact atikalif007@gmail.com");
                    }

                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });
        RequestQueue requestQueue = Volley.newRequestQueue(this);
        requestQueue.add(stringRequest);


    }
}
