package com.atikur.resultsheet;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import static android.Manifest.permission.ACCESS_FINE_LOCATION;
import static android.Manifest.permission.INTERNET;
import static android.Manifest.permission.READ_CONTACTS;
import static android.Manifest.permission.READ_PHONE_STATE;
import static android.Manifest.permission.WRITE_EXTERNAL_STORAGE;

public class ClassSelectorActivity extends AppCompatActivity {

    private Button six, seven, eight, nine, ten, editBtn, okBtn,btn_science_nine,btn_humani_nine,btn_arts_nine,btn_science_ten,btn_humani_ten,btn_arts_ten;
    private EditText edtSchoolName, edtSchoolAddress, edtExamName;
    private TextView txtSchoolName, txtSchoolAddress, txtExamName;
    private LinearLayout schoolInfo, schoolInfoEdit;
    private AppPreferences appPreferences = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class_selector);



        six = findViewById(R.id.six);
        seven = findViewById(R.id.seven);
        eight = findViewById(R.id.eight);
        nine = findViewById(R.id.nine);
        ten = findViewById(R.id.ten);
        editBtn = findViewById(R.id.editBtn);
        okBtn = findViewById(R.id.okBtn);
        edtSchoolName = findViewById(R.id.edtSchoolName);
        edtSchoolAddress = findViewById(R.id.edtSchoolAddress);
        edtExamName = findViewById(R.id.edtExamName);
        txtSchoolName = findViewById(R.id.txtSchoolName);
        txtSchoolAddress = findViewById(R.id.txtSchoolAddress);
        txtExamName = findViewById(R.id.txtExamName);
        schoolInfoEdit = findViewById(R.id.schoolInfoEdit);
        schoolInfo = findViewById(R.id.schoolInfo);
        btn_arts_ten = findViewById(R.id.btn_arts_ten);
        btn_humani_ten = findViewById(R.id.btn_humani_ten);
        btn_science_ten = findViewById(R.id.btn_science_ten);
        btn_arts_nine = findViewById(R.id.btn_arts_nine);
        btn_humani_nine = findViewById(R.id.btn_humani_nine);
        btn_science_nine = findViewById(R.id.btn_science_nine);



        appPreferences = new AppPreferences(this);



        if (appPreferences.getString(AppPreferences.SCHOOL_NAME) == null) {
            schoolInfoEdit.setVisibility(View.VISIBLE);
            okBtn.setVisibility(View.VISIBLE);
        } else {
            schoolInfoEdit.setVisibility(View.GONE);
            okBtn.setVisibility(View.GONE);
            schoolInfo.setVisibility(View.VISIBLE);
            editBtn.setVisibility(View.VISIBLE);
            txtSchoolName.setText(appPreferences.getString(AppPreferences.SCHOOL_NAME));
            txtSchoolAddress.setText(appPreferences.getString(AppPreferences.SCHOOL_ADDRESS));
            txtExamName.setText(appPreferences.getString(AppPreferences.EXAM_NAME));
        }




        editBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                schoolInfoEdit.setVisibility(View.VISIBLE);
                okBtn.setVisibility(View.VISIBLE);

                edtSchoolName.setText(appPreferences.getString(AppPreferences.SCHOOL_NAME));
                edtSchoolAddress.setText(appPreferences.getString(AppPreferences.SCHOOL_ADDRESS));
                edtExamName.setText(appPreferences.getString(AppPreferences.EXAM_NAME));

                schoolInfo.setVisibility(View.GONE);
                editBtn.setVisibility(View.GONE);
            }
        });


        okBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String school_name = edtSchoolName.getText().toString();
                String school_address = edtSchoolAddress.getText().toString();
                String exam_name = edtExamName.getText().toString();

                appPreferences.putString(AppPreferences.SCHOOL_NAME, school_name);
                appPreferences.putString(AppPreferences.SCHOOL_ADDRESS, school_address);
                appPreferences.putString(AppPreferences.EXAM_NAME, exam_name);

                schoolInfoEdit.setVisibility(View.GONE);
                okBtn.setVisibility(View.GONE);

                txtSchoolName.setText(school_name);
                txtSchoolAddress.setText(school_address);
                txtExamName.setText(exam_name);

                schoolInfo.setVisibility(View.VISIBLE);
                editBtn.setVisibility(View.VISIBLE);
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(ClassSelectorActivity.this, DataEntryActivity.class);
                i.putExtra("className","ষষ্ঠ");
                startActivity(i);
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(ClassSelectorActivity.this, DataEntryActivity.class);
                i.putExtra("className","সপ্তম");
                startActivity(i);
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(ClassSelectorActivity.this, DataEntryActivity.class);
                i.putExtra("className","অষ্টম");
                startActivity(i);
            }
        });


        btn_science_nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(ClassSelectorActivity.this, DataEntryActivity.class);
                i.putExtra("className","নবম");
                i.putExtra("group","বিজ্ঞান");
                startActivity(i);
            }
        });

        btn_humani_nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(ClassSelectorActivity.this, DataEntryActivity.class);
                i.putExtra("className","নবম");
                i.putExtra("group","ব্যবসায় শিক্ষা");
                startActivity(i);
            }
        });

        btn_arts_nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(ClassSelectorActivity.this, DataEntryActivity.class);
                i.putExtra("className","নবম");
                i.putExtra("group","মানবিক");
                startActivity(i);
            }
        });

        btn_science_ten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(ClassSelectorActivity.this, DataEntryActivity.class);
                i.putExtra("className","দশম");
                i.putExtra("group","বিজ্ঞান");
                startActivity(i);
            }
        });

        btn_humani_ten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(ClassSelectorActivity.this, DataEntryActivity.class);
                i.putExtra("className","দশম");
                i.putExtra("group","্যবসায় শিক্ষা");
                startActivity(i);
            }
        });

        btn_arts_ten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(ClassSelectorActivity.this, DataEntryActivity.class);
                i.putExtra("className","দশম");
                i.putExtra("group","মানবিক");
                startActivity(i);
            }
        });



    }



}
