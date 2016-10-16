package com.sailfish.proxy.jdkproxy;

/**
 * Created by travis on 2016/10/16.
 */
public class GreetingImpl implements Greeting {

    public void say(String name) {
        System.out.println("Hello! " + name);
    }
}
