package com.example.dheo.myclonewa.splashscreen;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


import com.example.dheo.myclonewa.R;
import com.example.dheo.myclonewa.welcoming.WelcomingActivity;


public class SplashScreenActivity extends AppCompatActivity implements SplashScreenContract.SplashScreenView {

    SplashScreenPresenter presenter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);

        presenter = new SplashScreenPresenter(this);

        presenter.onRunSplash(3000);

    }


    @Override
    public void onDo() {
        startActivity(new Intent(SplashScreenActivity.this, WelcomingActivity.class));

        finish();
    }

    @Override
    public void onAttachView() {
        presenter.onAttach(this);
    }

    @Override
    public void onDettachView() {

        presenter.onDettach();
    }

    @Override
    protected void onStart() {
        super.onStart();
        onAttachView();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        onDettachView();


    }
}
