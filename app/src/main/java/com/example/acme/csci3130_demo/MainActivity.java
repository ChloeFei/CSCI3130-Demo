package com.example.acme.csci3130_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new MyClass());

    }

    public class MyClass implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            Button button=(Button) v;
            EditText newText=(EditText)v.getRootView(). findViewById(R.id.editText);
            TextView tv = (TextView) v.getRootView().findViewById(R.id.textView);

                tv.setText( newText.getText());
                

        }
    }
}