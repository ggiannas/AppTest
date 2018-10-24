package com.example.grimyellow.apptest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //
        Button Btn =(Button) findViewById(R.id.BtnMagic);
        //
       Btn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Log.i("MyApp","EIMAI O KALYTEROS");
               Toast.makeText(getApplicationContext(),"papap",Toast.LENGTH_SHORT).show();

           }
       });
    }
}
