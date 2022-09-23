package com.jesuspinar.saludos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        EditText ptName = findViewById(R.id.etName);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText etName = findViewById(R.id.etName);
        EditText etSurname = findViewById(R.id.etSurname);
        Button button = findViewById(R.id.button);

        button.setOnClickListener(v -> {
            StringBuilder sb = new StringBuilder();
            String greeting = getString(R.string.greetingMessage);
            sb.append(greeting).append(" ").append(etName.getText().toString()
                ).append(" ").append(etSurname.getText().toString());
            Toast.makeText(this, sb.toString() ,Toast.LENGTH_SHORT).show();
        });
    }
}