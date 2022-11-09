package com.example.repaso11android;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.repaso11android.databinding.FragmentBlankDatosBinding;
import com.example.repaso11android.databinding.FragmentBlankTiempoBinding;


public class BlankFragmentTiempo extends Fragment {


private FragmentBlankTiempoBinding mBinding;
    public BlankFragmentTiempo() {
        // Required empty public constructor
    }


    // TODO: Rename and change types and number of parameters
    public static BlankFragmentTiempo newInstance(String param1, String param2) {
        BlankFragmentTiempo fragment = new BlankFragmentTiempo();
        Bundle args = new Bundle();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mBinding= FragmentBlankTiempoBinding.inflate(inflater,container,false);
        return mBinding.getRoot();

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {

        WebView webview =(WebView) mBinding.webview;
        webview.setWebViewClient(new WebViewClient());
        WebSettings webSettings = webview.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webview.loadUrl("https://www.tutiempo.net/chile.html");
    }
}