package com.moon.shivam.agriculturehelpline;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Soil extends AppCompatActivity {

    ListView listView;
    TextView t,t1,t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soil);
        setTitle(R.string.soil);
        t=(TextView)findViewById(R.id.tv1);
        t1=(TextView)findViewById(R.id.tv2);
        t2=(TextView)findViewById(R.id.tv3);
        t.setMovementMethod(new ScrollingMovementMethod());
        Typeface face= Typeface.createFromAsset(getAssets(), "font.ttf");
        t.setTypeface(face);
       // t1.setTypeface(face);
        t2.setTypeface(face);
        String[] crp=getResources().getStringArray(R.array.crps);
        listView=(ListView)findViewById(R.id.lv);
        ArrayList<String> arrayList=new ArrayList<String>();
        for (int i=0;i<crp.length;i++){
            arrayList.add(crp[i]);
        }
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,arrayList);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int itemPosition=position;
                if(itemPosition==0){
                    Toast.makeText(getApplicationContext(),getResources().getString(R.string.Alluvial),Toast.LENGTH_SHORT).show();
                    Intent intent=new Intent(Soil.this, AlluvialSoil.class);
                    startActivity(intent);
                }
                if(itemPosition==1){
                    Toast.makeText(getApplicationContext(),getResources().getString(R.string.Laterite),Toast.LENGTH_SHORT).show();
                    Intent intent=new Intent(Soil.this, LateriteSoil.class);
                    startActivity(intent);
                }
                if(itemPosition==2){
                    Toast.makeText(getApplicationContext(),getResources().getString(R.string.Red),Toast.LENGTH_SHORT).show();
                    Intent intent=new Intent(Soil.this, RedSoil.class);
                    startActivity(intent);
                }
                if(itemPosition==3){
                    Toast.makeText(getApplicationContext(),getResources().getString(R.string.Black),Toast.LENGTH_SHORT).show();
                    Intent intent=new Intent(Soil.this, BlackSoil.class);
                    startActivity(intent);
                }
                if(itemPosition==4){
                    Toast.makeText(getApplicationContext(),getResources().getString(R.string.Desert),Toast.LENGTH_SHORT).show();
                    Intent intent=new Intent(Soil.this, DesertSoil.class);
                    startActivity(intent);
                }
                if(itemPosition==5){
                    Toast.makeText(getApplicationContext(),getResources().getString(R.string.Mountain),Toast.LENGTH_SHORT).show();
                    Intent intent=new Intent(Soil.this, MountainSoil.class);
                    startActivity(intent);
                }
            }
        });
    }
}
