package com.example.scout_blood_bank;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class LoadingPageActivity extends AppCompatActivity {
    private static int SPLASH_TIME = 2000;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading_page);


        new Handler().postDelayed(new Runnable() {

            public void run() {

                Intent mySuperIntent = new Intent(LoadingPageActivity.this,MainActivity.class);
                startActivity(mySuperIntent);

                finish();
            }
        }, SPLASH_TIME);
    }
}
