package com.sailfish.template;

/**
 * Created by travis on 2016/10/18.
 */
public abstract class AbstractTemplate {

    /**
     * 模板方法
     */
    public void templateMethod(){
        //调用基本方法
        abstractMethod();
        hookMethod();
        concreteMethod();
    }

    /**
     * 基本方法的声明（有子类实现）
     */
    protected abstract void abstractMethod();

    /**
     * 基本方法（空方法）
     */
    protected void hookMethod(){
        // TODO
    }

    /**
     * 基本方法，已经实现
     */
    private final void concreteMethod(){
        //业务相关的代码
    }
}
