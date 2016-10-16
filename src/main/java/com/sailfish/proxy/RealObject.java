package com.sailfish.proxy;

/**
 * 目标对象角色
 * Created by travis on 2016/10/16.
 */
public class RealObject extends AbstractObject {

    @Override
    public void operation() {
        //一些操作
        System.out.println("一些操作");
    }
}
