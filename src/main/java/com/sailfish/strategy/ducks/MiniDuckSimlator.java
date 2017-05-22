package com.sailfish.strategy.ducks;

/**
 * 针对mallduck的测试类
 * @author sailfish
 * @create 2017-05-20-下午12:23
 */
public class MiniDuckSimlator {

    public static void main(String[] args) {
        //不使用多态
        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.performFly();

        System.out.println("--------");
        //使用多态
        Duck duck = new MallardDuck();
        duck.performFly();
    }
}
