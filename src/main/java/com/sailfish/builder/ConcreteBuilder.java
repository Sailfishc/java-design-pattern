package com.sailfish.builder;

/**
 * @author sailfish
 * @create 2017-05-22-上午11:48
 */
public class ConcreteBuilder implements Builder {

    private Product product = new Product();

    @Override
    public void buildPart1() {
        product.setPart1("part1");
    }

    @Override
    public void buildPart2() {
        product.setPart2("part2");
    }

    @Override
    public Product retrieveResult() {
        /**
         * 产品返还方法
         */
        return product;
    }
}
