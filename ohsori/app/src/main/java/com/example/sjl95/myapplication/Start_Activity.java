package com.example.sjl95.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class Start_Activity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        try{
            Thread.sleep(500);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        startActivity(new Intent(this,store_search_Activity.class));
        finish();
    }

}
