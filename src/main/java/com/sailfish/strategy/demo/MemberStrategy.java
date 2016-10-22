package com.sailfish.strategy.demo;

/**
 * 抽象折扣类
 * Created by travis on 2016/10/22.
 */
public interface MemberStrategy {

    /**
     * 计算图书价格
     * @param booksPrice 图书的原价
     * @return  计算出打折后的价格
     */
    public double calcPrice(double booksPrice);
}
