package com.willer.ordersapp;

import android.widget.FrameLayout;
import android.widget.ProgressBar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public abstract class BaseActivity extends AppCompatActivity {

    public ProgressBar mProgressBar;

    @Override
    public void setContentView(int layoutResID) {

        ConstraintLayout constraintLayout = (ConstraintLayout) getLayoutInflater().inflate(R.layout.activity_base, null);
        // FrameLayout que contendra los elementos de las demás actividades
        FrameLayout frameLayout = constraintLayout.findViewById(R.id.activity_content);
        // Progress Bar que tendrán todas las actividades que hereden de esta
        mProgressBar = constraintLayout.findViewById(R.id.progress_bar);

        // Enlazamos el frameLayout con el layoutResID que será el layout de todas las actividades
        // que hereden de esta actividad base
        getLayoutInflater().inflate(layoutResID, frameLayout, true);

        super.setContentView(constraintLayout);
    }
}
