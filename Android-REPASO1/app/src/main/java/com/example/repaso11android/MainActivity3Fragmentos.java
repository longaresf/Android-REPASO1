package com.example.repaso11android;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;

import com.example.repaso11android.databinding.ActivityMainActivity3FragmentosBinding;

public class MainActivity3Fragmentos extends AppCompatActivity {
private ActivityMainActivity3FragmentosBinding mBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = ActivityMainActivity3FragmentosBinding.inflate(getLayoutInflater());
        setContentView(mBinding.getRoot());

        // RECIBO DATOS DESDE MAINACTIVITY2
        Intent intent = getIntent();
        String Name = getIntent().getExtras().getString("Name");
        String LastName = getIntent().getExtras().getString("LastName");
        String Mail = getIntent().getExtras().getString("Mail");
        openFragment(Name, LastName, Mail);
        openFragmentTiempo();
    }


    // MÉTODO ME ENVIE DATOS AL FRAGMENTODATOS


    private void openFragment(String Name, String LastName, String Mail) {

        BlankFragmentDatos fragmentDatos = BlankFragmentDatos.newInstance(Name, LastName, Mail);
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction()
                .add(mBinding.contenedordatos.getId(), fragmentDatos,
                        BlankFragmentDatos.class.getSimpleName());
        transaction.commit();

    }

    // METODO INSTANCIA SEGUNDO FRAGMENTO
    private void openFragmentTiempo() {
        BlankFragmentTiempo fragmentTiempo = new BlankFragmentTiempo();
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction()
                .add(mBinding.tiempo.getId(), fragmentTiempo,
                        BlankFragmentTiempo.class.getSimpleName());
        transaction.commit();


    }

}