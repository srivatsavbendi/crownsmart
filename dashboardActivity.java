package com.example.crownofficial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class dashboardActivity extends AppCompatActivity {
    private DatabaseReference refDatabase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        refDatabase = FirebaseDatabase.getInstance().getReference();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        // gets ride of top bar with application name
        getSupportActionBar().hide();
        // gets ride of top bar with time, date, charge, etc.
        //getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        LinearLayout homeView = (LinearLayout) findViewById (R.id.homeDivide);
        LinearLayout defaultView = (LinearLayout) findViewById (R.id.pictureDivide);
        ImageView dashboardView = (ImageView) findViewById (R.id.dashboardDividepicture);
        LinearLayout customView = (LinearLayout) findViewById (R.id.editDivide);
        TextView custom1View = (TextView) findViewById (R.id.add);
        TextView custom2View = (TextView) findViewById (R.id.painting2);
        TextView custom3View = (TextView) findViewById (R.id.delete);

        homeView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHomeActivity();
            }
        });

        defaultView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                defaultColor();
            }
        });

        custom1View.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                custom1Click();
            }
        });

        custom2View.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                custom2Click();
            }
        });

        custom3View.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                custom3Click();
            }
        });



    }

    public void openHomeActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        LinearLayout homeView = (LinearLayout) findViewById (R.id.homeDivide);
        LinearLayout defaultView = (LinearLayout) findViewById (R.id.pictureDivide);
        ImageView dashboardView = (ImageView) findViewById (R.id.dashboardDividepicture);
        LinearLayout customView = (LinearLayout) findViewById (R.id.editDivide);
        TextView custom1View = (TextView) findViewById (R.id.add);
        TextView custom2View = (TextView) findViewById (R.id.painting2);
        TextView custom3View = (TextView) findViewById (R.id.delete);
        defaultView.setBackgroundColor(Color.parseColor("#212121"));
        customView.setBackgroundColor(Color.parseColor("#212121"));
        custom1View.setTextColor(Color.parseColor("#FFFFFF"));
        custom2View.setTextColor(Color.parseColor("#FFFFFF"));
        custom3View.setTextColor(Color.parseColor("#FFFFFF"));

    }

    public void defaultColor() {
        LinearLayout homeView = (LinearLayout) findViewById (R.id.homeDivide);
        LinearLayout defaultView = (LinearLayout) findViewById (R.id.pictureDivide);
        ImageView dashboardView = (ImageView) findViewById (R.id.dashboardDividepicture);
        LinearLayout customView = (LinearLayout) findViewById (R.id.editDivide);
        TextView custom1View = (TextView) findViewById (R.id.add);
        TextView custom2View = (TextView) findViewById (R.id.painting2);
        TextView custom3View = (TextView) findViewById (R.id.delete);
        defaultView.setBackgroundColor(Color.parseColor("#C31709"));
        customView.setBackgroundColor(Color.parseColor("#212121"));
        custom1View.setTextColor(Color.parseColor("#FFFFFF"));
        custom2View.setTextColor(Color.parseColor("#FFFFFF"));
        custom3View.setTextColor(Color.parseColor("#FFFFFF"));
        dashboardView.setImageResource(R.drawable.defaultscreen);
        refDatabase.child("Mirror1").child("Mode").setValue("default");

    }
    public void custom1Click() {
        LinearLayout homeView = (LinearLayout) findViewById (R.id.homeDivide);
        LinearLayout defaultView = (LinearLayout) findViewById (R.id.pictureDivide);
        ImageView dashboardView = (ImageView) findViewById (R.id.dashboardDividepicture);
        LinearLayout customView = (LinearLayout) findViewById (R.id.editDivide);
        TextView custom1View = (TextView) findViewById (R.id.add);
        TextView custom2View = (TextView) findViewById (R.id.painting2);
        TextView custom3View = (TextView) findViewById (R.id.delete);
        defaultView.setBackgroundColor(Color.parseColor("#212121"));
        customView.setBackgroundColor(Color.parseColor("#C31709"));
        custom1View.setTextColor(Color.parseColor("#FFFFFF"));
        custom2View.setTextColor(Color.parseColor("#C31709"));
        custom3View.setTextColor(Color.parseColor("#C31709"));
        dashboardView.setImageResource(R.drawable.customone);
        refDatabase.child("Mirror1").child("Mode").setValue("custom1");

    }

    public void custom2Click() {
        LinearLayout homeView = (LinearLayout) findViewById (R.id.homeDivide);
        LinearLayout defaultView = (LinearLayout) findViewById (R.id.pictureDivide);
        ImageView dashboardView = (ImageView) findViewById (R.id.dashboardDividepicture);
        LinearLayout customView = (LinearLayout) findViewById (R.id.editDivide);
        TextView custom1View = (TextView) findViewById (R.id.add);
        TextView custom2View = (TextView) findViewById (R.id.painting2);
        TextView custom3View = (TextView) findViewById (R.id.delete);
        defaultView.setBackgroundColor(Color.parseColor("#212121"));
        customView.setBackgroundColor(Color.parseColor("#C31709"));
        custom1View.setTextColor(Color.parseColor("#C31709"));
        custom2View.setTextColor(Color.parseColor("#FFFFFF"));
        custom3View.setTextColor(Color.parseColor("#C31709"));
        dashboardView.setImageResource(R.drawable.customtwo);
        refDatabase.child("Mirror1").child("Mode").setValue("custom2");
    }

    public void custom3Click() {
        LinearLayout homeView = (LinearLayout) findViewById (R.id.homeDivide);
        LinearLayout defaultView = (LinearLayout) findViewById (R.id.pictureDivide);
        ImageView dashboardView = (ImageView) findViewById (R.id.dashboardDividepicture);
        LinearLayout customView = (LinearLayout) findViewById (R.id.editDivide);
        TextView custom1View = (TextView) findViewById (R.id.add);
        TextView custom2View = (TextView) findViewById (R.id.painting2);
        TextView custom3View = (TextView) findViewById (R.id.delete);
        defaultView.setBackgroundColor(Color.parseColor("#212121"));
        customView.setBackgroundColor(Color.parseColor("#C31709"));
        custom1View.setTextColor(Color.parseColor("#C31709"));
        custom2View.setTextColor(Color.parseColor("#C31709"));
        custom3View.setTextColor(Color.parseColor("#FFFFFF"));
        dashboardView.setImageResource(R.drawable.customthree);
        refDatabase.child("Mirror1").child("Mode").setValue("custom3");

    }



}
