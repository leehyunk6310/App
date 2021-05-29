package com.example.term;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Arrays;
import java.util.List;

public class MedicineList extends AppCompatActivity {
    private RecyclerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.medicinelist);

        init();

        getData();
    }

    private void init() {
        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

        adapter = new RecyclerAdapter();
        recyclerView.setAdapter(adapter);
    }
    private void getData() {

//        for (int i = 0; i < listTitle.size(); i++) {
//            // 각 List의 값들을 data 객체에 set 해줍니다.
//            RecyclerData data = new RecyclerData();
//            data.setTitle(listTitle.get(i));
//            //data.setContent(listContent.get(i));
//            data.setResId(listResId.get(i));
//
//            // 각 값이 들어간 data를 adapter에 추가합니다.
//            adapter.addItem(data);
//        }
        RecyclerData data = new RecyclerData();
        
        // adapter의 값이 변경되었다는 것을 알려줍니다.
        adapter.notifyDataSetChanged();
    }
}

