package com.sailfish.strategy.demo;

/**
 * 中级会员折扣类
 * Created by travis on 2016/10/22.
 */
public class IntermediateMemberStrategy implements MemberStrategy {

    public double calcPrice(double booksPrice) {
        System.out.println("对于中级会员的折扣为10%");
        return booksPrice * 0.9;
    }

}
