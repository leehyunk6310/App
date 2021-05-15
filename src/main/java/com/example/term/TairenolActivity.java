package com.example.term;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import java.lang.reflect.Array;

public class TairenolActivity extends AppCompatActivity {
    static final String[] reviewList = {"완전 최악!", "b", "c", "f"};
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tairenol);
        Button review = (Button)findViewById(R.id.review);
//        ListView listview = (ListView)findViewById(R.id.tairenolReviewList);

        review.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TairenolActivity.this, ReviewActivity.class);
                startActivity(intent);
            }
        });//리뷰 버튼 눌렀을때

//        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, reviewList);
//        listview.setAdapter(adapter);



        //
        ListView listview2;
        ListViewAdapter ladapter;

        ladapter = new ListViewAdapter();
        listview2 = (ListView)findViewById(R.id.newlist);
        listview2.setAdapter(ladapter);

        ladapter.addItem(ContextCompat.getDrawable(this,R.drawable.test),1,"Ho");
        ladapter.addItem(ContextCompat.getDrawable(this,R.drawable.test),2,"LAL");
        ladapter.addItem(ContextCompat.getDrawable(this,R.drawable.test),3,"QWD");

    }
}