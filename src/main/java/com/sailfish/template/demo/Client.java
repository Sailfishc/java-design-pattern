package com.sailfish.template.demo;

/**
 * 客户端类
 * Created by travis on 2016/10/18.
 */
public class Client {

    public static void main(String[] args) {
        Account account = new MoneyMarketAccount();
        System.out.println("货币市场账号的利息数额为:" + account.calculateInterest());
        account = new CDAccount();
        System.out.println("定期账号的利息数额为：" + account.calculateInterest());
    }
}
/*
货币市场账号的利息数额为:325.935
定期账号的利息数额为：434.58
 */