package com.atikur.resultsheet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class PdfActivity extends AppCompatActivity {

    private TextView school_name,school_address,exam_name;
    private TextView rs_student_name, rs_father_name, rs_mother_name, rs_class_name, rs_session_name, rs_batch_name, rs_student_roll;
    private TextView rs_bangla1st_srijonshil,rs_bangla1st_bohu, rs_bangla1st_total;
//    private TextView rs_bangla2nd_srijonshil, rs_bangla2nd_bohu, rs_bangla2nd_total;
    private TextView rs_bangla_grade_point, rs_bangla_letter_point;
    private TextView rs_english1st_srijonshil, rs_english1st_bohu, rs_english1st_total;
//    private TextView rs_english2nd_srijonshil, rs_english2nd_bohu, rs_english2nd_total;
    private TextView rs_english_grade_point, rs_english_letter_grade;
    private TextView rs_math_srijonshil, rs_math_bohu, rs_math_total, rs_math_grade_point, rs_math_letter_point;
    private TextView rs_science_srijonshil, rs_science_bohu, rs_science_total, rs_science_grade_point, rs_science_letter_point;
    private TextView rs_religion_srijonshil, rs_religion_bohu, rs_religion_total, rs_religion_grade_point, rs_religion_letter_point;
    private TextView rs_ban_world_srijonshil, rs_ban_world_bohu, rs_ban_world_total, rs_ban_world_grade_point, rs_ban_world_letter_point;
    private TextView rs_ict_srijonshil, rs_ict_bohu, rs_ict_total,rs_ict_grade_point, rs_ict_letter_point;
    private TextView rs_agri_srijonshil, rs_agri_bohu, rs_agri_total, rs_agri_grade_point, rs_agri_letter_point;
    private TextView rs_physical_srijonshil, rs_physical_bohu, rs_physical_total, rs_physical_grade_point, rs_physical_letter_point;
    private TextView rs_work_srijonshil, rs_work_bohu, rs_work_total, rs_work_grade_point, rs_work_letter_point;
    private TextView rs_caru_srijonshil, rs_caru_bohu, rs_caru_total,rs_caru_grade_point, rs_caru_letter_point;
    private TextView rs_total_number, rs_total_cgpa;
    private AppPreferences appPreferences = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf);

        appPreferences = new AppPreferences(this);

        school_name=findViewById(R.id.school_name);
        school_name.setText(appPreferences.getString(AppPreferences.SCHOOL_NAME));

        school_address=findViewById(R.id.school_address);
        school_address.setText(appPreferences.getString(AppPreferences.SCHOOL_ADDRESS));

        exam_name=findViewById(R.id.exam_name);
        exam_name.setText(appPreferences.getString(AppPreferences.EXAM_NAME));

        rs_student_name=findViewById(R.id.rs_student_name);
        rs_student_name.setText(getIntent().getStringExtra("student_name"));

        rs_father_name=findViewById(R.id.rs_father_name);
        rs_father_name.setText(getIntent().getStringExtra("student_father_name"));

        rs_mother_name=findViewById(R.id.rs_mother_name);
        rs_mother_name.setText(getIntent().getStringExtra("student_mother_name"));

        rs_class_name=findViewById(R.id.rs_class_name);
        rs_class_name.setText(getIntent().getStringExtra("student_class"));

        rs_session_name=findViewById(R.id.rs_session_name);
        rs_session_name.setText(getIntent().getStringExtra("student_session"));

        rs_batch_name=findViewById(R.id.rs_batch_name);
        rs_batch_name.setText(getIntent().getStringExtra("student_batch"));

        rs_student_roll=findViewById(R.id.rs_student_roll);
        rs_student_roll.setText(getIntent().getStringExtra("student_roll"));

        rs_bangla1st_srijonshil=findViewById(R.id.rs_bangla1st_srijonshil);
        rs_bangla1st_srijonshil.setText(getIntent().getStringExtra("bangla1st_Srijonshil"));

        rs_bangla1st_bohu=findViewById(R.id.rs_bangla1st_bohu);
        rs_bangla1st_total=findViewById(R.id.rs_bangla1st_total);
