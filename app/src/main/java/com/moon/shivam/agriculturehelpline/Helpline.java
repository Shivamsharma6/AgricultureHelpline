package com.moon.shivam.agriculturehelpline;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class Helpline extends AppCompatActivity implements View.OnClickListener{
    Button l,h,p;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        requestWindowFeature(Window.FEATURE_NO_TITLE);
//        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_helpline);
        l=(Button)findViewById(R.id.lc);
        h=(Button)findViewById(R.id.hc);
        p=(Button)findViewById(R.id.sp);
        l.setOnClickListener(this);
        h.setOnClickListener(this);
        p.setOnClickListener(this);
        setTitle(R.string.helpline);
    }

    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.lc){
            Intent intent=new Intent(getApplicationContext(),LiveChat.class);
            startActivity(intent);
        }
        if (v.getId()==R.id.hc){
            Intent intent=new Intent(getApplicationContext(),HelplineCentres.class);
            startActivity(intent);
        }
        if (v.getId()==R.id.sp){
            Intent intent=new Intent(getApplicationContext(),SubmitProblem.class);
            startActivity(intent);
        }

    }
}
