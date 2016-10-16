package com.sailfish.proxy;

/**
 * 代理对象角色
 * Created by travis on 2016/10/16.
 */
public class ProxyObject extends AbstractObject {

    RealObject realObject = new RealObject();

    @Override
    public void operation() {
        //调用目标对象之前可以做相关操作
        System.out.println("before");
        realObject.operation();
        System.out.println("after");
    }
}
