package com.example.nightmode;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    private RadioGroup radioGroup;
    private RadioButton nightRadioButton;
    private RadioButton dayRadioButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = findViewById(R.id.radioGroup);
        nightRadioButton = findViewById(R.id.nightRadioButton);
        dayRadioButton = findViewById(R.id.dayRadioButton);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                if (checkedId == R.id.nightRadioButton) {
                    // Set the background color to black and the text color to white
                    getWindow().getDecorView().setBackgroundColor(Color.BLACK);
                    nightRadioButton.setTextColor(Color.WHITE);
                    dayRadioButton.setTextColor(Color.WHITE);
                } else if (checkedId == R.id.dayRadioButton) {
                    // Set the background color to white and the text color to black
                    getWindow().getDecorView().setBackgroundColor(Color.WHITE);
                    nightRadioButton.setTextColor(Color.BLACK);
                    dayRadioButton.setTextColor(Color.BLACK);
                }
            }
        });
    }
}