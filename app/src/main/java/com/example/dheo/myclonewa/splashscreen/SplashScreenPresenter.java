package com.example.dheo.myclonewa.splashscreen;

import android.os.Handler;

import com.example.dheo.myclonewa.base.BasePresenter;

public class SplashScreenPresenter implements BasePresenter<SplashScreenContract.SplashScreenView>, SplashScreenContract.SplashScreenPresenter {

        private SplashScreenContract.SplashScreenView _view;

        SplashScreenPresenter(SplashScreenContract.SplashScreenView _view){
            this._view = _view;
        }

        @Override
        public void onAttach(SplashScreenContract.SplashScreenView view) {
            _view = view;
        }

        @Override
        public void onDettach() {
            _view = null;
        }

        @Override
        public void onRunSplash(long delay) {
            new Handler().postDelayed(new Runnable(){
            @Override
            public void run(){
                _view.onDo();
                }
            },delay);
        }
    }
