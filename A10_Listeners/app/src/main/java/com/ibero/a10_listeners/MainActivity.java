package com.ibero.a10_listeners;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.Anon);
        TextView textView7 = findViewById(R.id.textView7);

        button.setOnClickListener(v -> {
            textView7.setText("¡Una función anónima está corriendo!");
        });
    }
}
