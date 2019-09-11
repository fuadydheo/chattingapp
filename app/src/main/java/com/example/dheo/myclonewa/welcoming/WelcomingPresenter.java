package com.example.dheo.myclonewa.welcoming;

import android.view.View;

import com.example.dheo.myclonewa.R;
import com.example.dheo.myclonewa.base.BasePresenter;

public class WelcomingPresenter implements BasePresenter<WelcomingContract.WelcomingView>, WelcomingContract.WelcomingPresenter {

    private WelcomingContract.WelcomingView _view;

    WelcomingPresenter(WelcomingContract.WelcomingView _view){
        this._view = _view;
    }

    @Override
    public void onAttach(WelcomingContract.WelcomingView view) {

        this._view = view;
    }

    @Override
    public void onDettach() {

        this._view = null;
    }


    @Override
    public void getId(View view) {
        switch (view.getId()){
            case R.id.btn_login:
                _view.onMove();
                break;
            case R.id.btn_register:
                _view.onMoves();
                break;
        }
    }
}
