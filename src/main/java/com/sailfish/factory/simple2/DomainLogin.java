package com.sailfish.factory.simple2;

/**
 * 登录方式一
 * @author sailfish
 * @create 2017-05-21-上午11:16
 */
public class DomainLogin implements Login{


    @Override
    public boolean verify(String name, String password) {

        /**
         * todo 业务逻辑
         */
        return true;
    }
}
