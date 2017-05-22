package com.sailfish.singleton;

/**
 * 饿汉式单例
 * 饿汉式是典型的空间换时间，当类装载的时候就会创建类的实例，不管你用不用，先创建出来，然后每次调用的时候，就不需要再判断，节省了运行时间
 * @author sailfish
 * @create 2017-05-22-上午9:20
 */
public class EagerSingleton {

    private static EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {
    }

    public static EagerSingleton getInstance(){
        return instance;
    }
}
