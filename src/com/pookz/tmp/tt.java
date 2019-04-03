package com.pookz.tmp;

import org.docx4j.openpackaging.exceptions.Docx4JException;
import org.docx4j.openpackaging.packages.WordprocessingMLPackage;
import org.docx4j.openpackaging.parts.WordprocessingML.MainDocumentPart;

public class tt {
    public static void main(String[] args) throws Docx4JException {
        WordprocessingMLPackage wordMLPackage = WordprocessingMLPackage.load(new java.io.File("com/pookz/tmp/opq.docx"));
        MainDocumentPart documentPart = wordMLPackage.getMainDocumentPart();
        System.out.println(1);

    }

}
