package com.smartfarm.www.activity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.smartfarm.www.R;
import com.smartfarm.www.service.LogoutService;

public class DetectActivity extends AppCompatActivity {

    private ListView listView;
    private DetectListViewAdapter listViewAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detect_page);

        //자동로그아웃 활성화
        startService(new Intent(this, LogoutService.class));

        listViewAdapter = new DetectListViewAdapter();

        listView = (ListView)findViewById(R.id.detect_listview);

        listViewAdapter.addItem("테스트1","내용1","");
        listViewAdapter.addItem("테스트2","내용2","");
        listViewAdapter.addItem("테스트3","내용3","");
        listViewAdapter.addItem("테스트4","내용4","");
        listViewAdapter.addItem("테스트5","내용5","");

        listView.setAdapter(listViewAdapter);

//        listViewAdapter.notifyDataSetChanged();

    }
}
