package com.sailfish.strategy.demo;

/**
 * 高级会员
 * Created by travis on 2016/10/22.
 */
public class AdvanceMemberStrategy implements MemberStrategy {

    public double calcPrice(double booksPrice) {
        System.out.println("对于高级会员的折扣为20%");
        return booksPrice * 0.8;
    }
}
