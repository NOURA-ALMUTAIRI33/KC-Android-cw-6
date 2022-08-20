package com.example.myapplicationcw6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Student> studentArrayList = new ArrayList<>();
    int currentStudent = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        ImageView studentphoto =findViewById(R.id.i1);
        TextView studentName = findViewById(R.id.Tv3);
        TextView studentage = findViewById(R.id.Tv4);
        Button button = findViewById(R.id.button2);



        Student s1 = new Student("يوسف",14,R.drawable.boy1);
        Student s2 = new Student("سلمان",13,R.drawable.boyy2);
        Student s3 = new Student("ماجد",15,R.drawable.boy3);


        studentArrayList.add(s1);
        studentArrayList.add(s2);
        studentArrayList.add(s3);

        studentphoto.setImageResource(studentArrayList.get(currentStudent).getStudentphoto());
        studentName.setText(studentArrayList.get(currentStudent).getStudentName());
        studentage.setText(String.valueOf(studentArrayList.get(currentStudent).getStudentAge()));


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currentStudent++;

                studentphoto.setImageResource(studentArrayList.get(currentStudent).getStudentphoto());
                studentName.setText(studentArrayList.get(currentStudent).getStudentName());
                studentage.setText(String.valueOf(studentArrayList.get(currentStudent).getStudentAge()));



            }
        });





























    }
}