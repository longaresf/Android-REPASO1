package com.example.repaso11android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.example.repaso11android.databinding.ActivityMainActivity2RegistroBinding;

public class MainActivity2Registro extends AppCompatActivity {

    private ActivityMainActivity2RegistroBinding mbinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        mbinding = ActivityMainActivity2RegistroBinding.inflate(getLayoutInflater());
        setContentView(mbinding.getRoot());

        //__________________________________________________________________________
        // --- ESCUCHADOR BUTTON PARA CAPTAR INFORMACIÓN Y LUEGO ENVIAR DATOS CON INTENT

        mbinding.enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // captar lo escribe el usuario
                String name = mbinding.name.getText().toString();
                String lastName = mbinding.lastName.getText().toString();
                String Mail = mbinding.Mail.getText().toString();

                Log.d("Prueba", name + "  " + lastName);

                if (name.isEmpty() || lastName.isEmpty() || Mail.isEmpty()) {
                    Toast.makeText(MainActivity2Registro.this, "Complete los campos", Toast.LENGTH_LONG).show();
                } else {

                    Toast.makeText(MainActivity2Registro.this, "Hola" + name + "" + lastName, Toast.LENGTH_LONG).show();
                    //llamar al método
                    passMain3(name, lastName, Mail);

                }


            }
        });

    }






        // METODO PARA ENVIAR INFORMACION A MAIN ACTIVITY 3
        private void passMain3(String name, String lastName, String Mail) {
            Log.d("Prueba"," "+name +" " + lastName);
            Intent passmain3 = new Intent(MainActivity2Registro.this, MainActivity3Fragmentos.class);
            passmain3.putExtra("Name", name);
            passmain3.putExtra("LastName", lastName);
            passmain3.putExtra("Mail", Mail);
            startActivity(passmain3);

        }




    }
