package com.example.term;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class HeadActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //화면에 보여질 내용물 뷰 설정
        setContentView(R.layout.head);

        Button tai = (Button)findViewById(R.id.tairenol);
        tai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HeadActivity.this, TairenolActivity.class);
                startActivity(intent);
            }
        });
}
}
