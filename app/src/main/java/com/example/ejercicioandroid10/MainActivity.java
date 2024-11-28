package com.example.ejercicioandroid10;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.EditText;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
Button botonComprobar;
EditText nombre;
EditText apellido;
TextView resultado;
DatabaseHelper db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        botonComprobar=findViewById(R.id.button);
        nombre=findViewById(R.id.tNombre);
        apellido=findViewById(R.id.tApellido);
        resultado=findViewById(R.id.tResultado);
        db=new DatabaseHelper(this);



        botonComprobar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Tnombre=nombre.getText().toString();
                String Tapellido=nombre.getText().toString();
                boolean Tresultado=db.comprobarProfesor(Tnombre,Tapellido);
                if(Tresultado){
                    resultado.setText("Si,existe este profesor");
                }else{
                    resultado.setText("No en Medac nadie se llama así");
                }

            }
        });

    }
}