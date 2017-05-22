package com.sailfish.factory.polymorphicfactory;

/**
 * @author sailfish
 * @create 2017-05-21-下午8:41
 */
public class Test {

    public static void main(String[] args) {
        String data = "";
        ExportPdfFactory pdfFactory = new ExportPdfFactory();
        String type = "standard";
        ExportFile factory = pdfFactory.factory(type);
        boolean export = factory.export(data);
        if (export) {

            //  todo
        } else {
            //  todo
        }
    }
}
