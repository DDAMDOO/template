package com.example.sjl95.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class item_search_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_search);
    }
    public void onButtonClicked20(View v){
        //Toast.makeText(getApplicationContext(),"buttonclicked2",Toast.LENGTH_LONG).show();
        Intent intent = new Intent(getApplicationContext(), item_select_Activity.class);
        startActivity(intent);
    }
}