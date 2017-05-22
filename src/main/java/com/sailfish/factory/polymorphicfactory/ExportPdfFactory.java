package com.sailfish.factory.polymorphicfactory;

/**
 * @author sailfish
 * @create 2017-05-21-下午8:40
 */
public class ExportPdfFactory implements ExportFactory {

    @Override
    public ExportFile factory(String type) {
        if ("standard".equals(type)) {

            return new ExportStandardPdfFile();
        } else if ("financial".equals(type)) {

            return new ExportFinancialPdfFile();
        } else {
            throw new RuntimeException("没有找到对象");
        }
    }
}
