package com.amao.demo01_DOM4J;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.Test;

import java.util.List;

/**
 *  @Author : ItAmao
 *  @Date   : 2020/7/6 11:06
 */
public class Test01 {
    @Test
    public void test1() throws DocumentException {
        //创建解析器对象
        SAXReader sr = new SAXReader();
        Document document = sr.read("/Users/mao/Documents/code/basic/day26/xml/book.xml");
        //解析器读取文件方法
        //获取根元素
        Element rootElement = document.getRootElement();
        System.out.println(rootElement.getName());//books
        //获取根元素中所有的子元素
        List<Element> e = rootElement.elements();
        for (Element element : e) {
            System.out.println(element.getName());
            //获取属性
            String id = element.attributeValue("id");
            System.out.println(id);
            //获取子元素
            List<Element> elements = element.elements();
            for (Element element1 : elements) {
                System.out.println(element1.getName());
                System.out.println(element1.getText());
            }

        }

    }
}
