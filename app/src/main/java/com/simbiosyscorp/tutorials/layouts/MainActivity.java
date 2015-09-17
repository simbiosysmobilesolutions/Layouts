package com.simbiosyscorp.tutorials.layouts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

   public void toLinearHor(View view){
       startActivity(new Intent(getApplicationContext(),LinearLayoutHorizontal.class));
   }
    public void toLinearVer(View view){
        startActivity(new Intent(getApplicationContext(),LinearLayoutVertical.class));
    } public void toRelative(View view){
        startActivity(new Intent(getApplicationContext(),RelativeLayout.class));
    } public void toTable(View view){
        startActivity(new Intent(getApplicationContext(),TableLayout.class));
    } public void toGrid(View view){
        startActivity(new Intent(getApplicationContext(),GridLayout.class));
    }



}
