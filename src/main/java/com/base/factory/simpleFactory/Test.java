package com.base.factory.simpleFactory;

public class Test {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String loginType = "password";
        String name = "name";
        String password = "password";
        
        /*
         * ��������loginType���͵Ĳ�ͬ������ͬLogin����
         */
        Login login = LoginManager.factory(loginType);
        boolean bool = login.verify(name, password);
        if (bool) {
            /**
             * ҵ���߼�
             */
        } else {
            /**
             * ҵ���߼�
             */
        }
    }
}
