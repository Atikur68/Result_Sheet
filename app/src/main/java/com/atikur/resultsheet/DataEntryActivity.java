package com.atikur.resultsheet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class DataEntryActivity extends AppCompatActivity {
    private Button pdfBtn;
    private EditText studentName, fatherName, motherName, className, batch, roll, session;
    private EditText bangla_Srijonshil, bangla_bohu, bangla_prac;
    private EditText bangla2_Srijonshil, bangla2_bohu, bangla2_prac;
    private EditText english_Srijonshil, english_bohu, english_prac;
    private EditText english2_Srijonshil, english2_bohu, english2_prac;
    private EditText math_Srijonshil, math_bohu, math_prac;
    private EditText science_Srijonshil, science_bohu, science_prac;
    private EditText religion_Srijonshil, religion_bohu, religion_prac;
    private EditText ban_world_Srijonshil, ban_world_bohu, ban_world_prac;
    private EditText info_tech_Srijonshil, info_tech_bohu, info_tech_prac;
    private EditText agri_Srijonshil, agri_bohu, agri_prac;
    private EditText physical_Srijonshil, physical_bohu, physical_prac;
    private EditText life_Srijonshil, life_bohu, life_prac;
//    private EditText caru_Srijonshil, caru_bohu, caru_prac;
    private boolean checker = true;
    private static DecimalFormat df2 = new DecimalFormat("#.##");
    private String group,student_class_name;
    private TextView agriculture,science,physical,workable;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_entry);

        studentName = findViewById(R.id.studentName);
        fatherName = findViewById(R.id.fatherName);
        motherName = findViewById(R.id.motherName);
        className = findViewById(R.id.className);
        batch = findViewById(R.id.batch);
        roll = findViewById(R.id.roll);
        session = findViewById(R.id.session);
        bangla_Srijonshil = findViewById(R.id.bangla_Srijonshil);
        bangla_bohu = findViewById(R.id.bangla_bohu);
        bangla_prac = findViewById(R.id.bangla_prac);
        bangla2_Srijonshil = findViewById(R.id.bangla2_Srijonshil);
        bangla2_bohu = findViewById(R.id.bangla2_bohu);
        bangla2_prac = findViewById(R.id.bangla2_prac);
        english_Srijonshil = findViewById(R.id.english_Srijonshil);
        english_bohu = findViewById(R.id.english_bohu);
        english_prac = findViewById(R.id.english_prac);
        english2_Srijonshil = findViewById(R.id.english2_Srijonshil);
        english2_bohu = findViewById(R.id.english2_bohu);
        english2_prac = findViewById(R.id.english2_prac);
        math_Srijonshil = findViewById(R.id.math_Srijonshil);
        math_bohu = findViewById(R.id.math_bohu);
        math_prac = findViewById(R.id.math_prac);
        science_Srijonshil = findViewById(R.id.science_Srijonshil);
        science_bohu = findViewById(R.id.science_bohu);
        science_prac = findViewById(R.id.science_prac);
        religion_Srijonshil = findViewById(R.id.religion_Srijonshil);
        religion_bohu = findViewById(R.id.religion_bohu);
        religion_prac = findViewById(R.id.religion_prac);
        ban_world_Srijonshil = findViewById(R.id.ban_world_Srijonshil);
        ban_world_bohu = findViewById(R.id.ban_world_bohu);
        ban_world_prac = findViewById(R.id.ban_world_prac);
        info_tech_Srijonshil = findViewById(R.id.info_tech_Srijonshil);
        info_tech_bohu = findViewById(R.id.info_tech_bohu);
        info_tech_prac = findViewById(R.id.info_tech_prac);
        agri_Srijonshil = findViewById(R.id.agri_Srijonshil);
        agri_bohu = findViewById(R.id.agri_bohu);
        agri_prac = findViewById(R.id.agri_prac);
        physical_Srijonshil = findViewById(R.id.physical_Srijonshil);
        physical_bohu = findViewById(R.id.physical_bohu);
        physical_prac = findViewById(R.id.physical_prac);
        life_Srijonshil = findViewById(R.id.life_Srijonshil);
        life_bohu = findViewById(R.id.life_bohu);
        life_prac = findViewById(R.id.life_prac);
