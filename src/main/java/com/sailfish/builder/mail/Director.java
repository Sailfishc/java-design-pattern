package com.sailfish.builder.mail;

/**
 * @author sailfish
 * @create 2017-05-22-下午12:10
 */
public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct(String toAddress, String fromAddress) {
        this.builder.buildFrom(toAddress);
        this.builder.buildFrom(fromAddress);
        this.builder.buildSubject();
        this.builder.buildBody();
        this.builder.buildSendDate();
        this.builder.sendMessage();
    }

}
