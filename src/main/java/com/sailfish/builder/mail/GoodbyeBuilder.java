package com.sailfish.builder.mail;

/**
 * @author sailfish
 * @create 2017-05-22-下午12:09
 */
public class GoodbyeBuilder extends Builder {

    public GoodbyeBuilder() {
        msg = new GoodbyeMessage();
    }

    @Override
    public void buildSubject() {
        msg.setSubject("欢送主题");
    }

    @Override
    public void buildBody() {
        msg.setBody("欢送内容");
    }
}