//        rs_bangla2nd_srijonshil=findViewById(R.id.rs_bangla2nd_srijonshil);
//        rs_bangla2nd_bohu=findViewById(R.id.rs_bangla2nd_bohu);
//        rs_bangla2nd_total=findViewById(R.id.rs_bangla2nd_total);
//        rs_bangla_srijonshil_total=findViewById(R.id.rs_bangla_srijonshil_total);
//        rs_bangla_bohu_total=findViewById(R.id.rs_bangla_bohu_total);
//        rs_bangla_all_total=findViewById(R.id.rs_bangla_all_total);
        rs_bangla_grade_point=findViewById(R.id.rs_bangla_grade_point);
        rs_bangla_letter_point=findViewById(R.id.rs_bangla_letter_point);

        rs_bangla1st_bohu.setText(getIntent().getStringExtra("bangla1st_bohu"));
        rs_bangla1st_total.setText(getIntent().getStringExtra("bangla1st_paper_total"));
//        rs_bangla2nd_srijonshil.setText(getIntent().getStringExtra("bangla2nd_Srijonshil"));
//        rs_bangla2nd_bohu.setText(getIntent().getStringExtra("bangla2nd_bohu"));
//        rs_bangla2nd_total.setText(getIntent().getStringExtra("bangla2nd_paper_total"));
//        rs_bangla_srijonshil_total.setText(getIntent().getStringExtra("bangla_srijon_total"));
//        rs_bangla_bohu_total.setText(getIntent().getStringExtra("bangla_bohu_total"));
//        rs_bangla_all_total.setText(getIntent().getStringExtra("bangla_paper_total"));
        rs_bangla_grade_point.setText(getIntent().getStringExtra("bangla_gradePointValue"));
        rs_bangla_letter_point.setText(getIntent().getStringExtra("bangla_letterPointValue"));

        rs_english1st_srijonshil=findViewById(R.id.rs_english1st_srijonshil);
        rs_english1st_bohu=findViewById(R.id.rs_english1st_bohu);
        rs_english1st_total=findViewById(R.id.rs_english1st_total);
//        rs_english2nd_srijonshil=findViewById(R.id.rs_english2nd_srijonshil);
//        rs_english2nd_bohu=findViewById(R.id.rs_english2nd_bohu);
//        rs_english2nd_total=findViewById(R.id.rs_english2nd_total);
//        rs_english_srijonshil_total=findViewById(R.id.rs_english_srijonshil_total);
//        rs_english_bohu_total=findViewById(R.id.rs_english_bohu_total);
//        rs_english_all_total=findViewById(R.id.rs_english_all_total);
        rs_english_grade_point=findViewById(R.id.rs_english_grade_point);
        rs_english_letter_grade=findViewById(R.id.rs_english_letter_grade);

        rs_english1st_srijonshil.setText(getIntent().getStringExtra("english1st_Srijonshil"));
        rs_english1st_bohu.setText(getIntent().getStringExtra("english1st_bohu"));
        rs_english1st_total.setText(getIntent().getStringExtra("english1st_paper_total"));
