package com.example.classwork;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.radiobutton.MaterialRadioButton;
import com.google.android.material.textview.MaterialTextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View button1 = findViewById(R.id.radioButton1);
        View button2 = findViewById(R.id.radioButton2);
        View button3 = findViewById(R.id.radioButton3);

    }

    public void changeColorText(View view) {
        Object o = view;
        Class<?> aClass = o.getClass();
        Log.e("GET", "GET CLASS VIEW:  " + aClass);

        if (view.isClickable()) {
            if (aClass == MaterialRadioButton.class) {
                changeColorToButton(view);

            } else if (aClass == MaterialTextView.class) {
                changeColorToTextView(view);
            }
        }
    }

    private static void changeColorToTextView(View view) {
        TextView textView = (TextView) view;
        if (textView.isClickable()) {
            textView.setTextColor(Color.CYAN);
        }
    }

    private static void changeColorToButton(View view) {
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