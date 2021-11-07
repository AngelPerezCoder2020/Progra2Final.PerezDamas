package com.example.calculadoraperezdamas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button buttonC,buttonINFO,buttonDIVISION,button7, button8, button9,
    buttonMULTIPLICACION, button4, button5,button6, buttonMENOS,button1,
    button2, button3,buttonSUMAR,button0,buttonPUNTO,buttonIGUAL;
    private TextView pantalla;
    private double num1 = 0.0;
    private double num2 = 0.0;
    private int operacion = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("ANGEL DARIO PEREZ DAMAS");
        pantalla = findViewById(R.id.textViewRESULTADOS);
        pantalla.setText("0");
        buttonC = findViewById(R.id.buttonC);
        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = 0.0;num2=0.0;operacion=0;pantalla.setText("0");
            }
        });
        buttonINFO = findViewById(R.id.buttonINFO);
        buttonINFO.setOnClickListener(new View.OnClickListener() {
            Context context = getApplicationContext();
            @Override
            public void onClick(View v) {
                Intent abrir = new Intent(context,INFOactivity.class);
                startActivity(abrir);
            }
        });
        buttonDIVISION = findViewById(R.id.buttonDIVISION);
        buttonDIVISION.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operacion = 1;
                num1 = Double.parseDouble(pantalla.getText().toString());
                pantalla.setText("0");
            }
        });
        buttonSUMAR = findViewById(R.id.buttonSUMAR);
        buttonSUMAR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operacion = 2;
                num1 = Double.parseDouble(pantalla.getText().toString());
                pantalla.setText("0");
            }
        });
        buttonMULTIPLICACION = findViewById(R.id.buttonMULTIPLICAR);
        buttonMULTIPLICACION.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operacion = 3;
                num1 = Double.parseDouble(pantalla.getText().toString());
                pantalla.setText("0");
            }
        });
        buttonMENOS = findViewById(R.id.buttonRESTAR);
        buttonMENOS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operacion = 4;
                num1 = Double.parseDouble(pantalla.getText().toString());
                pantalla.setText("0");
            }
        });
        buttonPUNTO = findViewById(R.id.buttonPUNTO);
        buttonIGUAL = findViewById(R.id.buttonIGUAL);
        buttonIGUAL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double resultado = 0;
                switch(operacion){
                    case 1:
                        resultado = num1/num2;
                        pantalla.setText(String.valueOf(resultado));
                        break;
                    case 2:
                        resultado = num1+num2;
                        pantalla.setText(String.valueOf(resultado));
                        break;
                    case 3:
                        resultado = num1*num2;
                        pantalla.setText(String.valueOf(resultado));
                        break;
                    case 4:
                        resultado = num1-num2;
                        pantalla.setText(String.valueOf(resultado));
                        break;
                }
                num1 = resultado;
            }
        });
        buttonPUNTO.setOnClickListener(this);
        button7 = findViewById(R.id.button7);
        button7.setOnClickListener(this);
        button8 = findViewById(R.id.button8);
        button8.setOnClickListener(this);
        button9 = findViewById(R.id.button9);
        button9.setOnClickListener(this);
        button4 = findViewById(R.id.button4);
        button4.setOnClickListener(this);
        button5 = findViewById(R.id.button5);
        button5.setOnClickListener(this);
        button6 = findViewById(R.id.button6);
        button6.setOnClickListener(this);
        button1 = findViewById(R.id.button1);
        button1.setOnClickListener(this);
        button2 = findViewById(R.id.button2);
        button2.setOnClickListener(this);
        button3 = findViewById(R.id.button3);
        button3.setOnClickListener(this);
        button0 = findViewById(R.id.button0);
        button0.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Button b = (Button) v;
        String valor = b.getText().toString();
        if(pantalla.getText().toString().equals("0") && !valor.equals(".")){
            pantalla.setText(valor);
        }else{
            pantalla.setText(pantalla.getText().toString()+valor);
        }
        if(operacion==0){
            num1 = Double.parseDouble(pantalla.getText().toString());
        }else{
            num2 = Double.parseDouble(pantalla.getText().toString());
        }
    }
}