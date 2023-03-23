package com.example.calculadora;

import android.os.Bundle;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;


import java.util.Scanner;

public class MainActivity extends AppCompatActivity {
    EditText num1, num2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        int resultado = 0;
        float resultFloat = 0;
    }
    public static class Calc {
        /*Declaração dos métodos*/
        public int som(int num1, int num2) {
            return num1 + num2;
        }

        public int sub(int num1, int num2) {
            return num1 - num2;
        }

        public int div(int num1, int num2) {
            return num1 / num2;
        }

        public int mult(int num1, int num2) {
            return num1 * num2;
        }

        public void main(String[] args) {
            //criando um objeto c a apartir do metodo calc
            Calc c = new Calc();

            //declarando as varíaveis
            int num1;
            int num2;

                }
            }
        }