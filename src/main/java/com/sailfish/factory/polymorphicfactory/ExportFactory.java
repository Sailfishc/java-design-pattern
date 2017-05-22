package com.sailfish.factory.polymorphicfactory;

/**
 * 抽象工厂
 * @author sailfish
 * @create 2017-05-21-下午8:33
 */
public interface ExportFactory {

    /**
     * 根据类型创建要导出的格式
     * @param type
     * @return
     */
    ExportFile factory(String type);
}
