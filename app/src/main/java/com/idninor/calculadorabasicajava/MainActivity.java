package com.idninor.calculadorabasicajava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Inicializar botones//
    private Button btn_sumar;
    private Button btn_restar;
    private Button btn_multiplicar;
    private Button btn_dividir;

    //Inicializar Textos//
    private TextView txt_respuesta;
    private EditText txt_numero1;
    private EditText txt_numero2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Relación modelo - vista//
        txt_respuesta = findViewById(R.id.txt_resultado);
        txt_numero1 = findViewById(R.id.txt_primernumero);
        txt_numero2 = findViewById(R.id.txt_segundonumero);
        btn_sumar = findViewById(R.id.btnSuma);
        btn_restar = findViewById(R.id.btnResta);
        btn_multiplicar = findViewById(R.id.btnMultipli);
        btn_dividir = findViewById(R.id.btnDiv);

        //Uso de botones para operar//
        btn_sumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double numero1 = Double.parseDouble(txt_numero1.getText().toString());
                double numero2 = Double.parseDouble(txt_numero2.getText().toString());
                double resultado = suma(numero1, numero2);
                txt_respuesta.setText(""+resultado);
            }
        });

        btn_restar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double numero1 = Double.parseDouble(txt_numero1.getText().toString());
                double numero2 = Double.parseDouble(txt_numero2.getText().toString());
                double resultado = resta(numero1, numero2);
                txt_respuesta.setText(""+resultado);
            }
        });

        btn_multiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double numero1 = Double.parseDouble(txt_numero1.getText().toString());
                double numero2 = Double.parseDouble(txt_numero2.getText().toString());
                double resultado = multiplicacion(numero1, numero2);
                txt_respuesta.setText(""+resultado);
            }
        });

        btn_dividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double numero1 = Double.parseDouble(txt_numero1.getText().toString());
                double numero2 = Double.parseDouble(txt_numero2.getText().toString());
                double resultado = division(numero1, numero2);
                txt_respuesta.setText(""+resultado);
            }
        });
    }

    //Funciones de la calculadora//

    public double suma(double x, double y){
        return  x + y;
    }

    public double resta(double x, double y){
        return x - y;
    }

    public double multiplicacion(double x, double y){
        return  x * y;
    }

    public double division(double x, double y){
        return x / y;
    }
}