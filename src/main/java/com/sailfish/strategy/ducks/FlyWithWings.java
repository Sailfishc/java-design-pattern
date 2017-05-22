package com.sailfish.strategy.ducks;

/**
 * 可以飞行
 * @author sailfish
 * @create 2017-05-20-下午12:17
 */
public class FlyWithWings implements FlyBehavior{

    //可以飞行
    public void fly() {
        System.out.println("i am flying!");
    }
}
