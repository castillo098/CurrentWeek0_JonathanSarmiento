package com.example.currentweek;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText editText;
    private Button b_chequear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText) findViewById(R.id.editText);
        b_chequear= (Button) findViewById(R.id.b_chequear);
        b_chequear.setOnClickListener(this);
    }

    @Override
    public void onClick(View vista) {
        if (vista == b_chequear){
            int num=Integer.valueOf(editText.getText().toString());
            Calendar calendario= Calendar.getInstance();
            int semana = calendario.get(Calendar.WEEK_OF_YEAR);

            if(num == semana){
                Toast.makeText(getApplicationContext(),
                        "el numero ingresado es CORRECTO",Toast.LENGTH_SHORT).show();

            }else {
                Toast.makeText(getApplicationContext(),
                        "el numero ingresado es INCORRECTO" + semana, Toast.LENGTH_SHORT).show();

            }

            Intent intent = new Intent(MainActivity.this , MainActivity2.class);
            intent.putExtra("week",num);
            startActivity(intent);


        }
    }
}