package com.fdaniel.interestingplaces;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToPlace1(View view){
        Intent i = new Intent(this,MapsActivity.class);
        i.putExtra("lugar", "1");
        startActivity(i);
    }

    public void goToPlace2(View view){
        Intent i = new Intent(this,MapsActivity.class);
        i.putExtra("lugar", "2");
        startActivity(i);
    }
    public void goToPlace3(View view){
        Intent i = new Intent(this,MapsActivity.class);
        i.putExtra("lugar", "3");
        startActivity(i);
    }
    public void goToPlace4(View view){
        Intent i = new Intent(this,MapsActivity.class);
        i.putExtra("lugar", "4");
        startActivity(i);
    }
}
