package com.sailfish.factory.simple2;

/**
 * @author sailfish
 * @create 2017-05-21-上午11:16
 */
public interface Login {

    /**
     * 验证用户名和密码
     * @param name
     * @param password
     * @return
     */
    boolean verify(String name, String password);
}
