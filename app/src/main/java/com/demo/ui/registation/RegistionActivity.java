package com.demo.ui.registation;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import com.demo.R;

public class RegistionActivity extends AppCompatActivity implements RegistationContract.RegistionView{


    private RegistationContract.RegistationPresenter mPresenter;
    private EditText t1,t2,t3,t4;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registion);
        mPresenter=new RegistationPresenter(this);

        t1=findViewById(R.id.name);
        t2=findViewById(R.id.email);
        t3=findViewById(R.id.mobile);
        t4=findViewById(R.id.address);
    }

    public void submit(View v){
        mPresenter.onRegistaionInfo(t1.getText().toString(),t2.getText().toString(),t3.getText().toString(),t4.getText().toString());
    }

    @Override
    public void onRegistionSuccess(String s) {

    }

    @Override
    public void onError() {

    }

}
