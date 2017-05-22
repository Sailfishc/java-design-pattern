package com.sailfish.factory.simple2;

/**
 * @author sailfish
 * @create 2017-05-21-上午11:19
 */
public class Test {

    public static void main(String[] args) {
        String name = "a";
        String password = "b";
        String type = "password";
        Login login = LoginManager.factory(type);
        boolean verify = login.verify(name, password);
        if (verify) {

            /**
             * todo 业务逻辑
             */
        } else {
            /**
             * todo 业务逻辑
             */

        }
    }
}
