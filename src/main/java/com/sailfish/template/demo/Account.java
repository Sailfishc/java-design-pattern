package com.sailfish.template.demo;

/**
 * 抽象模板角色类
 * Created by travis on 2016/10/18.
 */
public abstract class Account {

    /**
     * 模板方法，计算利息数额
     * @return 利息数额
     */
    public final double calculateInterest(){
        double interestRate = doCalculateInterestRate();
        String accountType = doCalculateAccountType();
        double amount = calculateAmount(accountType);
        return amount * interestRate;
    }

    /**
     * 基本方法，留给子类去实现
     * @return
     */
    protected abstract String doCalculateAccountType();

    /**
     * 基本方法，留给子类去实现
     * @return
     */
    protected abstract double doCalculateInterestRate();

    /**
     * 基本方法，已经实现
     * @param accountType
     * @return
     */
    private double calculateAmount(String accountType) {

        /**
         * 省略相关的业务逻辑
         */
        return 7243.00;
    }
}
