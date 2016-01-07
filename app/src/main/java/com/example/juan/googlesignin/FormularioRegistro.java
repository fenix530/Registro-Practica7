package com.example.juan.googlesignin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FormularioRegistro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario_registro);

        final EditText Usuario=(EditText) findViewById(R.id.usuario);
        final EditText Contraseña=(EditText) findViewById(R.id.contraseña);
        final EditText email=(EditText) findViewById(R.id.email);
        Button Registro=(Button)findViewById(R.id.bRegistro);

        Registro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String User;
                if (Usuario.getText().toString().equals("")) {
                    Toast.makeText(getApplication(), "Ingrese Un Usuario", Toast.LENGTH_SHORT).show();
                } else {
                    if (Contraseña.getText().toString().equals("")) {
                        Toast.makeText(getApplication(), "Ingrese Una Contraseña", Toast.LENGTH_SHORT).show();
                    } else {
                        if (email.getText().toString().equals("")) {
                            Toast.makeText(getApplication(), "Ingrese Un Email", Toast.LENGTH_SHORT).show();
                        } else {
                            String User1 = Usuario.getText().toString();
                            String mail = email.getText().toString();
                            Intent i = new Intent(getApplication(), SignInActivity.class);
                            i.putExtra("user", User1);
                            i.putExtra("mail", mail);
                            Toast.makeText(getApplication(), "Registro Completo, Seccion Iniciada", Toast.LENGTH_SHORT).show();
                            startActivity(i);
                        }
                    }
                }

            }
        });

    }
}
