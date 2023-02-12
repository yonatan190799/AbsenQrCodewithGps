package com.example.absenqrcodewithgps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnToLoginStudent, btnToLoginLecturer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnToLoginStudent = (Button) findViewById(R.id.btn_to_login_student);
        btnToLoginLecturer = (Button) findViewById(R.id.btn_to_login_lecturer);

        btnToLoginStudent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent OpenLoginStudent = new Intent(getApplicationContext(), LoginStudent.class);
                startActivity(OpenLoginStudent);
            }
        });
        btnToLoginLecturer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent OpenLoginLecturer = new Intent(getApplicationContext(), LoginLecturer.class);
                startActivity(OpenLoginLecturer);
            }
        });
    }
}