package com.demo.ui.login;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.demo.R;

public class LoginActivity extends AppCompatActivity implements LoginContract.LoginView {

    private LoginContract.LoginPresenter mPresenter;
    private EditText name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        name=findViewById(R.id.edit_Name);
        mPresenter = new LoginPresenter(this);
    }

    @Override
    public void onLoginSuccess(String s) {
        Toast.makeText(this, "OK " +s, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onLoginError() {

    }

    public void btn(View v){
        String names=name.getText().toString();
        mPresenter.onLoginClick(names,"OK");
    }
}
