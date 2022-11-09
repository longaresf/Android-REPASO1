package com.example.repaso11android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.repaso11android.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    // DECLARAMOS LA VARIABLE BINDING
    private ActivityMainBinding binding;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // inflar la vista
     binding = ActivityMainBinding.inflate(getLayoutInflater());
     setContentView(binding.getRoot());


     // para ir a ña segunda actividad
        binding.registro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent passSecond = new Intent(MainActivity.this,MainActivity2Registro.class);
                startActivity(passSecond);
            }
        });

    }
}