package com.sailfish.builder.mail;

/**
 *
 * @author sailfish
 * @create 2017-05-22-下午12:13
 */
public class Client {

    public static void main(String[] args) {
        Builder builder = new WelcomeBuilder();
        Director director = new Director(builder);
        director.construct("a", "b");

    }
}
/*
建造模式分成两个很重要的部分：
　　1. 一个部分是Builder接口，这里是定义了如何构建各个部件，也就是知道每个部件功能如何实现，以及如何装配这些部件到产品中去；
　　2. 另外一个部分是Director，Director是知道如何组合来构建产品，也就是说Director负责整体的构建算法，而且通常是分步骤地来执行。
*/