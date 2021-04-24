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
        Button oint = (Button)findViewById(R.id.ointment);
        Button etc = (Button)findViewById(R.id.etc);

        head.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, HeadActivity.class);
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
        oint.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, OintActivity.class);
                startActivity(intent);
            }
        });


    }
}