package com.sailfish.template.demo;

/**
 * 具体模板角色类
 * Created by travis on 2016/10/18.
 */
public class CDAccount extends Account{

    @Override
    protected String doCalculateAccountType() {

        return "Certificate of Deposite";
    }

    @Override
    protected double doCalculateInterestRate() {

        return 0.06;
    }
}
