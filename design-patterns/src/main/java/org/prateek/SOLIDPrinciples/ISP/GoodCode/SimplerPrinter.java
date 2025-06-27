package org.Prathamesh.SOLIDPrinciples.ISP.GoodCode;

import org.Prathamesh.SOLIDPrinciples.ISP.BadCode.Document;

public class SimplerPrinter implements Printer{
    @Override
    public void print(Document doc) {
        System.out.println("Printing the document");
    }
}
