package com.example.crownofficial;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;


public class MainActivity extends AppCompatActivity {



    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        // gets ride of top bar with application name
        getSupportActionBar().hide();
        // gets ride of top bar with time, date, charge, etc.
        //getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        LinearLayout dashboardView = (LinearLayout) findViewById (R.id.dashboardDivide);
        LinearLayout galleryView = (LinearLayout) findViewById (R.id.galleryDivide);
        LinearLayout calendarView = (LinearLayout) findViewById (R.id.calendarDivide);
        LinearLayout generalView = (LinearLayout) findViewById (R.id.generalDivide);



        dashboardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDashboardActivity();
            }
        });
        galleryView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGalleryActivity();
            }
        });
        calendarView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCalendarActivity();
            }
        });
        generalView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDashboardActivity();
            }
        });

    }

    public void openDashboardActivity() {
        Intent intent = new Intent(this, dashboardActivity.class);
        startActivity(intent);
    }

    public void openGalleryActivity() {
        Intent intent = new Intent(this, galleryActivity.class);
        startActivity(intent);
    }

    public void openCalendarActivity() {
        Intent intent = new Intent(this, calendarActivity.class);
        startActivity(intent);
    }
}
