package com.pookz.doc;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.List;

public class Demo1_XmlParser {
    public static void main(String[] args) {
        SAXReader reader = new SAXReader();
        try {
            Document doc = reader.read(new File("src/com/pookz/doc/demo1.xml"));
            Element rootElement = doc.getRootElement();
//            demo1(doc);

            // 获取单个node元素
            // System.out.println(rootElement.selectSingleNode("//name").getText());
            List<Node> ls = rootElement.selectNodes("//name");
            for(Node n: ls){
                System.out.println(n.getName()+"="+n.getText());
            }

        } catch (DocumentException e) {
            e.printStackTrace();
        }
    }

    private static void demo1(Element rootElement) {

        // 获取单个element元素
        System.out.println(rootElement.element("stu").element("name").getStringValue());
        // 获取elements对象集
        List<Element> ls = rootElement.elements();
        for (Element e: ls){
            System.out.println(e.getStringValue());
        }
    }
}
