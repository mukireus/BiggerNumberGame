package com.mukireus.biggernumbegame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button btnFirst, btnSecond;
    int first,second;
    boolean buyukmu = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnFirst = findViewById(R.id.btnFirst);
        btnSecond = findViewById(R.id.btnSecond);

        first = new Random().nextInt(50);
        second = new Random().nextInt(50);

        btnFirst.setText(String.valueOf(first));
        btnSecond.setText(String.valueOf(second));

        if(first > second)
            buyukmu = true;
        else buyukmu = false;


        btnFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(buyukmu)
                {
                    Intent intent = getIntent();
                    finish();
                    startActivity(intent);
                }
                else
                    Toast.makeText(MainActivity.this, "Cevabınız Hatalı Kontrol Ediniz.", Toast.LENGTH_SHORT).show();
            }
        });

        btnSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!buyukmu){
                    Intent intent = getIntent();
                    finish();
                    startActivity(intent);
                }
                else
                    Toast.makeText(MainActivity.this, "Cevabınız Hatalı Kontrol Ediniz.", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
