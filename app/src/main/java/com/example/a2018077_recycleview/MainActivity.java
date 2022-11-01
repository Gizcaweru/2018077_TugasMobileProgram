package com.example.a2018077_recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    RecyclerView recylerView;

    String s1[], s2[],s3[];
    int images[] = {R.drawable.sunscreen,R.drawable.azarine,R.drawable.wardah};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recylerView = findViewById(R.id.recyclerView);
        s1 = getResources().getStringArray(R.array.Sunscreen);
        s2 = getResources().getStringArray(R.array.deskripsi);
        s3 = getResources().getStringArray(R.array.star);
        SunscreenAdapter appAdapter = new
                SunscreenAdapter(this,s1,s2,s3,images);
        recylerView.setAdapter(appAdapter);
        recylerView.setLayoutManager(new LinearLayoutManager(this));
    }
}