//        caru_Srijonshil = findViewById(R.id.caru_Srijonshil);
//        caru_bohu = findViewById(R.id.caru_bohu);
//        caru_prac = findViewById(R.id.caru_prac);
        pdfBtn = findViewById(R.id.pdfBtn);
        agriculture = findViewById(R.id.agriculture);
        science = findViewById(R.id.science);
        physical = findViewById(R.id.physical);
        workable = findViewById(R.id.workable);

        className.setText(getIntent().getStringExtra("className"));
        group= getIntent().getStringExtra("group");
        student_class_name= getIntent().getStringExtra("className");

        if(student_class_name.contains("নবম")|| student_class_name.contains("দশম")){
            agriculture.setText("উচ্চতর গনিত / কৃষি শিক্ষা");
            science.setText("রসায়ন / ফিন্যান্স ও ব্যাংকিং / ভূগোল ও পরিবেশ");
            physical.setText("পদার্থ / হিসাব বিজ্ঞান / অর্থনীতি");
            workable.setText("জীব বিজ্ঞান / ব্যবসায় উদ্যোগ / ইতিহাস");
        }

        pdfBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String stu_name = studentName.getText().toString();
                if (stu_name.isEmpty()) {
                    studentName.setError("fill up");
                    checker = false;
                } else {
                    studentName.setError(null);
                    checker = true;
                }
                String stu_father_name = fatherName.getText().toString();
                if (stu_father_name.isEmpty()) {
                    fatherName.setError("fill up");
                    checker = false;
                } else {
                    fatherName.setError(null);
                    checker = true;
                }
                String stu_mother_name = motherName.getText().toString();
                if (stu_mother_name.isEmpty()) {
                    motherName.setError("fill up");
                    checker = false;
                } else {
                    motherName.setError(null);
                    checker = true;
                }

                String stu_batch = batch.getText().toString();
                if (stu_batch.isEmpty()) {
                    batch.setError("fill up");
                    checker = false;
                } else {
                    batch.setError(null);
                    checker = true;
                }
                String stu_roll = roll.getText().toString();
                if (stu_roll.isEmpty()) {
                    roll.setError("fill up");
                    checker = false;
                } else {
                    roll.setError(null);
                    checker = true;
                }
                String stu_session = session.getText().toString();
                if (stu_session.isEmpty()) {
                    session.setError("fill up");
                    checker = false;
                } else {
                    session.setError(null);
                    checker = true;
                }


                String bangla1st_Srijonshil = bangla_Srijonshil.getText().toString();

                if (bangla1st_Srijonshil.isEmpty()) {
                    bangla_Srijonshil.setError("fill up");
                    checker = false;

                } else {
                    bangla_Srijonshil.setError(null);
                    checker = true;
                }

                String bangla1st_bohu = bangla_bohu.getText().toString();
                if (bangla1st_bohu.isEmpty()) {
                    bangla_bohu.setError("fill up");
                    checker = false;
                } else {
                    bangla_bohu.setError(null);
                    checker = true;
                }

                String bangla2nd_Srijonshil = bangla2_Srijonshil.getText().toString();
                if (bangla2nd_Srijonshil.isEmpty()) {
                    bangla2_Srijonshil.setError("fill up");
                    checker = false;
                } else {
                    bangla2_Srijonshil.setError(null);
                    checker = true;
                }
                String bangla2nd_bohu = bangla2_bohu.getText().toString();
                if (bangla2nd_bohu.isEmpty()) {
                    bangla2_bohu.setError("fill up");
                    checker = false;
                } else {
                    bangla2_bohu.setError(null);
                    checker = true;
                }
                String bangla1st_paper_total = "0", bangla2nd_paper_total = "0", bangla_srijon_total = "", bangla_bohu_total = "", bangla_paper_total = "", bangla_gradePointValue = "", bangla_letterPointValue = "";
                int bangla_all_total = 0;
                int bangla1st_total = 0;
                int bangla12nd_total = 0;
                double bangla_grade=0.0;

                if (bangla1st_Srijonshil.isEmpty() || bangla1st_bohu.isEmpty() || bangla2nd_Srijonshil.isEmpty() || bangla2nd_bohu.isEmpty()) {

                } else {
                    bangla1st_total = Integer.parseInt(bangla1st_Srijonshil) + Integer.parseInt(bangla1st_bohu);
                    bangla1st_paper_total = String.valueOf(bangla1st_total);


                    // String bangla2nd_practical= bangla2_prac.getText().toString();
                    bangla12nd_total = Integer.parseInt(bangla2nd_Srijonshil) + Integer.parseInt(bangla2nd_bohu);
                    bangla2nd_paper_total = String.valueOf(bangla12nd_total);

                    bangla_srijon_total = String.valueOf(Integer.parseInt(bangla1st_Srijonshil) + Integer.parseInt(bangla2nd_Srijonshil));
                    bangla_bohu_total = String.valueOf(Integer.parseInt(bangla1st_bohu) + Integer.parseInt(bangla2nd_bohu));
                    bangla_all_total = bangla1st_total + bangla12nd_total;
                    bangla_paper_total = String.valueOf(bangla_all_total);

                    bangla_gradePointValue = gradePoint(bangla_all_total / 2);
                    bangla_grade=gradePointFloat(bangla_all_total / 2);
                    bangla_letterPointValue = letterPoint(bangla_all_total / 2);
                }

                //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

                String english1st_Srijonshil = english_Srijonshil.getText().toString();
                if (english1st_Srijonshil.isEmpty()) {
                    english_Srijonshil.setError("fill up");
                    checker = false;
                } else {
                    english_Srijonshil.setError(null);
                    checker = true;
                }

