package com.example.layouts_calc_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void show_numbers(View view) {
        TextView textView = (TextView) findViewById(R.id.text_result);
        Button button = (Button) view;
        textView.setText(button.getText().toString());
    }
}
