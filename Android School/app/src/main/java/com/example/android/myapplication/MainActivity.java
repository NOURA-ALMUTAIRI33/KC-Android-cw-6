package com.example.android.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.service.autofill.TextValueSanitizer;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Student> studentArrayList = new ArrayList<>();
    int currentStudent = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        ImageView studentphoto =findViewById(R.id.i1);
        TextView studentName = findViewById(R.id.Tv3);
        TextView studentage = findViewById(R.id.Tv4);
        Button button = findViewById(R.id.button2);

        ListView listView = findViewById(R.id.save_non_transition_alpha);


         Student s1 = new Student("يوسف",14,R.drawable.boy);
         Student s2 = new Student("سلمان",13,R.drawable.boy1);
         Student s3 = new Student("ماجد",15,R.drawable.boy2);


         studentArrayList.add(s1);
         studentArrayList.add(s2);
         studentArrayList.add(s3);

         studentphoto.setImageResource(studentArrayList.get(currentStudent).getStudentphoto());
         studentName.setText(studentArrayList.get(currentStudent).getStudentName());
         studentage.setText(String.valueOf(studentArrayList.get(currentStudent).getStudentage()));


         button.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 currentStudent++;

                 studentphoto.setImageResource(studentArrayList.get(currentStudent).getStudentphoto());
                 studentName.setText(studentArrayList.get(currentStudent).getStudentName());
                 studentage.setText(String.valueOf(studentArrayList.get(currentStudent).getStudentage()));



             }
         });





    }
}