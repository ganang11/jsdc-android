package com.example.app.jsdc;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.app.jsdc.R;


public class Tes_Praktek extends Fragment {

    View view;
    Button firstButton;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_tes__praktek, container, false);
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tes__praktek, container, false);
    }

}
