package com.template.sjl95.osori_final;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class ItemSelectActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_select);
    }


    public void onButtonClicked1(View v){
        Intent intent = getPackageManager().getLaunchIntentForPackage("com.osori.select");
//        Intent intent = new Intent(getApplicationContext(),UnityPlayerActivity.class);
        startActivity(intent);
    }

    public void onButtonClicked2(View v){
        Intent intent = getPackageManager().getLaunchIntentForPackage("com.osori.select1");
        startActivity(intent);
    }

    public void onButtonClicked3(View v){
        Intent intent = getPackageManager().getLaunchIntentForPackage("com.osori.select2");
        startActivity(intent);
    }
}
