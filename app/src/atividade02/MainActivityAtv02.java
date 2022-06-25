package com.example.appdispmoveis;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText Numero01;
    EditText Numero02;
    EditText Numero03;
    EditText Numero04;
    TextView Resultado01;
    TextView Resultado02;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Numero01 = findViewById(R.id.Numero01);
        Numero02 = findViewById(R.id.Numero02);
        Numero03 = findViewById(R.id.Numero03);
        Numero04 = findViewById(R.id.Numero04);
        Resultado01 = findViewById(R.id.Resultado01);
        Resultado02 = findViewById(R.id.Resultado02);
    }

    public void Somar(View view) {
        double n1 = Double.parseDouble(Numero01.getText().toString());
        double n2 = Double.parseDouble(Numero02.getText().toString());
        double nR1 = n1 + n2;

        Resultado01.setText("O resultado sera: " + nR1);

        double n3 = Double.parseDouble(Numero03.getText().toString());
        double n4 = Double.parseDouble(Numero04.getText().toString());
        double nR2 = n3 + n4;

        Resultado02.setText("O resultado sera: " + nR2);
    }


    public void Sub(View view) {
        double n1 = Double.parseDouble(Numero01.getText().toString());
        double n2 = Double.parseDouble(Numero02.getText().toString());
        double nR1 = n1 - n2;

        Resultado01.setText("O resultado sera: " + nR1);

        double n3 = Double.parseDouble(Numero03.getText().toString());
        double n4 = Double.parseDouble(Numero04.getText().toString());
        double nR2 = n3 - n4;

        Resultado02.setText("O resultado sera: " + nR2);
    }

    public void Mult(View view) {
        double n1 = Double.parseDouble(Numero01.getText().toString());
        double n2 = Double.parseDouble(Numero02.getText().toString());
        double nR1 = n1 * n2;

        Resultado01.setText("O resultado sera: " + nR1);

        double n3 = Double.parseDouble(Numero03.getText().toString());
        double n4 = Double.parseDouble(Numero04.getText().toString());
        double nR2 = n3 * n4;

        Resultado02.setText("O resultado sera: " + nR2);
    }

    public void Div(View view) {
        double n1 = Double.parseDouble(Numero01.getText().toString());
        double n2 = Double.parseDouble(Numero02.getText().toString());
        double nR1 = n1 / n2;

        Resultado01.setText("O resultado sera: " + nR1);

        double n3 = Double.parseDouble(Numero03.getText().toString());
        double n4 = Double.parseDouble(Numero04.getText().toString());
        double nR2 = n3 / n4;

        Resultado02.setText("O resultado sera: " + nR2);
    }
}