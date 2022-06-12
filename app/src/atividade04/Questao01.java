package com.example.appdispmoveis;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText Numero01;
    TextView Resultado01;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Numero01 = findViewById(R.id.Numero01);
        Resultado01 = findViewById(R.id.Resultado01);
    }

    @SuppressLint("SetTextI18n")
    public void RetornarMaior(View view) {
        double n1 = Double.parseDouble(Numero01.getText().toString());

        Resultado01.setText("O Quadrado desse numero: " + (n1 * n1));
    }
}