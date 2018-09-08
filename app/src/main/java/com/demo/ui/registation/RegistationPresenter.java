package com.demo.ui.registation;

public class RegistationPresenter implements RegistationContract.RegistationPresenter {
   private RegistationContract.RegistionView mView;

    public RegistationPresenter(RegistationContract.RegistionView mView) {
        this.mView = mView;
    }


    @Override
    public void onRegistaionInfo(String name, String email, String mobile, String add) {



    }
}
