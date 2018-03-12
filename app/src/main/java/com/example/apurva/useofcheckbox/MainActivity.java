package com.example.apurva.useofcheckbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox c1,c2,c3;
    Button b;
    String op1,op2,op3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        c1=findViewById(R.id.chk_android);
        c2=findViewById(R.id.chb_java);
        c3=findViewById(R.id.ckb_kotlin);

        b=findViewById(R.id.btn_submit);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if(c1.isChecked()){
                    op1=c1.getText().toString();
                }
                else {
                    op1="";
                }
                if(c2.isChecked()){
                    op2=c2.getText().toString();
                }
                else {
                    op2="";
                }
                if(c3.isChecked()){
                    op3=c3.getText().toString();
                }
                else {
                    op3="";
                }

                Toast.makeText(MainActivity.this, ""+op1+" "+op2+" "+op3, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
