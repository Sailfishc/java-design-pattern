package com.sailfish.factory.simple3;

/**
 * @author sailfish
 * @create 2017-05-21-下午9:09
 */
public class IntelCpu implements Cpu {

    private int pins = 0;

    public IntelCpu(int pins) {
        this.pins = pins;
    }

    @Override
    public void calculate() {
        //  todo
        System.out.println("intel cpu...");
    }
}
