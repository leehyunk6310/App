package com.example.term;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button head = (Button)findViewById(R.id.headache);
        Button stomach = (Button)findViewById(R.id.stomachache);
        Button abrasion = (Button)findViewById(R.id.abrasion);
        Button skin = (Button)findViewById(R.id.skin);

        head.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MedicineList.class);
                startActivity(intent);
            }
        });
        stomach.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, StomachActivity.class);
                startActivity(intent);
            }
        });
        abrasion.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AbrasionActivity.class);
                startActivity(intent);
            }
        });


    }
}