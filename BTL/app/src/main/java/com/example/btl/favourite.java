package com.example.btl;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.btl.model.Course;
import com.example.btl.model.Order;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class favourite extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favourite);
        ListView orders_list = findViewById(R.id.recom_list);
        Set<Integer> id = new HashSet<>();
        id.addAll(Order.items_id);
        List<String> coursesTitle = new ArrayList<>();
        for(Course c : Home.fullcoursesList){
            if(id.contains(c.getId()))
                coursesTitle.add(c.getTitle());
        }
        orders_list.setAdapter(new ArrayAdapter<>(this,R.layout.listview, coursesTitle));
    }
    public void fromMaintoCall(View view){
        Intent intent = new Intent(this, CallPage.class);
        //courseList.clear();
        //courseAdapter.notifyDataSetChanged();
        startActivity(intent);
    }
    public void fromtoHome(View view){
        Intent intent = new Intent(this, Home.class);
        //courseList.clear();
        //courseAdapter.notifyDataSetChanged();
        startActivity(intent);
    }
    public void fromMaintoFavorrite(View view){
        Intent intent = new Intent(this, favourite.class);
        //  courseList.clear();
        //  courseAdapter.notifyDataSetChanged();
        startActivity(intent);
    }
}
