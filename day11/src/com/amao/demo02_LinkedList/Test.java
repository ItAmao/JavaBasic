package com.amao.demo02_LinkedList;

import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        LinkedList<String> ls = new LinkedList<>();
        System.out.println("-----add操作-----");
        ls.add("2毛");
        ls.addLast("3毛");
        ls.addFirst("1毛");
        ls.add("4毛");
        ls.add("5毛");
        ls.add("6毛");
        ls.add("7毛");
        ls.add("8毛");
        System.out.println(ls);//[1毛, 2毛, 3毛, 4毛, 5毛, 6毛, 7毛, 8毛]
        System.out.println("-----remove操作-----");
        ls.remove(1);
        ls.removeFirst();
        ls.removeLast();
        ls.remove(); //删除第一个元素
        System.out.println(ls);//[4毛, 5毛, 6毛, 7毛]
        System.out.println("-----get操作-----");
        System.out.println(ls.getFirst());
        System.out.println(ls.get(1));//获取索引为1的数
        System.out.println(ls.getLast());
        System.out.println(ls);//[4毛, 5毛, 6毛, 7毛]
        System.out.println("-----pop操作-----");
        System.out.println(ls.pop()); //pop操作,删除第一个元素
        System.out.println(ls);
        System.out.println("-----push操作-----");
        ls.push("阿毛");
        System.out.println(ls); //push操作.在第一个位置添加元素

    }
}
