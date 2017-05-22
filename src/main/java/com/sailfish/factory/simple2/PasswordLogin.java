package com.sailfish.factory.simple2;

/**
 * 登录方式二
 * @author sailfish
 * @create 2017-05-21-上午11:17
 */
public class PasswordLogin implements Login {

    @Override
    public boolean verify(String name, String password) {

        /**
         * todo 业务逻辑
         */
        return true;
    }
}
