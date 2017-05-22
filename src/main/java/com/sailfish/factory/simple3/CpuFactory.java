package com.sailfish.factory.simple3;

/**
 * @author sailfish
 * @create 2017-05-21-下午9:13
 */
public class CpuFactory {

    public static Cpu createCpu(int type) {
        if (type == 1) {
            return new IntelCpu(755);
        } else if (type == 2) {
            return new AmdCpu(938);
        } else {
            throw new RuntimeException("找不到对应的cpu...");
        }
    }
}
