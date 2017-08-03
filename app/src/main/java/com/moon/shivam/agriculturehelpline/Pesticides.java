package com.moon.shivam.agriculturehelpline;


import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;

public class Pesticides extends AppCompatActivity {
    TextView t,t1;
    ScrollView p,c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        requestWindowFeature(Window.FEATURE_NO_TITLE);
//        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_pesticides);
        setTitle(R.string.fert);
        t=(TextView)findViewById(R.id.abt);
        t1=(TextView)findViewById(R.id.abt1);
       t.setMovementMethod(new ScrollingMovementMethod());
        t1.setMovementMethod(new ScrollingMovementMethod());
        t.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                v.getParent().requestDisallowInterceptTouchEvent(true);
                return false;
            }
        });
        t1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                v.getParent().requestDisallowInterceptTouchEvent(true);
                return false;
            }
        });
        Typeface face= Typeface.createFromAsset(getAssets(), "font.ttf");
        t.setTypeface(face);
        t1.setTypeface(face);
//        p=(ScrollView)findViewById(R.id.parent);
//        c=(ScrollView)findViewById(R.id.child);


    }
}
