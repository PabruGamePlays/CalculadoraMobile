package com.example.calculadoraac1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText txtNum1;
    private EditText txtNum2;
    private TextView tvResultado;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtNum1 = findViewById(R.id.txtNum1);
        txtNum2 = findViewById(R.id.txtNum2);
        tvResultado = findViewById(R.id.tvResultado);
    }

    public void somar(View view){
        int valor1 = Integer.parseInt(txtNum1.getText().toString());
        int valor2 = Integer.parseInt(txtNum2.getText().toString());

        tvResultado.setText(String.valueOf(valor1 + valor2));
    }

    public void subtrair (View view){
        int valor1 = Integer.parseInt(txtNum1.getText().toString());
        int valor2 = Integer.parseInt(txtNum2.getText().toString());

        tvResultado.setText(String.valueOf(valor1 - valor2));
    }

    public void multiplicar(View view){
        int valor1 = Integer.parseInt(txtNum1.getText().toString());
        int valor2 = Integer.parseInt(txtNum2.getText().toString());

        tvResultado.setText(String.valueOf(valor1 * valor2));
    }

    public void dividir(View view){
        int valor1 = Integer.parseInt(txtNum1.getText().toString());
        int valor2 = Integer.parseInt(txtNum2.getText().toString());

        tvResultado.setText(String.valueOf(valor1 / valor2));
    }
}