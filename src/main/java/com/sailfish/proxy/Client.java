package com.sailfish.proxy;

/**
 * Created by travis on 2016/10/16.
 */
public class Client {

    public static void main(String[] args) {
        //TODO auto-generated method stub
        AbstractObject obj = new ProxyObject();
        obj.operation();
    }
}
/*
before
一些操作
after
*/