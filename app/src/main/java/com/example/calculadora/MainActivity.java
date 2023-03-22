package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
    }
    import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

    public class Comon extends AppCompatActivity {
        EditText PN, SN;

        protected void onCreate(Bundle savedInstanceState) { //Primeiro método a ser executadosuper.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            getSupportActionBar().hide(); //Obtem o banner com o titulo e esconde
            PN = findViewById(R.id.PN); //Vincula um atributo java com o do xml
            PN = findViewById(R.id.PN);

            public void subtrai Object View;
            (View v){
                while(PN>0){
                    PN --;
                    PN +-= 60;
                }
                while(SN>0){
                    SN --;
                    SN += 60;
                }
                int resultHora = 0;
                int resultMin = PN-SN;
                if(PN>SN){
                    resultMin = PN-SN;
                }
                while(resultMin = 59){
                    resultHora ++;
                    resultMin -= 60;
                }
                RC.setText(resultCalculo+"");

                @Override
                protected void onCreate(Bundle savedInstanceState) {
                    super.onCreate(savedInstanceState);
                    setContentView(R.layout.activity_main);
                }
                public void calculoSoma(View v){
                    int HoI = Integer.parseInt(PN.getText().toString());
                    int MinI = Integer.parseInt(PN.getText().toString());
                    int HoF = Integer.parseInt(SN.getText().toString());
                    int MinF = Integer.parseInt(SN.getText().toString());
                    int HoraFinal = HoI+HoF;
                    int MinFinal = MinI+MinF;
                    String Mensagem = "Os valores são invalidos"; //String para valores negativos
                    while (MinFinal>=60){
                        MinFinal = MinFinal-60;
                        HoraFinal = HoraFinal+1;
                    }
                    RC.setText(PrimeiroNumero+":"+SegundoNumero);
                }
}