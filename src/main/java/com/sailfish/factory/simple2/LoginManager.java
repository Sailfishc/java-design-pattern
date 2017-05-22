package com.sailfish.factory.simple2;

/**
 * @author sailfish
 * @create 2017-05-21-上午11:18
 */
public class LoginManager {

    public static Login factory(String type) {

        if ("password".equals(type)) {
            return new PasswordLogin();
        } else if ("domain".equals(type)) {
            return new DomainLogin();
        } else {
            /**
             * 这里抛出一个自定义异常会更恰当
             */
            throw new RuntimeException("没有找到登录类型");
        }
    }
}
