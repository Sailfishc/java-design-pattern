package com.sailfish.proxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by travis on 2016/10/16.
 */
public class Client {

    public static void main(String[] args) {
        Greeting greeting = new GreetingImpl();
        //获取对应的Classloader
        ClassLoader classLoader = greeting.getClass().getClassLoader();
        //获取greeting所实现的所有接口
        Class<?>[] interfaces = greeting.getClass().getInterfaces();
        //设置一个来自代理传递过来的方法调用请求处理器，处理所有的代理对象上的方法调用
        InvocationHandler handler = new DynamicProxy(greeting);
        /**
         * 根据上面提供的信息，创建代理对象，在这个过程中
         * 1、JDK会根据传入的参数信息动态的在内存中创建和.class文件等同的字节码
         * 2、然后根据相应的字节码转为对应的class
         * 3、调用newInstance()创建实例
         */
        Greeting proxyInstance = (Greeting) Proxy.newProxyInstance(classLoader, interfaces, handler);

        proxyInstance.say("cheng");
    }
}
/*
before....
Hello! cheng
after....
*/