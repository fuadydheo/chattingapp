package com.example.dheo.myclonewa.welcoming;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import androidx.appcompat.app.AppCompatActivity;

import com.example.dheo.myclonewa.R;
import com.example.dheo.myclonewa.login.LoginActivity;
import com.example.dheo.myclonewa.register.RegisterActivity;

public class WelcomingActivity extends AppCompatActivity implements WelcomingContract.WelcomingView, View.OnClickListener {

    WelcomingPresenter presenter;
    Button btnLogin, btnRegister;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcoming);

        btnLogin = findViewById(R.id.btn_login);
        btnRegister = findViewById(R.id.btn_register);

        btnLogin.setOnClickListener(this);
        btnRegister.setOnClickListener(this);

        presenter = new WelcomingPresenter(this);


    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_login:
                onMove();
                break;

            case R.id.btn_register:
                onMoves();
                break;
            }
//        presenter.getId(view);
        }


    @Override
    public void onMove() {
        startActivity(new Intent(WelcomingActivity.this, LoginActivity.class));

        finish();
    }

    @Override
    public void onMoves() {
        startActivity(new Intent(WelcomingActivity.this, RegisterActivity.class));

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
