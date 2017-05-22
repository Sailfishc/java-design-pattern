package com.sailfish.factory.simple3;

/**
 * @author sailfish
 * @create 2017-05-21-下午9:11
 */
public class IntelMainBoard implements MainBoard {

    //cpu插槽的孔位
    private int cpuHoles = 0;

    public IntelMainBoard(int cpuHoles) {
        this.cpuHoles = cpuHoles;
    }

    @Override
    public void installCPU() {
        //  todo
        System.out.println("intel mainboard...");
    }
}
