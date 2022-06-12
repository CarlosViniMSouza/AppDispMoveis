package com.example.appdispmoveis;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText Numero01;
    EditText Numero02;
    EditText Numero03;
    TextView Resultado01;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Numero01 = findViewById(R.id.Numero01);
        Numero02 = findViewById(R.id.Numero02);
        Numero03 = findViewById(R.id.Numero03);
        Resultado01 = findViewById(R.id.Resultado01);
    }

    @SuppressLint("SetTextI18n")
    public void Ordenar(View view) {
        double n1 = Double.parseDouble(Numero01.getText().toString());
        double n2 = Double.parseDouble(Numero02.getText().toString());
        double n3 = Double.parseDouble(Numero03.getText().toString());

        if (n1 > n2 && n1 > n3) {
            if (n2 > n3) {
                Resultado01.setText("Em Ordem Crescente: " + n3 + " , " + n2 + " , " + n1);
            }
            else {
                Resultado01.setText("Em Ordem Crescente: " + n2 + " , " + n3 + " , " + n1);
            }
        }

        else if (n2 > n1 && n2 > n3) {
            if (n1 > n3) {
                Resultado01.setText("Em Ordem Crescente: " + n3 + " , " + n1 + " , " + n2);
            }
            else {
                Resultado01.setText("Em Ordem Crescente: " + n1 + " , " + n3 + " , " + n2);
            }
        }

        else if (n3 > n1 && n3 > n2) {
            if (n1 > n2) {
                Resultado01.setText("Em Ordem Crescente: " + n2 + " , " + n1 + " , " + n3);
            } else {
                Resultado01.setText("Em Ordem Crescente: " + n1 + " , " + n2 + " , " + n3);
            }
        }
    }
}