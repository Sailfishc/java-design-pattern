package com.sailfish.factory.simple3;

/**
 * @author sailfish
 * @create 2017-05-21-下午9:12
 */
public class AmdMainBoard implements MainBoard {

    private int cpuHoles = 0;

    public AmdMainBoard(int cpuHoles) {
        this.cpuHoles = cpuHoles;
    }

    @Override
    public void installCPU() {
        //  todo
        System.out.println("amd main board...");
    }
}
