package com.example.sjl95.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class item_select_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_select);
    }

    public void onBackButtonClicked(View v){
        Toast.makeText(getApplicationContext(), "돌아가기를 누름", Toast.LENGTH_LONG).show();
        finish();
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
