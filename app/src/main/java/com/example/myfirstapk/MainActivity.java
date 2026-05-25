package com.example.myfirstapk;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView status = findViewById(R.id.status);

        Button termux = findViewById(R.id.btn_termux);
        Button cyberdeck = findViewById(R.id.btn_cyberdeck);
        Button ai = findViewById(R.id.btn_ai);

        termux.setOnClickListener(v ->
                Toast.makeText(this, "Termux bridge not connected yet", Toast.LENGTH_SHORT).show()
        );

        cyberdeck.setOnClickListener(v ->
                Toast.makeText(this, "Cyberdeck menu placeholder", Toast.LENGTH_SHORT).show()
        );

        ai.setOnClickListener(v ->
                Toast.makeText(this, "AI router placeholder", Toast.LENGTH_SHORT).show()
        );

        status.setText("System: ONLINE ✔");
    }
}
