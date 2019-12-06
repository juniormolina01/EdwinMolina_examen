package com.example.edwinmolina_examen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    EditText txtusuario, txtcontraseña;
    Button btnIngresar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        txtusuario = findViewById(R.id.txtusuario);
        txtcontraseña = findViewById(R.id.txtcontraseña);
        btnIngresar = findViewById(R.id.btnIngresar);
    }

    public void ingresar (View v) {
        if (txtusuario.getText().toString().equals("estudiante2019") &&
        txtcontraseña.getText().toString().equals("uisrael2019")){

            Intent abrir = new Intent(Login.this, Registro.class);
            abrir.putExtra("valor enviado", txtusuario.getText().toString());
            startActivity(abrir);
            Toast.makeText(getApplicationContext(), "Usuario Correcto", Toast.LENGTH_LONG).show();

        }else
        {
            Toast.makeText(getApplicationContext(), "Usuario Incorrecto", Toast.LENGTH_LONG).show();
        }
    }
}
