package com.ibero.a16_toggle_buttons;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.Toast;
import android.widget.ToggleButton;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CheckBox checkBox = findViewById(R.id.checkBox2);
        RadioButton radioButton = findViewById(R.id.radioButton2);
        ToggleButton toggleButton = findViewById(R.id.toggleButton2);

        checkBox.setOnCheckedChangeListener((buttonView, isChecked) -> {
            String estado = isChecked ? "activado" : "desactivado";
            Toast.makeText(MainActivity.this, "CheckBox " + estado, Toast.LENGTH_SHORT).show();
        });

        radioButton.setOnCheckedChangeListener((buttonView, isChecked) -> {
            String estado = isChecked ? "activado" : "desactivado";
            Toast.makeText(MainActivity.this, "RadioButton " + estado, Toast.LENGTH_SHORT).show();
        });

        toggleButton.setOnCheckedChangeListener((buttonView, isChecked) -> {
            String estado = isChecked ? "activado" : "desactivado";
            Toast.makeText(MainActivity.this, "ToggleButton " + estado, Toast.LENGTH_SHORT).show();
        });
    }
}
