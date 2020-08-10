package com.example.currentweek;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity2 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

       Bundle extra = getIntent().getExtras();
       int week = extra.getInt("week", 0);

    }
    public void Button2 (View vista) {

        Intent Button2 = new Intent(this, MainActivity.class);
        startActivity(Button2);
    }
}