//        rs_english2nd_srijonshil.setText(getIntent().getStringExtra("english2nd_Srijonshil"));
//        rs_english2nd_bohu.setText(getIntent().getStringExtra("english2nd_bohu"));
//        rs_english2nd_total.setText(getIntent().getStringExtra("english2nd_paper_total"));
//        rs_english_srijonshil_total.setText(getIntent().getStringExtra("english_srijon_total"));
//        rs_english_bohu_total.setText(getIntent().getStringExtra("english_bohu_total"));
//        rs_english_all_total.setText(getIntent().getStringExtra("english_paper_total"));
        rs_english_grade_point.setText(getIntent().getStringExtra("english_gradePointValue"));
        rs_english_letter_grade.setText(getIntent().getStringExtra("english_letterPointValue"));

        rs_math_srijonshil=findViewById(R.id.rs_math_srijonshil);
        rs_math_bohu=findViewById(R.id.rs_math_bohu);
        rs_math_total=findViewById(R.id.rs_math_total);
        rs_math_grade_point=findViewById(R.id.rs_math_grade_point);
        rs_math_letter_point=findViewById(R.id.rs_math_letter_point);

        rs_math_srijonshil.setText(getIntent().getStringExtra("mathematics_Srijonshil"));
        rs_math_bohu.setText(getIntent().getStringExtra("mathematics_bohu"));
        rs_math_total.setText(getIntent().getStringExtra("mathematics_paper_total"));
        rs_math_grade_point.setText(getIntent().getStringExtra("mathematics_gradePointValue"));
        rs_math_letter_point.setText(getIntent().getStringExtra("mathematics_letterPointValue"));


        rs_science_srijonshil=findViewById(R.id.rs_science_srijonshil);
        rs_science_bohu=findViewById(R.id.rs_science_bohu);
        rs_science_total=findViewById(R.id.rs_science_total);
        rs_science_grade_point=findViewById(R.id.rs_science_grade_point);
        rs_science_letter_point=findViewById(R.id.rs_science_letter_point);

        rs_science_srijonshil.setText(getIntent().getStringExtra("science_Srijon"));
        rs_science_bohu.setText(getIntent().getStringExtra("science_bohunirbaconi"));
        rs_science_total.setText(getIntent().getStringExtra("science_paper_total"));
        rs_science_grade_point.setText(getIntent().getStringExtra("science_gradePointValue"));
        rs_science_letter_point.setText(getIntent().getStringExtra("science_letterPointValue"));

        rs_religion_srijonshil=findViewById(R.id.rs_religion_srijonshil);
        rs_religion_bohu=findViewById(R.id.rs_religion_bohu);
        rs_religion_total=findViewById(R.id.rs_religion_total);
        rs_religion_grade_point=findViewById(R.id.rs_religion_grade_point);
        rs_religion_letter_point=findViewById(R.id.rs_religion_letter_point);

        rs_religion_srijonshil.setText(getIntent().getStringExtra("religion_Srijon"));
        rs_religion_bohu.setText(getIntent().getStringExtra("religion_bohunirbaconi"));
        rs_religion_total.setText(getIntent().getStringExtra("religion_paper_total"));
        rs_religion_grade_point.setText(getIntent().getStringExtra("religion_gradePointValue"));
        rs_religion_letter_point.setText(getIntent().getStringExtra("religion_letterPointValue"));

        rs_ban_world_srijonshil=findViewById(R.id.rs_ban_world_srijonshil);
        rs_ban_world_bohu=findViewById(R.id.rs_ban_world_bohu);
        rs_ban_world_total=findViewById(R.id.rs_ban_world_total);
        rs_ban_world_grade_point=findViewById(R.id.rs_ban_world_grade_point);
        rs_ban_world_letter_point=findViewById(R.id.rs_ban_world_letter_point);

        rs_ban_world_srijonshil.setText(getIntent().getStringExtra("ban_world_Srijon"));
        rs_ban_world_bohu.setText(getIntent().getStringExtra("ban_world_bohunirbaconi"));
        rs_ban_world_total.setText(getIntent().getStringExtra("ban_world_paper_total"));
        rs_ban_world_grade_point.setText(getIntent().getStringExtra("ban_world_gradePointValue"));
        rs_ban_world_letter_point.setText(getIntent().getStringExtra("ban_world_letterPointValue"));

        rs_ict_srijonshil=findViewById(R.id.rs_ict_srijonshil);
        rs_ict_bohu=findViewById(R.id.rs_ict_bohu);
        rs_ict_total=findViewById(R.id.rs_ict_total);
        rs_ict_grade_point=findViewById(R.id.rs_ict_grade_point);
        rs_ict_letter_point=findViewById(R.id.rs_ict_letter_point);

        rs_ict_srijonshil.setText(getIntent().getStringExtra("info_tech_Srijon"));
        rs_ict_bohu.setText(getIntent().getStringExtra("info_tech_bohunirbaconi"));
        rs_ict_total.setText(getIntent().getStringExtra("info_tech_paper_total"));
        rs_ict_grade_point.setText(getIntent().getStringExtra("info_tech_gradePointValue"));
        rs_ict_letter_point.setText(getIntent().getStringExtra("info_tech_letterPointValue"));

        rs_agri_srijonshil=findViewById(R.id.rs_agri_srijonshil);
        rs_agri_bohu=findViewById(R.id.rs_agri_bohu);
        rs_agri_total=findViewById(R.id.rs_agri_total);
        rs_agri_grade_point=findViewById(R.id.rs_agri_grade_point);
        rs_agri_letter_point=findViewById(R.id.rs_agri_letter_point);

        rs_agri_srijonshil.setText(getIntent().getStringExtra("agri_Srijon"));
        rs_agri_bohu.setText(getIntent().getStringExtra("agri_bohunirbaconi"));
        rs_agri_total.setText(getIntent().getStringExtra("agri_paper_total"));
        rs_agri_grade_point.setText(getIntent().getStringExtra("agri_gradePointValue"));
        rs_agri_letter_point.setText(getIntent().getStringExtra("agri_letterPointValue"));

        rs_physical_srijonshil=findViewById(R.id.rs_physical_srijonshil);
        rs_physical_bohu=findViewById(R.id.rs_physical_bohu);
        rs_physical_total=findViewById(R.id.rs_physical_total);
        rs_physical_grade_point=findViewById(R.id.rs_physical_grade_point);
        rs_physical_letter_point=findViewById(R.id.rs_physical_letter_point);

        rs_physical_srijonshil.setText(getIntent().getStringExtra("physical_Srijon"));
        rs_physical_bohu.setText(getIntent().getStringExtra("physical_bohunirbaconi"));
        rs_physical_total.setText(getIntent().getStringExtra("physical_paper_total"));
        rs_physical_grade_point.setText(getIntent().getStringExtra("physical_gradePointValue"));
        rs_physical_letter_point.setText(getIntent().getStringExtra("physical_letterPointValue"));

        rs_work_srijonshil=findViewById(R.id.rs_work_srijonshil);
        rs_work_bohu=findViewById(R.id.rs_work_bohu);
        rs_work_total=findViewById(R.id.rs_work_total);
        rs_work_grade_point=findViewById(R.id.rs_work_grade_point);
        rs_work_letter_point=findViewById(R.id.rs_work_letter_point);

        rs_work_srijonshil.setText(getIntent().getStringExtra("life_Srijon"));
        rs_work_bohu.setText(getIntent().getStringExtra("life_bohunirbaconi"));
        rs_work_total.setText(getIntent().getStringExtra("life_paper_total"));
        rs_work_grade_point.setText(getIntent().getStringExtra("life_gradePointValue"));
        rs_work_letter_point.setText(getIntent().getStringExtra("life_letterPointValue"));

        rs_caru_srijonshil=findViewById(R.id.rs_caru_srijonshil);
        rs_caru_bohu=findViewById(R.id.rs_caru_bohu);
        rs_caru_total=findViewById(R.id.rs_caru_total);
        rs_caru_grade_point=findViewById(R.id.rs_caru_grade_point);
        rs_caru_letter_point=findViewById(R.id.rs_caru_letter_point);

        rs_caru_srijonshil.setText(getIntent().getStringExtra("caru_Srijon"));
        rs_caru_bohu.setText(getIntent().getStringExtra("caru_bohunirbaconi"));
        rs_caru_total.setText(getIntent().getStringExtra("caru_paper_total"));
        rs_caru_grade_point.setText(getIntent().getStringExtra("caru_gradePointValue"));
        rs_caru_letter_point.setText(getIntent().getStringExtra("caru_letterPointValue"));

        rs_total_number=findViewById(R.id.rs_total_number);
        rs_total_cgpa=findViewById(R.id.rs_total_cgpa);

        rs_total_number.setText(getIntent().getStringExtra("stu_total_marks"));
        rs_total_cgpa.setText(getIntent().getStringExtra("stu_total_gradePointValue"));

        Bundle bundles = getIntent().getExtras();


    }
}
