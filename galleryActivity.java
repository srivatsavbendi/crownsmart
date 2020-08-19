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

public class galleryActivity extends AppCompatActivity {
    private DatabaseReference refDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        refDatabase = FirebaseDatabase.getInstance().getReference();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        // gets ride of top bar with application name
        getSupportActionBar().hide();
        // gets ride of top bar with time, date, charge, etc.
        //getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        LinearLayout homeView = (LinearLayout) findViewById (R.id.homeDivide);
        ImageView galleryView = (ImageView) findViewById (R.id.galleryDividepicture);
        LinearLayout slideshowView = (LinearLayout) findViewById (R.id.slideshowDivide);
        LinearLayout ownView = (LinearLayout) findViewById (R.id.ownDivide);
        LinearLayout paintingView = (LinearLayout) findViewById (R.id.editDivide);
        TextView painting1View = (TextView) findViewById (R.id.add);
        TextView painting2View = (TextView) findViewById (R.id.painting2);
        TextView painting3View = (TextView) findViewById (R.id.delete);
        TextView painting4View = (TextView) findViewById (R.id.painting4);
        TextView painting5View = (TextView) findViewById (R.id.painting5);


        homeView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHomeActivity();
            }
        });

        slideshowView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickSlideshow();
            }
        });

        ownView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickOwn();
            }
        });

        painting1View.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickPainting1();
            }
        });

        painting2View.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickPainting2();
            }
        });

        painting3View.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickPainting3();
            }
        });

        painting4View.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickPainting4();
            }
        });

        painting5View.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickPainting5();
            }
        });



    }


    public void openHomeActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        LinearLayout homeView = (LinearLayout) findViewById (R.id.homeDivide);
        ImageView galleryView = (ImageView) findViewById (R.id.galleryDividepicture);
        LinearLayout slideshowView = (LinearLayout) findViewById (R.id.slideshowDivide);
        LinearLayout ownView = (LinearLayout) findViewById (R.id.ownDivide);
        LinearLayout paintingView = (LinearLayout) findViewById (R.id.editDivide);
        TextView painting1View = (TextView) findViewById (R.id.add);
        TextView painting2View = (TextView) findViewById (R.id.painting2);
        TextView painting3View = (TextView) findViewById (R.id.delete);
        TextView painting4View = (TextView) findViewById (R.id.painting4);
        TextView painting5View = (TextView) findViewById (R.id.painting5);
        galleryView.setBackgroundColor(Color.parseColor("#212121"));
        slideshowView.setBackgroundColor(Color.parseColor("#212121"));
        ownView.setBackgroundColor(Color.parseColor("#212121"));
        paintingView.setBackgroundColor(Color.parseColor("#212121"));
        painting1View.setTextColor(Color.parseColor("#FFFFFF"));
        painting2View.setTextColor(Color.parseColor("#FFFFFF"));
        painting3View.setTextColor(Color.parseColor("#FFFFFF"));
        painting4View.setTextColor(Color.parseColor("#FFFFFF"));
        painting5View.setTextColor(Color.parseColor("#FFFFFF"));
    }

    public void clickSlideshow() {
        LinearLayout homeView = (LinearLayout) findViewById (R.id.homeDivide);
        ImageView galleryView = (ImageView) findViewById (R.id.galleryDividepicture);
        LinearLayout slideshowView = (LinearLayout) findViewById (R.id.slideshowDivide);
        LinearLayout ownView = (LinearLayout) findViewById (R.id.ownDivide);
        LinearLayout paintingView = (LinearLayout) findViewById (R.id.editDivide);
        TextView painting1View = (TextView) findViewById (R.id.add);
        TextView painting2View = (TextView) findViewById (R.id.painting2);
        TextView painting3View = (TextView) findViewById (R.id.delete);
        TextView painting4View = (TextView) findViewById (R.id.painting4);
        TextView painting5View = (TextView) findViewById (R.id.painting5);
        galleryView.setBackgroundColor(Color.parseColor("#212121"));
        slideshowView.setBackgroundColor(Color.parseColor("#C31709"));
        ownView.setBackgroundColor(Color.parseColor("#212121"));
        paintingView.setBackgroundColor(Color.parseColor("#212121"));
        painting1View.setTextColor(Color.parseColor("#FFFFFF"));
        painting2View.setTextColor(Color.parseColor("#FFFFFF"));
        painting3View.setTextColor(Color.parseColor("#FFFFFF"));
        painting4View.setTextColor(Color.parseColor("#FFFFFF"));
        painting5View.setTextColor(Color.parseColor("#FFFFFF"));
        refDatabase.child("Mirror1").child("Mode").setValue("Slideshow");

    }

    public void clickOwn() {
        LinearLayout homeView = (LinearLayout) findViewById (R.id.homeDivide);
        ImageView galleryView = (ImageView) findViewById (R.id.galleryDividepicture);
        LinearLayout slideshowView = (LinearLayout) findViewById (R.id.slideshowDivide);
        LinearLayout ownView = (LinearLayout) findViewById (R.id.ownDivide);
        LinearLayout paintingView = (LinearLayout) findViewById (R.id.editDivide);
        TextView painting1View = (TextView) findViewById (R.id.add);
        TextView painting2View = (TextView) findViewById (R.id.painting2);
        TextView painting3View = (TextView) findViewById (R.id.delete);
        TextView painting4View = (TextView) findViewById (R.id.painting4);
        TextView painting5View = (TextView) findViewById (R.id.painting5);
        galleryView.setBackgroundColor(Color.parseColor("#212121"));
        slideshowView.setBackgroundColor(Color.parseColor("#212121"));
        ownView.setBackgroundColor(Color.parseColor("#C31709"));
        paintingView.setBackgroundColor(Color.parseColor("#212121"));
        painting1View.setTextColor(Color.parseColor("#FFFFFF"));
        painting2View.setTextColor(Color.parseColor("#FFFFFF"));
        painting3View.setTextColor(Color.parseColor("#FFFFFF"));
        painting4View.setTextColor(Color.parseColor("#FFFFFF"));
        painting5View.setTextColor(Color.parseColor("#FFFFFF"));
    }

    public void clickPainting1() {
        LinearLayout homeView = (LinearLayout) findViewById (R.id.homeDivide);
        ImageView galleryView = (ImageView) findViewById (R.id.galleryDividepicture);
        LinearLayout slideshowView = (LinearLayout) findViewById (R.id.slideshowDivide);
        LinearLayout ownView = (LinearLayout) findViewById (R.id.ownDivide);
        LinearLayout paintingView = (LinearLayout) findViewById (R.id.editDivide);
        TextView painting1View = (TextView) findViewById (R.id.add);
        TextView painting2View = (TextView) findViewById (R.id.painting2);
        TextView painting3View = (TextView) findViewById (R.id.delete);
        TextView painting4View = (TextView) findViewById (R.id.painting4);
        TextView painting5View = (TextView) findViewById (R.id.painting5);
        galleryView.setBackgroundColor(Color.parseColor("#212121"));
        slideshowView.setBackgroundColor(Color.parseColor("#212121"));
        ownView.setBackgroundColor(Color.parseColor("#212121"));
        paintingView.setBackgroundColor(Color.parseColor("#C31709"));
        painting1View.setTextColor(Color.parseColor("#FFFFFF"));
        painting2View.setTextColor(Color.parseColor("#C31709"));
        painting3View.setTextColor(Color.parseColor("#C31709"));
        painting4View.setTextColor(Color.parseColor("#C31709"));
        painting5View.setTextColor(Color.parseColor("#C31709"));
        refDatabase.child("Mirror1").child("Mode").setValue("Painting");
        refDatabase.child("Mirror1").child("paintingName").setValue("Guernica");

    }

    public void clickPainting2() {
        LinearLayout homeView = (LinearLayout) findViewById (R.id.homeDivide);
        ImageView galleryView = (ImageView) findViewById (R.id.galleryDividepicture);
        LinearLayout slideshowView = (LinearLayout) findViewById (R.id.slideshowDivide);
        LinearLayout ownView = (LinearLayout) findViewById (R.id.ownDivide);
        LinearLayout paintingView = (LinearLayout) findViewById (R.id.editDivide);
        TextView painting1View = (TextView) findViewById (R.id.add);
        TextView painting2View = (TextView) findViewById (R.id.painting2);
        TextView painting3View = (TextView) findViewById (R.id.delete);
        TextView painting4View = (TextView) findViewById (R.id.painting4);
        TextView painting5View = (TextView) findViewById (R.id.painting5);
        galleryView.setBackgroundColor(Color.parseColor("#212121"));
        slideshowView.setBackgroundColor(Color.parseColor("#212121"));
        ownView.setBackgroundColor(Color.parseColor("#212121"));
        paintingView.setBackgroundColor(Color.parseColor("#C31709"));
        painting1View.setTextColor(Color.parseColor("#C31709"));
        painting2View.setTextColor(Color.parseColor("#FFFFFF"));
        painting3View.setTextColor(Color.parseColor("#C31709"));
        painting4View.setTextColor(Color.parseColor("#C31709"));
        painting5View.setTextColor(Color.parseColor("#C31709"));
        refDatabase.child("Mirror1").child("Mode").setValue("Painting");
        refDatabase.child("Mirror1").child("paintingName").setValue("StarryNight");
    }

    public void clickPainting3() {
        LinearLayout homeView = (LinearLayout) findViewById (R.id.homeDivide);
        ImageView galleryView = (ImageView) findViewById (R.id.galleryDividepicture);
        LinearLayout slideshowView = (LinearLayout) findViewById (R.id.slideshowDivide);
        LinearLayout ownView = (LinearLayout) findViewById (R.id.ownDivide);
        LinearLayout paintingView = (LinearLayout) findViewById (R.id.editDivide);
        TextView painting1View = (TextView) findViewById (R.id.add);
        TextView painting2View = (TextView) findViewById (R.id.painting2);
        TextView painting3View = (TextView) findViewById (R.id.delete);
        TextView painting4View = (TextView) findViewById (R.id.painting4);
        TextView painting5View = (TextView) findViewById (R.id.painting5);
        galleryView.setBackgroundColor(Color.parseColor("#212121"));
        slideshowView.setBackgroundColor(Color.parseColor("#212121"));
        ownView.setBackgroundColor(Color.parseColor("#212121"));
        paintingView.setBackgroundColor(Color.parseColor("#C31709"));
        painting1View.setTextColor(Color.parseColor("#C31709"));
        painting2View.setTextColor(Color.parseColor("#C31709"));
        painting3View.setTextColor(Color.parseColor("#FFFFFF"));
        painting4View.setTextColor(Color.parseColor("#C31709"));
        painting5View.setTextColor(Color.parseColor("#C31709"));
        refDatabase.child("Mirror1").child("Mode").setValue("Painting");
        refDatabase.child("Mirror1").child("paintingName").setValue("TheBirthOfVenus");
    }

    public void clickPainting4() {
        LinearLayout homeView = (LinearLayout) findViewById (R.id.homeDivide);
        ImageView galleryView = (ImageView) findViewById (R.id.galleryDividepicture);
        LinearLayout slideshowView = (LinearLayout) findViewById (R.id.slideshowDivide);
        LinearLayout ownView = (LinearLayout) findViewById (R.id.ownDivide);
        LinearLayout paintingView = (LinearLayout) findViewById (R.id.editDivide);
        TextView painting1View = (TextView) findViewById (R.id.add);
        TextView painting2View = (TextView) findViewById (R.id.painting2);
        TextView painting3View = (TextView) findViewById (R.id.delete);
        TextView painting4View = (TextView) findViewById (R.id.painting4);
        TextView painting5View = (TextView) findViewById (R.id.painting5);
        galleryView.setBackgroundColor(Color.parseColor("#212121"));
        slideshowView.setBackgroundColor(Color.parseColor("#212121"));
        ownView.setBackgroundColor(Color.parseColor("#212121"));
        paintingView.setBackgroundColor(Color.parseColor("#C31709"));
        painting1View.setTextColor(Color.parseColor("#C31709"));
        painting2View.setTextColor(Color.parseColor("#C31709"));
        painting3View.setTextColor(Color.parseColor("#C31709"));
        painting4View.setTextColor(Color.parseColor("#FFFFFF"));
        painting5View.setTextColor(Color.parseColor("#C31709"));
        refDatabase.child("Mirror1").child("Mode").setValue("Painting");
        refDatabase.child("Mirror1").child("paintingName").setValue("TheLastSupper");
    }

    public void clickPainting5() {
        LinearLayout homeView = (LinearLayout) findViewById (R.id.homeDivide);
        ImageView galleryView = (ImageView) findViewById (R.id.galleryDividepicture);
        LinearLayout slideshowView = (LinearLayout) findViewById (R.id.slideshowDivide);
        LinearLayout ownView = (LinearLayout) findViewById (R.id.ownDivide);
        LinearLayout paintingView = (LinearLayout) findViewById (R.id.editDivide);
        TextView painting1View = (TextView) findViewById (R.id.add);
        TextView painting2View = (TextView) findViewById (R.id.painting2);
        TextView painting3View = (TextView) findViewById (R.id.delete);
        TextView painting4View = (TextView) findViewById (R.id.painting4);
        TextView painting5View = (TextView) findViewById (R.id.painting5);
        galleryView.setBackgroundColor(Color.parseColor("#212121"));
        slideshowView.setBackgroundColor(Color.parseColor("#212121"));
        ownView.setBackgroundColor(Color.parseColor("#212121"));
        paintingView.setBackgroundColor(Color.parseColor("#C31709"));
        painting1View.setTextColor(Color.parseColor("#C31709"));
        painting2View.setTextColor(Color.parseColor("#C31709"));
        painting3View.setTextColor(Color.parseColor("#C31709"));
        painting4View.setTextColor(Color.parseColor("#C31709"));
        painting5View.setTextColor(Color.parseColor("#FFFFFF"));
        refDatabase.child("Mirror1").child("Mode").setValue("Painting");
        refDatabase.child("Mirror1").child("paintingName").setValue("ThePersistenceOfMemory");    }





}
