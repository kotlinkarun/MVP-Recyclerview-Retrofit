package com.demo.ui.registation;

public interface RegistationContract {

    interface RegistionView{
        void onRegistionSuccess(String s);
        void onError();
    }


    interface RegistationPresenter{
        void onRegistaionInfo(String name, String email, String mobile, String add);
    }

}
