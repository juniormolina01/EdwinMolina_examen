package com.example.edwinmolina_examen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Registro extends AppCompatActivity {

    TextView lblusuarior;
    EditText txtnombre, txtcuotainicial, txtmontomensual;
    Bundle datosrecibidos;
    Button btnguardarRegistro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
        lblusuarior = findViewById(R.id.txtusuario);
        datosrecibidos = getIntent().getExtras();
        String datos = datosrecibidos.getString("valor enviado");
        lblusuarior.setText(datos);
        txtnombre = findViewById(R.id.txtnombre);
        txtcuotainicial = findViewById(R.id.txtmontoinicial);
        txtmontomensual = findViewById(R.id.txtpagomensual);
    }
    public void guardarregistro (View v){
        Intent abrir = new Intent(Registro.this, Resumen.class);


    }
}
