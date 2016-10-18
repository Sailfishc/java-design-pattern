package com.sailfish.template.demo;

/**
 * 具体模板角色类
 * Created by travis on 2016/10/18.
 */
public class MoneyMarketAccount extends Account {

    @Override
    protected String doCalculateAccountType() {

        return "Money Market";
    }

    @Override
    protected double doCalculateInterestRate() {

        return 0.045;
    }
}
