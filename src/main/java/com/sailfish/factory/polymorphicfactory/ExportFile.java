package com.sailfish.factory.polymorphicfactory;

/**
 * 实际的导出类
 * @author sailfish
 * @create 2017-05-21-下午8:33
 */
public interface ExportFile {

    /**
     * 导出文件：4种结构：
     *      1、标准pdf
     *      2、非标准pdf
     *      3、标准html
     *      4、非标准html
     * @param data
     * @return
     */
    boolean export(String data);
}
