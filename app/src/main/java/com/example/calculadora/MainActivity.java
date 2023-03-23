package com.example.calculadora;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    EditText num1, num2;
    TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        resultado = findViewById(R.id.resultado);
        int resultado = 0;
        float resultFloat = 0;
    }

    public void calculoSom(View v) {
        int num1 = Integer.parseInt(num1.getText().toString());
        int num2 = Integer.parseInt(num2.getText().toString());
        resultado.setText(num1 + num2);
    }

    public void calculoSub(View v) {
        int num1 = Integer.parseInt(num1.getText().toString());
        int num2 = Integer.parseInt(num2.getText().toString());
        resultado.setText(num1 - num2);
    }

    public void calculoDiv(View v) {
        int num1 = Integer.parseInt(num1.getText().toString());
        int num2 = Integer.parseInt(num2.getText().toString());
        resultado.setText(num1 / num2);
    }

    public void calculoMult(View v) {
        int num1 = Integer.parseInt(num1.getText().toString());
        int num2 = Integer.parseInt(num2.getText().toString());
        resultado.setText(num1 * num2);
    }
}