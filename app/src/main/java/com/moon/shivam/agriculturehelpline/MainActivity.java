package com.moon.shivam.agriculturehelpline;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    ImageButton i,h,lc;
    TextView tv4,tv5,tv6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        requestWindowFeature(Window.FEATURE_NO_TITLE);
//        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        setTitle(R.string.app_name);
        i=(ImageButton)findViewById(R.id.info);
        h=(ImageButton)findViewById(R.id.help);
        lc=(ImageButton)findViewById(R.id.livechat);
        tv4=(TextView)findViewById(R.id.textView4);
        tv5=(TextView)findViewById(R.id.textView5);
        tv6=(TextView)findViewById(R.id.textView6);
        i.setOnClickListener(this);
        h.setOnClickListener(this);
        lc.setOnClickListener(this);
        Typeface face= Typeface.createFromAsset(getAssets(), "font.ttf");
        tv4.setTypeface(face);
        tv5.setTypeface(face);
        tv6.setTypeface(face);
        Animation myAnim= AnimationUtils.loadAnimation(this, R.anim.anim_alpha);
        i.setAnimation(myAnim);
        h.setAnimation(myAnim);
        lc.setAnimation(myAnim);
    }

    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.info){
            Animation Anim=AnimationUtils.loadAnimation(this, R.anim.anim_alpha);
            v.startAnimation(Anim);
            Intent intent=new Intent(getApplicationContext(),Information.class);
            startActivity(intent);
            overridePendingTransition(R.anim.activity_push_up_in,R.anim.push_up_out);
        }
        else if (v.getId()==R.id.help){
            Animation yAnim=AnimationUtils.loadAnimation(this, R.anim.anim_alpha);
            v.startAnimation(yAnim);
            Intent intent= new Intent(getApplicationContext(),Helpline.class);
            startActivity(intent);
            overridePendingTransition(R.anim.activity_push_up_in,R.anim.push_up_out);
        }

        else if (v.getId()==R.id.livechat){
            Animation yAnim=AnimationUtils.loadAnimation(this, R.anim.anim_alpha);
            v.startAnimation(yAnim);
            Intent intent= new Intent(getApplicationContext(),LiveChat.class);
            startActivity(intent);
            overridePendingTransition(R.anim.activity_push_up_in,R.anim.push_up_out);
        }
    }
}
