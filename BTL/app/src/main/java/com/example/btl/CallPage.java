package com.example.btl;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class CallPage extends AppCompatActivity {
    Button button1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call);

        //Getting the edittext and button instance
        button1=(Button)findViewById(R.id.button1);
        //Performing action on button click
        button1.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View arg0) {
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:"+ "0123456789"));
                startActivity(callIntent);
            }
        });
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
