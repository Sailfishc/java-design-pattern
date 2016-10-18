package com.sailfish.template;

/**
 * Created by travis on 2016/10/18.
 */
public class ConcreteTemplate extends AbstractTemplate {

    //基本方法的实现
    @Override
    protected void abstractMethod() {
        //相关业务代码
    }

    //重写父类的方法
    @Override
    protected void hookMethod() {
        //业务相关代码
    }
}
