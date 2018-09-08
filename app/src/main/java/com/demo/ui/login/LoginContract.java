package com.demo.ui.login;

public interface LoginContract {

    interface LoginView {
        void onLoginSuccess(String s);
        void onLoginError();
    }

    interface LoginPresenter {
        void onLoginClick(String userName, String password);
    }
}
