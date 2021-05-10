 package com.example.recycleviewtutoial;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

     RecyclerView recyclerView;
     LinearLayoutManager layoutManager;
     List<ModelClass>userList;
     Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initData();
        initRecyclerView();

    }

    private void initData() {

        userList = new ArrayList<>();
        userList.add(new ModelClass(R.drawable.ic_baseline_account_circle_24, "Anuj Kumar", "1:43 Am", "How are you"));
        userList.add(new ModelClass(R.drawable.ic_baseline_account_circle_24, "Anoop Kumar", "7:32 Am", "I am fine"));
        userList.add(new ModelClass(R.drawable.ic_baseline_account_circle_24, "Ashwani goyal", "10:12 Am", "Hola"));
        userList.add(new ModelClass(R.drawable.img_3, "Kashish Kakkar", "12:34 Am", "How are you"));
        userList.add(new ModelClass(R.drawable.img_3, "Aqib Ali", "4:43 Am", "hahahaha"));
        userList.add(new ModelClass(R.drawable.img_3, "Akash maurya", "8:32 Am", "This is something text"));
        userList.add(new ModelClass(R.drawable.img_3, "Aakash shama", "9:51 Am", "Or bhai kya haal he"));
        userList.add(new ModelClass(R.drawable.img_3, "Himanshu Tripathi", "1:43 Am", "Hello dosto"));
        userList.add(new ModelClass(R.drawable.img_3, "Ashwani goyal", "10:12 Am", "Hola"));
        userList.add(new ModelClass(R.drawable.img_3, "Kashish Kakkar", "12:34 Am", "How are you"));
        userList.add(new ModelClass(R.drawable.img_3, "Aqib Ali", "4:43 Am", "hahahaha"));

    }

    private void initRecyclerView() {

        recyclerView = findViewById(R.id.recyclerView);
        layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        adapter = new Adapter(userList);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();

    }
}