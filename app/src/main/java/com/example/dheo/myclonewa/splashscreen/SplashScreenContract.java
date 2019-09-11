package com.example.dheo.myclonewa.splashscreen;

import com.example.dheo.myclonewa.base.BaseView;

public interface SplashScreenContract {

    //TODO meletakan methode logika
    interface SplashScreenPresenter{

        void onRunSplash(long delay);
    }

    //TODO meletakan metohde untuk tmenampilkan tampilan
    interface SplashScreenView extends BaseView{

        void onDo();
    }

}
