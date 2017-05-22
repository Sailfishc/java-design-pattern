package com.sailfish.singleton;

/**
 * Lazy initialization holder class模式
 * @author sailfish
 * @create 2017-05-22-上午9:29
 */
public class Singleton2 {


    private Singleton2() {
    }

    /**
     *    类级的内部类，也就是静态的成员式内部类，该内部类的实例与外部类的实例
     *    没有绑定关系，而且只有被调用到时才会装载，从而实现了延迟加载。
     */
    public static class SingletonHolder{
        /**
         * 静态初始化器，由JVM来保证线程安全
         */
        private static Singleton2 instance = new Singleton2();
    }

    public static Singleton2 getInstance(){
        return SingletonHolder.instance;
    }
}
