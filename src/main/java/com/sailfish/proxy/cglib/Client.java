package com.sailfish.proxy.cglib;

import com.sailfish.proxy.jdkproxy.Greeting;
import com.sailfish.proxy.jdkproxy.GreetingImpl;
import net.sf.cglib.proxy.Enhancer;

/**
 * Created by travis on 2016/10/16.
 */
public class Client {

    public static void main(String[] args) {
        Greeting greeting = new GreetingImpl();
        CGLibProxy cgLibProxy = new CGLibProxy();
        //cglib中加强器，用来创建动态代理
        Enhancer enhancer = new Enhancer();
        //设置要创建动态代理的类
        enhancer.setSuperclass(greeting.getClass());
        // 设置回调，这里相当于是对于代理类上所有方法的调用，都会调用CallBack，而Callback则需要实行intercept()方法进行拦截
        enhancer.setCallback(cgLibProxy);

        Greeting greetingInstance = (Greeting) enhancer.create();
        greetingInstance.say("cheng");
    }
}
/*
before....
Hello! cheng
after....
*/