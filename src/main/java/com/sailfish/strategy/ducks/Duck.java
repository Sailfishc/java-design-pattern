package com.sailfish.strategy.ducks;

/**
 * 所有鸭子的超类
 * @author sailfish
 * @create 2017-05-20-下午12:14
 */
public abstract class Duck {

    public Duck() {
    }

    //display方法，不是所有的子类都有
    abstract void display();

    //swim方法，所有鸭子都会游泳
    public void swim(){
        System.out.println("All ducks float, even decoys!");
    }

    //添加一（fly），面向接口
    FlyBehavior flyBehavior;

    //面向接口编程，具体细节有子类实现
    public void performFly(){
        flyBehavior.fly();
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }
}
