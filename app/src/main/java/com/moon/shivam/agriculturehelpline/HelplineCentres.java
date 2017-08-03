package com.moon.shivam.agriculturehelpline;

import android.app.Activity;
import android.content.Intent;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.menu.ActionMenuItemView;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.Toast;

public class HelplineCentres extends AppCompatActivity {
    ImageButton n,e,s,w;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        requestWindowFeature(Window.FEATURE_NO_TITLE);
//        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_helpline_centres);
        n=(ImageButton)findViewById(R.id.north);
        e=(ImageButton)findViewById(R.id.east);
        s=(ImageButton)findViewById(R.id.south);
        w=(ImageButton)findViewById(R.id.west);
        setTitle(R.string.hc);
        Toast.makeText(getApplicationContext(), getResources().getString(R.string.reg),Toast.LENGTH_LONG).show();
        final Animation anim= AnimationUtils.loadAnimation(this,R.anim.anim_alpha);
        n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(anim);
                Intent intent=new Intent(getApplicationContext(),North.class);
                startActivity(intent);
            }
        });
        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),East.class);
                startActivity(intent);
            }
        });
        s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),South.class);
                startActivity(intent);
            }
        });
        w.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),West.class);
                startActivity(intent);
            }
        });
    }
}
