package com.example.dheo.myclonewa.welcoming;

import android.view.View;

import com.example.dheo.myclonewa.base.BaseView;

public interface WelcomingContract {

    interface WelcomingPresenter {
        void getId(View view);
    }

    interface WelcomingView extends BaseView{
        void onMove();
        void onMoves();
    }
}
