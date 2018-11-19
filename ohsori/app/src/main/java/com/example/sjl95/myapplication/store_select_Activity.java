package com.example.sjl95.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class store_select_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_store_select);
    }

    public void onButtonClicked1(View v){
        Intent intent = new Intent(getApplicationContext(), item_search_Activity.class);
        startActivity(intent);
    }

    public void onButtonClicked2(View v){
        Intent intent = new Intent(getApplicationContext(), item_search_Activity.class);
        startActivity(intent);
    }

    public void onButtonClicked3(View v){
        Intent intent = new Intent(getApplicationContext(), item_search_Activity.class);
        startActivity(intent);
    }
}