//                String english1st_bohu = english_bohu.getText().toString();
//                if (english1st_bohu.isEmpty()) {
//                    english_bohu.setError("fill up");
//                    checker = false;
//                } else {
//                    english_bohu.setError(null);
//                    checker = true;
//                }

                String english2nd_Srijonshil = english2_Srijonshil.getText().toString();
                if (english2nd_Srijonshil.isEmpty()) {
                    english2_Srijonshil.setError("fill up");
                    checker = false;
                } else {
                    english2_Srijonshil.setError(null);
                    checker = true;
                }

//                String english2nd_bohu = english2_bohu.getText().toString();
//                if (english2nd_bohu.isEmpty()) {
//                    english2_bohu.setError("fill up");
//                    checker = false;
//                } else {
//                    english2_bohu.setError(null);
//                    checker = true;
//                }

                String english1st_paper_total = "", english2nd_paper_total = "", english_srijon_total = "", english_bohu_total = "", english_paper_total = "", english_gradePointValue = "", english_letterPointValue = "";
                int english_all_total = 0;
                int english1st_total = 0;
                int english2nd_total = 0;
                double english_grade=0.0;

                if (english1st_Srijonshil.isEmpty() || english2nd_Srijonshil.isEmpty()) {
                    //  String english1st_practical= english_prac.getText().toString();

                } else {
                    english1st_total = Integer.parseInt(english1st_Srijonshil);
                    english1st_paper_total = String.valueOf(english1st_total);


                    //  String english2nd_practical= english2_prac.getText().toString();
                    english2nd_total = Integer.parseInt(english2nd_Srijonshil);
                    english2nd_paper_total = String.valueOf(english2nd_total);

                    english_srijon_total = String.valueOf(Integer.parseInt(english1st_Srijonshil) + Integer.parseInt(english2nd_Srijonshil));
                //    english_bohu_total = String.valueOf(Integer.parseInt(english1st_bohu) + Integer.parseInt(english2nd_bohu));
                    english_all_total = english1st_total + english2nd_total;
                    english_paper_total = String.valueOf(english_all_total);

                    english_gradePointValue = gradePoint(english_all_total / 2);
                    english_grade = gradePointFloat(english_all_total / 2);
                    english_letterPointValue = letterPoint(english_all_total / 2);
                }

                //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

                String mathematics_Srijonshil = math_Srijonshil.getText().toString();
                if (mathematics_Srijonshil.isEmpty()) {
                    math_Srijonshil.setError("fill up");
                    checker = false;
                } else {
                    math_Srijonshil.setError(null);
                    checker = true;
                }
                String mathematics_bohu = math_bohu.getText().toString();
                if (mathematics_bohu.isEmpty()) {
                    math_bohu.setError("fill up");
                    checker = false;
                } else {
                    math_bohu.setError(null);
                    checker = true;
                }
                String mathematics_paper_total = "", mathematics_gradePointValue = "", mathematics_letterPointValue = "";
                int mathematics_total = 0;
                double math_grade=0.0;
                if (mathematics_Srijonshil.isEmpty() || mathematics_bohu.isEmpty()) {


                } else {
                    mathematics_total = Integer.parseInt(mathematics_Srijonshil) + Integer.parseInt(mathematics_bohu);
                    mathematics_paper_total = String.valueOf(mathematics_total);

                    mathematics_gradePointValue = gradePoint(mathematics_total);
                    math_grade = gradePointFloat(mathematics_total);
                    mathematics_letterPointValue = letterPoint(mathematics_total);
                }

                /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


                String science_Srijon = science_Srijonshil.getText().toString();
                if (science_Srijon.isEmpty()) {
                    science_Srijonshil.setError("fill up");
                    checker = false;
                } else {
                    science_Srijonshil.setError(null);
                    checker = true;
                }
                String science_bohunirbaconi = science_bohu.getText().toString();
                if (science_bohunirbaconi.isEmpty()) {
                    science_bohu.setError("fill up");
                    checker = false;
                } else {
                    science_bohu.setError(null);
                    checker = true;
                }

                String science_practical = science_prac.getText().toString();
                if (science_practical.isEmpty()) {
                    if(student_class_name.contains("নবম")|| student_class_name.contains("দশম")){
                        science_practical="0";
                    }
                    science_prac.setError("fill up");
                    checker = true;
                } else {
                    science_prac.setError(null);
                    checker = true;
                }

                String science_paper_total = "", science_gradePointValue = "", science_letterPointValue = "";
                int science_total = 0;
                double science_grade = 0.0;
                if (science_Srijon.isEmpty() || science_bohunirbaconi.isEmpty()|| science_practical.isEmpty()) {

                } else {
                    science_total = Integer.parseInt(science_Srijon) + Integer.parseInt(science_bohunirbaconi)+Integer.parseInt(science_practical);
                    science_paper_total = String.valueOf(science_total);

                    science_gradePointValue = gradePoint(science_total);
                    science_grade = gradePointFloat(science_total);
                    science_letterPointValue = letterPoint(science_total);
                }
                /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

                String religion_Srijon = religion_Srijonshil.getText().toString();
                if (religion_Srijon.isEmpty()) {
                    religion_Srijonshil.setError("fill up");
                    checker = false;
                } else {
                    religion_Srijonshil.setError(null);
                    checker = true;
                }
                String religion_bohunirbaconi = religion_bohu.getText().toString();
                if (religion_bohunirbaconi.isEmpty()) {
                    religion_bohu.setError("fill up");
                    checker = false;
                } else {
                    religion_bohu.setError(null);
                    checker = true;
                }
                String religion_paper_total = "", religion_gradePointValue = "", religion_letterPointValue = "";
                int religion_total = 0;
                double religion_grade = 0.0;
                if (religion_Srijon.isEmpty() || religion_bohunirbaconi.isEmpty()) {

                } else {
                    religion_total = Integer.parseInt(religion_Srijon) + Integer.parseInt(religion_bohunirbaconi);
                    religion_paper_total = String.valueOf(religion_total);

                    religion_gradePointValue = gradePoint(religion_total);
                    religion_grade = gradePointFloat(religion_total);
                    religion_letterPointValue = letterPoint(religion_total);
                }
                /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

                String ban_world_Srijon = ban_world_Srijonshil.getText().toString();
                if (ban_world_Srijon.isEmpty()) {
                    ban_world_Srijonshil.setError("fill up");
                    checker = false;
                } else {
                    ban_world_Srijonshil.setError(null);
                    checker = true;
                }
                String ban_world_bohunirbaconi = ban_world_bohu.getText().toString();
                if (ban_world_bohunirbaconi.isEmpty()) {
                    ban_world_bohu.setError("fill up");
                    checker = false;
                } else {
                    ban_world_bohu.setError(null);
                    checker = true;
                }
                String ban_world_paper_total = "", ban_world_gradePointValue = "", ban_world_letterPointValue = "";
                int ban_world_total = 0;
                double ban_world_grade = 0.0;
                if (ban_world_Srijon.isEmpty() || ban_world_bohunirbaconi.isEmpty() ) {

                } else {
                    ban_world_total = Integer.parseInt(ban_world_Srijon) + Integer.parseInt(ban_world_bohunirbaconi);
                    ban_world_paper_total = String.valueOf(ban_world_total);

                    ban_world_gradePointValue = gradePoint(ban_world_total);
                    ban_world_grade = gradePointFloat(ban_world_total);
                    ban_world_letterPointValue = letterPoint(ban_world_total);
                }
                /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

                String info_tech_Srijon = info_tech_Srijonshil.getText().toString();
                if (info_tech_Srijon.isEmpty()) {
                    info_tech_Srijonshil.setError("fill up");
                    checker = false;
                } else {
                    info_tech_Srijonshil.setError(null);
                    checker = true;
                }
                String info_tech_bohunirbaconi = info_tech_bohu.getText().toString();
                if (info_tech_bohunirbaconi.isEmpty()) {
                    info_tech_bohu.setError("fill up");
                    checker = false;
                } else {
                    info_tech_bohu.setError(null);
                    checker = true;
                }

                String info_tech_paper_total = "", info_tech_gradePointValue = "", info_tech_letterPointValue = "";
                int info_tech_total = 0;
                double info_tech_grade = 0.0;
                if (info_tech_Srijon.isEmpty() || info_tech_bohunirbaconi.isEmpty() ) {

                } else {
                    info_tech_total = Integer.parseInt(info_tech_Srijon) + Integer.parseInt(info_tech_bohunirbaconi);
                    info_tech_paper_total = String.valueOf(info_tech_total);

                    info_tech_gradePointValue = gradePoint(2*info_tech_total);
                    info_tech_grade = gradePointFloat(2*info_tech_total);
                    info_tech_letterPointValue = letterPoint(2*info_tech_total);
                }
                /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

                String agri_Srijon = agri_Srijonshil.getText().toString();
                if (agri_Srijon.isEmpty()) {
                    agri_Srijonshil.setError("fill up");
                    checker = false;
                } else {
                    agri_Srijonshil.setError(null);
                    checker = true;
                }
                String agri_bohunirbaconi = agri_bohu.getText().toString();
                if (agri_bohunirbaconi.isEmpty()) {
                    agri_bohu.setError("fill up");
                    checker = false;
                } else {
                    agri_bohu.setError(null);
                    checker = true;
                }

                String agri_practical = agri_prac.getText().toString();
                if (agri_practical.isEmpty()) {
                    if(student_class_name.contains("নবম")|| student_class_name.contains("দশম")){
                        agri_practical="0";
                    }
                    agri_prac.setError("fill up");
                    checker = true;
                } else {
                    agri_prac.setError(null);
                    checker = true;
                }

                String agri_paper_total = "", agri_gradePointValue = "", agri_letterPointValue = "";
                int agri_total = 0;
                double agri_grade = 0.0;
                if (agri_Srijon.isEmpty() || agri_bohunirbaconi.isEmpty() || agri_practical.isEmpty()) {

                } else {
                    agri_total = Integer.parseInt(agri_Srijon) + Integer.parseInt(agri_bohunirbaconi)+ Integer.parseInt(agri_practical);
                    agri_paper_total = String.valueOf(agri_total);

                    agri_gradePointValue = gradePoint(agri_total);
                    agri_grade = gradePointFloat(agri_total);
                    agri_letterPointValue = letterPoint(agri_total);
                }
                /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

                String physical_Srijon = physical_Srijonshil.getText().toString();
                if (physical_Srijon.isEmpty()) {
                    physical_Srijonshil.setError("fill up");
                    checker = false;
                } else {
                    physical_Srijonshil.setError(null);
                    checker = true;
                }
                String physical_bohunirbaconi = physical_bohu.getText().toString();
                if (physical_bohunirbaconi.isEmpty()) {
                    physical_bohu.setError("fill up");
                    checker = false;
                } else {
                    physical_bohu.setError(null);
                    checker = true;
                }

                String physical_practical= physical_prac.getText().toString();
                if (physical_practical.isEmpty()) {
                    if(student_class_name.contains("নবম")|| student_class_name.contains("দশম")){
                        physical_practical="0";
                    }
                    physical_prac.setError("fill up");
                    checker = true;
                } else {
                    physical_prac.setError(null);
                    checker = true;
                }

                String physical_paper_total = "", physical_gradePointValue = "", physical_letterPointValue = "";
                int physical_total = 0;
                double physical_grade = 0.0;
                if (physical_Srijon.isEmpty() || physical_bohunirbaconi.isEmpty() || physical_practical.isEmpty()) {

                } else {
                    physical_total = Integer.parseInt(physical_Srijon) + Integer.parseInt(physical_bohunirbaconi)+ Integer.parseInt(physical_practical);
                    physical_paper_total = String.valueOf(physical_total);

                    physical_gradePointValue = gradePoint(physical_total);
                    physical_grade = gradePointFloat(physical_total);
                    physical_letterPointValue = letterPoint(physical_total);
                }
                /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

                String life_practical = life_prac.getText().toString();
                if (life_practical.isEmpty()) {
                    if(student_class_name.contains("নবম")|| student_class_name.contains("দশম")){
                        life_practical="0";
                    }
                    life_prac.setError("fill up");
                    checker = true;
                } else {
                    life_prac.setError(null);
                    checker = true;
                }

                String life_Srijon = life_Srijonshil.getText().toString();
                if (life_Srijon.isEmpty()) {
                    life_Srijonshil.setError("fill up");
                    checker = false;
                } else {
                    life_Srijonshil.setError(null);
                    checker = true;
                }
                String life_bohunirbaconi = life_bohu.getText().toString();
                if (life_bohunirbaconi.isEmpty()) {
                    life_bohu.setError("fill up");
                    checker = false;
                } else {
                    life_bohu.setError(null);
                    checker = true;
                }




                String life_paper_total = "", life_gradePointValue = "", life_letterPointValue = "";
                int life_total = 0;
                double life_grade = 0.0;
                if (life_Srijon.isEmpty() || life_bohunirbaconi.isEmpty() || life_practical.isEmpty()) {

                } else {
                    life_total = Integer.parseInt(life_Srijon) + Integer.parseInt(life_bohunirbaconi)+ Integer.parseInt(life_practical);
                    life_paper_total = String.valueOf(life_total);

                    life_gradePointValue = gradePoint(life_total);
                    life_grade = gradePointFloat(life_total);
                    life_letterPointValue = letterPoint(life_total);
                }
                /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//                String caru_Srijon = caru_Srijonshil.getText().toString();
