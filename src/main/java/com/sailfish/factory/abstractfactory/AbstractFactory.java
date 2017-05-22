package com.sailfish.factory.abstractfactory;

import com.sailfish.factory.simple3.Cpu;

/**
 * @author sailfish
 * @create 2017-05-21-下午10:16
 */
public interface AbstractFactory {

    /**
     * 创建CPU对象
     *
     * @return CPU对象
     */
    Cpu createCpu();

    /**
     * 创建主板对象
     *
     * @return 主板对象
     */
    Mainboard createMainboard();
}
