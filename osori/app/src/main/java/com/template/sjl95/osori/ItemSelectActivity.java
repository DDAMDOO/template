package com.template.sjl95.osori;

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

    public void onBackButtonClicked(View v){
        Toast.makeText(getApplicationContext(), "돌아가기를 누름", Toast.LENGTH_LONG).show();
        finish();
    }

    public void onButtonClicked1(View v){
//        Intent launchIntent = getPackageManager().getLaunchIntentForPackage("com.package.address");
        Intent intent = new Intent(getApplicationContext(),UnityPlayerActivity.class);
        startActivity(intent);
    }

    public void onButtonClicked2(View v){
        Intent intent = new Intent(getApplicationContext(), ItemSearchActivity.class);
        startActivity(intent);
    }

    public void onButtonClicked3(View v){
        Intent intent = new Intent(getApplicationContext(), ItemSelectActivity.class);
        startActivity(intent);
    }
}
