package com.sailfish.strategy.ducks;

/**
 * @author sailfish
 * @create 2017-05-20-下午12:27
 */
public class ModelDuck extends Duck {


    public ModelDuck() {
        flyBehavior = new FlyRocketPowered();
    }

    @Override
    void display() {
        System.out.println("i am a modeduck!");
    }
}
