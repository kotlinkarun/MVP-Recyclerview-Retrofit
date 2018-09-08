package com.demo.ui.login;

public class LoginPresenter implements LoginContract.LoginPresenter {

    private LoginContract.LoginView mView;

    public LoginPresenter(LoginContract.LoginView mView) {
        this.mView = mView;
    }

    @Override
    public void onLoginClick(String userName, String password) {
        if(userName.equals("kkk")) {
            mView.onLoginSuccess("Right");
        }
    }
}
