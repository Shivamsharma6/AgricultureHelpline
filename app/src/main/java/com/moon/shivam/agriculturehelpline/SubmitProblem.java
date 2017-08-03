package com.moon.shivam.agriculturehelpline;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;
import java.util.Map;

public class SubmitProblem extends AppCompatActivity implements View.OnClickListener{

    EditText q,n;
    Button s;
    private DatabaseReference root;
    private String key;
    String a="Problems";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        requestWindowFeature(Window.FEATURE_NO_TITLE);
//        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_submit_problem);
        q=(EditText)findViewById(R.id.query);
        n=(EditText)findViewById(R.id.name);
        s=(Button)findViewById(R.id.submit);
        s.setOnClickListener(this);
        root= FirebaseDatabase.getInstance().getReference().child(a);
        setTitle(R.string.sp);

    }

    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.submit) {
            FirebaseDatabase database = FirebaseDatabase.getInstance();
           // DatabaseReference myRef = database.getReference("Problems");
            String a = q.getText().toString();
            String nam=n.getText().toString();
            q.setText("");
            n.setText("");
            Map<String,Object> map2 = new HashMap<String, Object>();
            key = root.push().getKey();
            root.updateChildren(map2);
            //key=myRef.push().getKey();
           // myRef.child(key);//.setValue(a);
            DatabaseReference message_root = root.child(key);
            Map<String,Object> map = new HashMap<String, Object>();
            map.put("Name",nam);
            map.put("Query",a);
            message_root.updateChildren(map);
            Toast.makeText(getApplicationContext(),"Query Submitted Sucessfully",Toast.LENGTH_SHORT).show();
        }
    }
}
