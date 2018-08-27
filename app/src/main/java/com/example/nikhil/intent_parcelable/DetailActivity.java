package com.example.nikhil.intent_parcelable;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    TextView G_Name,G_Age,G_RollNo;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);


        G_Age = findViewById(R.id.D_Age);
        G_Name = findViewById(R.id.D_Name);
        G_RollNo = findViewById(R.id.D_Roll);

        //collect our intent
        Intent intent = getIntent();
        Student student = intent.getParcelableExtra("Deta");

        //now collect all property values

        Integer age = student.getAge();

        String name = student.getName();

        Integer rollno = student.getRollno();



        G_Name.setText(name);
        G_RollNo.setText(String.valueOf(rollno));
        G_Age.setText(String.valueOf(age));






    }
}
