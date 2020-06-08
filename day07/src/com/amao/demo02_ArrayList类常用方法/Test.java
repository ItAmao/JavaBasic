package com.amao.demo02_ArrayList类常用方法;

import java.util.ArrayList;

/*
 构造方法:
	            public ArrayList();创建一个实际只有0个元素的集合(初始容量为10)
            成员方法:
	            增:
		            public boolean add(元素); 向集合最后面添加元素,返回值代表是否添加成功
		            public void add(int index,元素);向集合指定位置添加元素
	            删:
		            public boolean remove(元素); 删除指定的元素,返回值代表是否删除成功
		            public E remove(int index); 删除指定位置的元素,返回被删除的那个元素
	            改:
		            public E set(int index,新元素); 将指定索引的元素改为新的元素,返回被修改的元素
	            查:
		            public int size(); 获取集合中实际元素的个数
                    public E get(int index); 获取指定位置的元素
 */
public class Test {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        //增
        arr.add("阿毛");
        arr.add("二毛");
        arr.add("三毛");
        arr.add("四毛");
        arr.add(1, "一毛"); //index表示索引值
        for (String str : arr) {
            System.out.println(str);
        }
        System.out.println("=================");

        //删除
        arr.remove("四毛");
        arr.remove(1);
        for (String str : arr) {
            System.out.println(str);
        }
        System.out.println("=================");
        //改
        arr.set(0, "帅毛");
        for (String str : arr) {
            System.out.println(str);
        }
        System.out.println("=================");
        //查找
        System.out.println(arr.size()); //size表示有多少个元素,而不是索引值
        System.out.println(arr.get(0)); //get是获取索引位置的元素

    }
}
