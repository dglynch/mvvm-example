package com.example.myapplication;

import androidx.lifecycle.ViewModel;

class MyViewModel extends ViewModel {
    private boolean flag;

    void pokeFlag() {
        flag = !flag;
    }

    boolean getFlag() {
        return flag;
    }
}
