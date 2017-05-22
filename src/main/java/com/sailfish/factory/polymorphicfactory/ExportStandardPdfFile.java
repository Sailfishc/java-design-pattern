package com.sailfish.factory.polymorphicfactory;

/**
 * @author sailfish
 * @create 2017-05-21-下午8:38
 */
public class ExportStandardPdfFile implements ExportFile {

    @Override
    public boolean export(String data) {

        /**
         * 业务逻辑
         */
        System.out.println("导出标准PDF文件");
        return true;
    }
}
