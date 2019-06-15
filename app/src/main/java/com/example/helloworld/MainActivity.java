package com.example.helloworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    public static final String key = "com.example.HelloWorld.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void perform(View view) {
        /*TextView helloTextView = (TextView) findViewById(R.id.text);
        helloTextView.setText("Testing the button.");
        */
        Intent intent = new Intent(this,ChildActivity.class);
        String message = "New Activity";
        intent.putExtra(key,message);
        startActivity(intent);
    }

    public void getLocation(View view) {
        Intent intent = new Intent(this,location.class);
        intent.putExtra(key,"S");
        startActivity(intent);
    }

}
