package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
    }

    public class Comon extends AppCompatActivity {
        EditText PN, SN;

        protected void onCreate(Bundle savedInstanceState) { //Primeiro método a ser executadosuper.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            getSupportActionBar().hide(); //Obtem o banner com o titulo e esconde
            PN = findViewById(R.id.PN); //Vincula um atributo java com o do xml
            PN = findViewById(R.id.PN);

            public void subtraçao Object View;
            (View v){
                while (PN > 0) {
                    PN--;
                    PN + -= 60;
                }
                while (SN > 0) {
                    SN--;
                    SN += 60;
                }
                int resultCalculo = PN - SN;
                int resultCalculo = PN + SN;
                }
                RC.setText(resultCalculo + "PN,SN");

                @Override
                protected void onCreate (Bundle savedInstanceState){
                    super.onCreate(savedInstanceState);
                    setContentView(R.layout.activity_main);
                }
                public void calculoSoma (View v){
                    int PrN = Integer.parseInt(PN.getText().toString());
                    int SgN = Integer.parseInt(SN.getText().toString());
                    int resultCalculo = PN + SN;
                }
            }