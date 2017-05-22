package com.sailfish.strategy.ducks;

/**
 * 针对modeduck的测试类
 * @author sailfish
 * @create 2017-05-20-下午12:23
 */
public class MiniDuckSimlator2 {

    public static void main(String[] args) {

        //使用多态
        Duck duck = new ModelDuck();
        duck.performFly();
        //利用set方法改变modelDuck的策略
        duck.setFlyBehavior(new FlyWithWings());
        duck.performFly();
    }
}
