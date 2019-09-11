package com.example.dheo.myclonewa.base;

public interface BasePresenter<V extends BaseView> {
    void onAttach(V view);
    void onDettach();
}
