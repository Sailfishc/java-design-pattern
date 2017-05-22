package com.sailfish.strategy.ducks;

/**
 * @author sailfish
 * @create 2017-05-20-下午12:21
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        //这个鸭子具有的飞的行为
        flyBehavior = new FlyWithWings();
    }

    @Override
    void display() {
        System.out.println("i'm a real Mallard duck!");
    }
}
