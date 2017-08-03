package com.moon.shivam.agriculturehelpline;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class Information extends AppCompatActivity implements View.OnClickListener{
    Button s,c,p;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // requestWindowFeature(Window.FEATURE_NO_TITLE);
        // getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_information);
        s=(Button)findViewById(R.id.soil);
        c=(Button)findViewById(R.id.crops);
        p=(Button)findViewById(R.id.pest);
        s.setOnClickListener(this);
        c.setOnClickListener(this);
        p.setOnClickListener(this);
        setTitle(R.string.information);
        overridePendingTransition(R.anim.push_up_out,R.anim.activity_push_up_in);
    }

    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.soil){
            Intent intent=new Intent(getApplicationContext(),Soil.class);
            startActivity(intent);
            overridePendingTransition(R.anim.activity_push_up_in,R.anim.push_up_out);
        }
        if (v.getId()==R.id.crops){
            Intent intent=new Intent(getApplicationContext(),Crops.class);
            startActivity(intent);
            overridePendingTransition(R.anim.activity_push_up_in,R.anim.push_up_out);
        }
        if (v.getId()==R.id.pest){
            Intent intent=new Intent(getApplicationContext(),Pesticides.class);
            startActivity(intent);
            overridePendingTransition(R.anim.activity_push_up_in,R.anim.push_up_out);
        }
    }
}
