package com.mrz.androidviewsingleclick;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.mrz.androidviewsingleclick.core.SingleClick;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    int num = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.text);
        textView.setOnClickListener(new View.OnClickListener() {
            @SingleClick
            @Override
            public void onClick(View v) {
                num++;
                textView.setText("点击了" + num +"次");
            }
        });
    }
}
