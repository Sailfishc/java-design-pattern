package com.sailfish.builder;

/**
 * 抽象建造者类Builder
 * @author sailfish
 * @create 2017-05-22-上午11:47
 */
public interface Builder {

    void buildPart1();

    void buildPart2();

    Product retrieveResult();
}
