package com.base.factory.simpleFactory;

public class DomainLogin implements Login {

    @Override
    public boolean verify(String name, String password) {
        /**
         * ÒµÎñÂß¼­
         */
        return true;
    }

}