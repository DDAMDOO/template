package com.template.sjl95.osori_final;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class StoreSelectActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_store_select);
    }

    public void onButtonClicked1(View v){
        Intent intent = new Intent(getApplicationContext(), ItemSearchActivity.class);
        startActivity(intent);
    }

    public void onButtonClicked2(View v){
        Intent intent = new Intent(getApplicationContext(), ItemSearchActivity.class);
        startActivity(intent);
    }

    public void onButtonClicked3(View v){
        Intent intent = new Intent(getApplicationContext(), ItemSearchActivity.class);
        startActivity(intent);
    }
}
