package com.sailfish.strategy.ducks;

/**
 * @author sailfish
 * @create 2017-05-20-下午12:18
 */
public class FlyNoWay implements FlyBehavior {

    //不会飞
    public void fly() {
        System.out.println("i can't fly!");
    }
}
