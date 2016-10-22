package com.sailfish.strategy.demo;

/**
 * 初级会员折扣类
 * Created by travis on 2016/10/22.
 */
public class PrimaryMemberStrategy implements MemberStrategy {

    public double calcPrice(double booksPrice) {
        System.out.println("对于初级会员的没有折扣");
        return booksPrice;
    }
}
