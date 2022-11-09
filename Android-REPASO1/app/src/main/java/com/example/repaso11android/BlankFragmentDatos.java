package com.example.repaso11android;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.repaso11android.databinding.FragmentBlankDatosBinding;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link BlankFragmentDatos#newInstance} factory method to
 * create an instance of this fragment.
 */
public class BlankFragmentDatos extends Fragment {


   private FragmentBlankDatosBinding mBinding;
    private String name;
    private String LastName;
    private String Mail;

    public BlankFragmentDatos() {
        // Required empty public constructor
    }


    // TODO: Rename and change types and number of parameters
    public static BlankFragmentDatos newInstance(String name, String LastName,String Mail) {
        BlankFragmentDatos fragment = new BlankFragmentDatos();
       // recibir o enviar datos
        Bundle args = new Bundle();
        args.putString("name", name);
        args.putString("lastName", LastName);
        args.putString("Mail", Mail);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            name = getArguments().getString("name");
            LastName = getArguments().getString("lastName");
            Mail = getArguments().getString("Mail");
            Log.d("Prueba12"," "+name +" " + LastName);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mBinding= FragmentBlankDatosBinding.inflate(inflater,container,false);
        return mBinding.getRoot();
    }


    // para setear las variables recibidas
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        mBinding.name1.setText(name);
        mBinding.LastName.setText(LastName);
        mBinding.Mail1.setText(Mail);
    }
}