package com.view.mytest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = (TextView)findViewById(R.id.text_main);
        text.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(this, "ddddd", Toast.LENGTH_SHORT).show();
    }
}