//                if (caru_Srijon.isEmpty()) {
//                    caru_Srijonshil.setError("fill up");
//                    checker = false;
//                } else {
//                    caru_Srijonshil.setError(null);
//                    checker = true;
//                }
//                String caru_bohunirbaconi = caru_bohu.getText().toString();
//                if (caru_bohunirbaconi.isEmpty()) {
//                    caru_bohu.setError("fill up");
//                    checker = false;
//                } else {
//                    caru_bohu.setError(null);
//                    checker = true;
//                }
//
//                String caru_paper_total = "", caru_gradePointValue = "", caru_letterPointValue = "";
//                int caru_total = 0;
//                if (caru_Srijon.isEmpty() || caru_bohunirbaconi.isEmpty() ) {
//
//
//                } else {
//                    caru_total = Integer.parseInt(caru_Srijon) + Integer.parseInt(caru_bohunirbaconi);
//                    caru_paper_total = String.valueOf(caru_total);
//
//                    caru_gradePointValue = gradePoint(caru_total);
//                    caru_letterPointValue = letterPoint(caru_total);
//                }
                /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

               if(checker) {

                   int total_marks = bangla_all_total + english_all_total + mathematics_total + science_total + religion_total + ban_world_total + info_tech_total + agri_total +
                           physical_total + life_total;
                   String stu_total_marks = String.valueOf(total_marks);


                   double stu_total_gradePoint = bangla_grade+english_grade+math_grade+life_grade+physical_grade+agri_grade+info_tech_grade+ban_world_grade+religion_grade+science_grade;
                   String stu_total_gradePointValue = String.valueOf(df2.format(stu_total_gradePoint / 9));
                   String stu_total_letterPointValue = letterPoint(total_marks / 10);

                   ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

                   Intent i = new Intent(DataEntryActivity.this, PdfActivity.class);
                   i.putExtra("student_name", stu_name);
                   i.putExtra("student_father_name", stu_father_name);
                   i.putExtra("student_mother_name", stu_mother_name);
                   i.putExtra("student_class", className.getText().toString());
                   i.putExtra("student_group", group);
                   i.putExtra("student_session", stu_session);
                   i.putExtra("student_batch", stu_batch);
                   i.putExtra("student_roll", stu_roll);

                   i.putExtra("bangla1st_Srijonshil", bangla1st_Srijonshil);
                   i.putExtra("bangla1st_bohu", bangla1st_bohu);
                   i.putExtra("bangla1st_paper_total", bangla1st_paper_total);
                   i.putExtra("bangla2nd_Srijonshil", bangla2nd_Srijonshil);
                   i.putExtra("bangla2nd_bohu", bangla2nd_bohu);
                   i.putExtra("bangla2nd_paper_total", bangla2nd_paper_total);
                   i.putExtra("bangla_srijon_total", bangla_srijon_total);
                   i.putExtra("bangla_bohu_total", bangla_bohu_total);
                   i.putExtra("bangla_paper_total", bangla_paper_total);
                   i.putExtra("bangla_gradePointValue", bangla_gradePointValue);
                   i.putExtra("bangla_letterPointValue", bangla_letterPointValue);

                   i.putExtra("english1st_Srijonshil", english1st_Srijonshil);
              //     i.putExtra("english1st_bohu", english1st_bohu);
                   i.putExtra("english1st_paper_total", english1st_paper_total);
                   i.putExtra("english2nd_Srijonshil", english2nd_Srijonshil);
              //     i.putExtra("english2nd_bohu", english2nd_bohu);
                   i.putExtra("english2nd_paper_total", english2nd_paper_total);
                   i.putExtra("english_srijon_total", english_srijon_total);
              //     i.putExtra("english_bohu_total", english_bohu_total);
                   i.putExtra("english_paper_total", english_paper_total);
                   i.putExtra("english_gradePointValue", english_gradePointValue);
                   i.putExtra("english_letterPointValue", english_letterPointValue);

                   i.putExtra("mathematics_Srijonshil", mathematics_Srijonshil);
                   i.putExtra("mathematics_bohu", mathematics_bohu);
                   i.putExtra("mathematics_paper_total", mathematics_paper_total);
                   i.putExtra("mathematics_gradePointValue", mathematics_gradePointValue);
                   i.putExtra("mathematics_letterPointValue", mathematics_letterPointValue);

                   i.putExtra("science_Srijon", science_Srijon);
                   i.putExtra("science_bohunirbaconi", science_bohunirbaconi);
                   i.putExtra("science_practical", science_practical);
                   i.putExtra("science_paper_total", science_paper_total);
                   i.putExtra("science_gradePointValue", science_gradePointValue);
                   i.putExtra("science_letterPointValue", science_letterPointValue);

                   i.putExtra("religion_Srijon", religion_Srijon);
                   i.putExtra("religion_bohunirbaconi", religion_bohunirbaconi);
                   i.putExtra("religion_paper_total", religion_paper_total);
                   i.putExtra("religion_gradePointValue", religion_gradePointValue);
                   i.putExtra("religion_letterPointValue", religion_letterPointValue);

                   i.putExtra("ban_world_Srijon", ban_world_Srijon);
                   i.putExtra("ban_world_bohunirbaconi", ban_world_bohunirbaconi);
                   i.putExtra("ban_world_paper_total", ban_world_paper_total);
                   i.putExtra("ban_world_gradePointValue", ban_world_gradePointValue);
                   i.putExtra("ban_world_letterPointValue", ban_world_letterPointValue);

                   i.putExtra("info_tech_Srijon", info_tech_Srijon);
                   i.putExtra("info_tech_bohunirbaconi", info_tech_bohunirbaconi);
                   i.putExtra("info_tech_paper_total", info_tech_paper_total);
                   i.putExtra("info_tech_gradePointValue", info_tech_gradePointValue);
                   i.putExtra("info_tech_letterPointValue", info_tech_letterPointValue);

                   i.putExtra("agri_Srijon", agri_Srijon);
                   i.putExtra("agri_bohunirbaconi", agri_bohunirbaconi);
                   i.putExtra("agri_practical", agri_practical);
                   i.putExtra("agri_paper_total", agri_paper_total);
                   i.putExtra("agri_gradePointValue", agri_gradePointValue);
                   i.putExtra("agri_letterPointValue", agri_letterPointValue);

                   i.putExtra("physical_Srijon", physical_Srijon);
                   i.putExtra("physical_bohunirbaconi", physical_bohunirbaconi);
                   i.putExtra("physical_practical", physical_practical);
                   i.putExtra("physical_paper_total", physical_paper_total);
                   i.putExtra("physical_gradePointValue", physical_gradePointValue);
                   i.putExtra("physical_letterPointValue", physical_letterPointValue);

                   i.putExtra("life_Srijon", life_Srijon);
                   i.putExtra("life_bohunirbaconi", life_bohunirbaconi);
                   i.putExtra("life_practical", life_practical);
                   i.putExtra("life_paper_total", life_paper_total);
                   i.putExtra("life_gradePointValue", life_gradePointValue);
                   i.putExtra("life_letterPointValue", life_letterPointValue);

//                   i.putExtra("caru_Srijon", caru_Srijon);
//                   i.putExtra("caru_bohunirbaconi", caru_bohunirbaconi);
//                   i.putExtra("caru_paper_total", caru_paper_total);
//                   i.putExtra("caru_gradePointValue", caru_gradePointValue);
//                   i.putExtra("caru_letterPointValue", caru_letterPointValue);

                   i.putExtra("stu_total_marks", stu_total_marks);
                   i.putExtra("stu_total_gradePointValue", stu_total_gradePointValue);


                   startActivity(i);
               }
            }
        });
    }

    public String gradePoint(int value) {

        String grade = "";

        if (value >= 80 && value <= 100)
            grade = "5";
        else if (value >= 70 && value <= 79)
            grade = "4";
        else if (value >= 60 && value <= 69)
            grade = "3.5";
        else if (value >= 50 && value <= 59)
            grade = "3";
        else if (value >= 40 && value <= 49)
            grade = "2";
        else if (value >= 33 && value <= 39)
            grade = "1";
        else
            grade = "0";

        return grade;
    }

    public String letterPoint(int value) {

        String grade = "";

        if (value >= 80 && value <= 100)
            grade = "A+";
        else if (value >= 70 && value <= 79)
            grade = "A";
        else if (value >= 60 && value <= 69)
            grade = "A-";
        else if (value >= 50 && value <= 59)
            grade = "B";
        else if (value >= 40 && value <= 49)
            grade = "C";
        else if (value >= 33 && value <= 39)
            grade = "D";
        else
            grade = "F";

        return grade;
    }

    public double gradePointFloat(double value) {

        double grade =0.0;

        if (value >= 80 && value <= 100)
            grade = 5.0;
        else if (value >= 70 && value <= 79)
            grade = 4.0;
        else if (value >= 60 && value <= 69)
            grade = 3.5;
        else if (value >= 50 && value <= 59)
            grade = 3.0;
        else if (value >= 40 && value <= 49)
            grade = 2.0;
        else if (value >= 33 && value <= 39)
            grade = 1.0;
        else
            grade = 0.0;

        return grade;
    }
}
