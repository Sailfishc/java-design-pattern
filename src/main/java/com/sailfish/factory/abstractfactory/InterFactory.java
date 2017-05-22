package com.sailfish.factory.abstractfactory;

import com.sailfish.factory.simple3.Cpu;

/**
 * @author sailfish
 * @create 2017-05-21-下午10:18
 */
public class InterFactory implements AbstractFactory {

    @Override
    public Cpu createCpu() {
        return null;
    }

    @Override
    public Mainboard createMainboard() {
        return null;
    }
}
