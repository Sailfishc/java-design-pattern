package com.sailfish.factory.polymorphicfactory;

/**
 * @author sailfish
 * @create 2017-05-21-下午8:35
 */
public class ExportStandardHtmlFile implements ExportFile {

    @Override
    public boolean export(String data) {

        // todo 业务逻辑

        System.out.println("导出标准HTML文件");
        return true;
    }
}
