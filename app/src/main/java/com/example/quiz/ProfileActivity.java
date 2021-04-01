package com.example.quiz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
    }

    public void Back(View view) {
        Intent b = new Intent(com.example.quiz.ProfileActivity.this, com.example.quiz.MainActivity.class );
        b.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(b);
    }

    public void ClickLogout(View view) {
        com.example.quiz.MainActivity.logout(this);

    }
}


