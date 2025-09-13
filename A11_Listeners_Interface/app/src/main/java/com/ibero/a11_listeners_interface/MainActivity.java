package com.ibero.a11_listeners_interface;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 = findViewById(R.id.btn1);
        Button btn2 = findViewById(R.id.btn2);

        btn1.setOnClickListener(v -> {
            Toast.makeText(MainActivity.this, "Estás presionando el botón 1", Toast.LENGTH_SHORT).show();
        });

        btn2.setOnClickListener(v -> {
            Toast.makeText(MainActivity.this, "Estás presionando el botón 2", Toast.LENGTH_SHORT).show();
        });
    }
}
