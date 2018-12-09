package com.template.sjl95.osori;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ItemSearchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_search);
    }
    public void onButtonClicked20(View v){
        //Toast.makeText(getApplicationContext(),"buttonclicked2",Toast.LENGTH_LONG).show();
        Intent intent = new Intent(getApplicationContext(), ItemSelectActivity.class);
        startActivity(intent);
    }
}
