package com.sailfish.strategy.ducks;

/**
 * 新建类型，可以使用火箭飞行
 * @author sailfish
 * @create 2017-05-20-下午12:26
 */
public class FlyRocketPowered implements FlyBehavior{



    @Override
    public void fly() {
        System.out.println("i can flying with a rocket!");
    }
}
