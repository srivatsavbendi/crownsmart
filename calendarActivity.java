package com.example.crownofficial;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.provider.CalendarContract;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.Calendar;
import java.util.Date;

public class calendarActivity extends AppCompatActivity {
    private static final int MY_CAL_REQ = 0;
    private DatabaseReference refDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        refDatabase = FirebaseDatabase.getInstance().getReference();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        // gets ride of top bar with application name
        getSupportActionBar().hide();
        // gets ride of top bar with time, date, charge, etc.
        //getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        LinearLayout googleView = (LinearLayout) findViewById(R.id.googleDivide);
        LinearLayout editView = (LinearLayout) findViewById(R.id.editDivide);

        googleView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGoogleActivity();
            }
        });

        editView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                query();
            }
        });


    }

    public void openGoogleActivity() {
        long startMillis = 1593744063;
        Uri.Builder builder = CalendarContract.CONTENT_URI.buildUpon();
        builder.appendPath("time");
        ContentUris.appendId(builder, startMillis);
        Intent intent = new Intent(Intent.ACTION_VIEW)
                .setData(builder.build());
        startActivity(intent);
    }

    public void query() {
        String[] projection = {CalendarContract.Events._ID,
                CalendarContract.Events.TITLE};
        // Get a Cursor over the Events Provider.
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.READ_CALENDAR) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }
        Cursor cursor = getContentResolver().query(
                CalendarContract.Events.CONTENT_URI, projection, null, null,
                null);
        // Get the index of the columns.
        int nameIdx = cursor.getColumnIndexOrThrow(CalendarContract.Events.TITLE);
        int idIdx = cursor.getColumnIndexOrThrow(CalendarContract.Events._ID);

        // Initialize the result set.
        String[] result = new String[cursor.getCount()];
        // Iterate over the result Cursor.
        while (cursor.moveToNext()) {
            // Extract the name.
            String name = cursor.getString(nameIdx);
            // Extract the unique ID.
            String id = cursor.getString(idIdx);

            String beta = beta + name;
            refDatabase.child("Mirror1").child("something1").setValue(name);
            result[cursor.getPosition()] = name + "(" + id + ")";
            Toast.makeText(this, name + "(" + id + ")", Toast.LENGTH_SHORT)
                    .show();

        }
        // Close the Cursor.
        cursor.close();
    }
}
