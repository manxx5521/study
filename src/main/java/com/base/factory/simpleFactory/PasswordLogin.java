package com.base.factory.simpleFactory;

public class PasswordLogin implements Login {

    @Override
    public boolean verify(String name, String password) {
        /**
         * ҵ���߼�
         */
        return true;
    }

}
