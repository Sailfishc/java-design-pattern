package com.sailfish.factory.simple3;

/**
 * @author sailfish
 * @create 2017-05-21-下午9:09
 */
public class AmdCpu implements Cpu {


    private int pins = 0;

    public AmdCpu(int pins) {
        this.pins = pins;
    }

    @Override
    public void calculate() {
        //  todo

        System.out.println("amd cpu...");
    }
}
