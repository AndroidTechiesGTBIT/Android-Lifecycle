package com.example.abhaychawla.mainproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

/*
Using util.Log class to show Android-Activity lifecycle.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //onCreate is the first Function to be called
        Log.d("myTag","inside oncreate");


    }

    @Override
    protected void onStart() {
        super.onStart();
        //It will be called afer on onCreate and before onresume
        Log.d("myTag","inside onstart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        //this function displays that activity is now visible to user

       Log.d("myTag","inside onresume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        //first function to be called whenever user stops the activity , either
        //home button or back button or screen orientation change
        Log.d("myTag","inside Pause");
    }

    @Override
    protected void onStop() {
        //called after onpause and before onDestroy
        super.onStop();
        Log.d("myTag","inside Stop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        //this function called is only made in two case , either back button is pressed
        //or screen orientation is changed.
        Log.d("myTag","inside destroy");
    }



}
