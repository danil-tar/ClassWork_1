package com.example.classwork;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View button1 = findViewById(R.id.radioButton1);
        View button2 = findViewById(R.id.radioButton2);
        View button3 = findViewById(R.id.radioButton3);

    }

    public void changeColorTextButton(View view) {
        Button button = (Button) view;
        if (button.isClickable()) {
            int viewId = view.getId();
            if (viewId == R.id.radioButton1) {
                ((Button) view).setTextColor(Color.RED);
            } else if (viewId == R.id.radioButton2) {
                ((Button) view).setTextColor(Color.YELLOW);
            } else if (viewId == R.id.radioButton3) {
                ((Button) view).setTextColor(Color.GREEN);
            }
        }
    }
}