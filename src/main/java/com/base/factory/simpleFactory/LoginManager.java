package com.base.factory.simpleFactory;
/**
 * ��¼������<br>
 * ��򵥵Ĺ���ģʽ<br>
 * 	�����������Login�ӿڵ�ʵ���ࡣDomainLogin��PasswordLogin
 *	���ݵ����߲�ͬ��Ҫ�󣬴�������ͬ�ĵ�¼���󲢷���
 */
public class LoginManager {
    public static Login factory(String type){
        if(type.equals("password")){
            
            return new PasswordLogin();
            
        }else if(type.equals("passcode")){
            
            return new DomainLogin();
            
        }else{
            /**
             * �����׳�һ���Զ����쳣���ǡ��
             */
            throw new RuntimeException("û���ҵ���¼����");
        }
    }
}
