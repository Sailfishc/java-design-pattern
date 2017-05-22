package com.sailfish.factory.polymorphicfactory;

/**
 * @author sailfish
 * @create 2017-05-21-下午8:34
 */
public class ExportHtmlFactory implements ExportFactory {

    @Override
    public ExportFile factory(String type) {

        if ("standard".equals(type)) {

            return new ExportStandardHtmlFile();
        } else if ("financial".equals(type)) {

            return new ExportFinancialHtmlFile();
        } else {
            throw new RuntimeException("没有找到对象");
        }
    }
}
