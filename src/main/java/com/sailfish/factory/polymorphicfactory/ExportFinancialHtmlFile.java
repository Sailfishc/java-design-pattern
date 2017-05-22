package com.sailfish.factory.polymorphicfactory;

/**
 * @author sailfish
 * @create 2017-05-21-下午8:38
 */
public class ExportFinancialHtmlFile implements ExportFile {

    @Override
    public boolean export(String data) {

        /**
         * 业务逻辑
         */
        System.out.println("导出财务版HTML文件");
        return true;
    }
}
