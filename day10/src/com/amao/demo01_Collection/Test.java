package com.amao.demo01_Collection;

import java.util.ArrayList;
import java.util.Collection;
/**
 * @description: 测试接口中的通用方法
 * @params:
 * @return:
 * @author: ItAmao
 * @time: 2020/6/12 09:42
 */
public class Test {
    public static void main(String[] args) {
        //多态接收
        Collection<String> collection = new ArrayList<>();
        //添加
        collection.add("1毛");
        collection.add("2毛");
        collection.add("3毛");
        collection.add("4毛");
        collection.add("5毛");
        collection.add("5毛");
        System.out.println(collection.toString());
        //删除
        collection.remove("5毛");
        System.out.println(collection.toString());
        //修改 . 查询没有

        //其他
        System.out.println("长度:"+collection.size());
        System.out.println("是否包含:"+collection.contains("1毛"));
        System.out.println("是否为空:"+collection.isEmpty());
        //返回Object类型的数组
        System.out.println(collection.toArray().getClass());
        //清空
        collection.clear();
        System.out.println(collection.toString());
    }
}
