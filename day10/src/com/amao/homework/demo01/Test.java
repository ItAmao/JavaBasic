package com.amao.homework.demo01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @description: 请定义一个Collection类型的集合，存储以下字符串：
 * <p>
 * ​              “JavaEE企业级开发指南”，
 * ”Oracle高级编程”，
 * ”MySQL从入门到精通”，
 * ​              ”Java架构师之路”
 * ​       请编程实现以下功能：
 * Ø  使用迭代器遍历所有元素，并打印
 * Ø  使用迭代器遍历所有元素，筛选书名小于10个字符的，并打印；
 * Ø  使用迭代器遍历所有元素，筛选书名中包含“Java”的，并打印
 * Ø  如果书名中包含“Oracle”，则删掉此书。删掉后，遍历集合，打印所有书名。
 * ​       (注意：以上功能写在一个main()方法中，但请单独实现)
 * @params:
 * @return:
 * @author: ItAmao
 * @time: 2020/6/12 17:18
 */
public class Test {
    public static void main(String[] args) {
        Collection<String> col = new ArrayList<>();
        col.add("JavaEE企业级开发指南");
        col.add("Oracle高级编程");
        col.add("MySQL从入门到精通");
        col.add("Java架构师之路");
        System.out.println("使用迭代器遍历所有元素，并打印");
        print1(col);
        System.out.println("");
        System.out.println("使用迭代器遍历所有元素，筛选书名小于10个字符的，并打印");
        print2(col);
        System.out.println("");
        System.out.println("使用迭代器遍历所有元素，筛选书名中包含“Java”的，并打印");
        print3(col);
        System.out.println("");
        System.out.println("如果书名中包含“Oracle”，则删掉此书。删掉后，遍历集合，打印所有书名。");
        print4(col);
    }

    /**
     * 如果书名中包含“Oracle”，则删掉此书。删掉后，遍历集合，打印所有书名。
     */
    public static void print4(Collection<String> col) {
        Iterator<String> it = col.iterator();
        while (it.hasNext()) {
            String name = it.next();
            if (name.contains("Oracle")) {
                continue;
            }
            System.out.print(name + "   ");
        }
        System.out.println("");
        System.out.println("------------------------");
    }

    /**
     * 使用迭代器遍历所有元素，筛选书名中包含“Java”的，并打印
     */
    public static void print3(Collection<String> col) {
        Iterator<String> it = col.iterator();
        while (it.hasNext()) {
            String name = it.next();
            if (name.contains("Java")) {
                System.out.print(name + "   ");
            }
        }
        System.out.println("");
        System.out.println("------------------------");
    }

    /**
     * 使用迭代器遍历所有元素，筛选书名小于10个字符的，并打印
     */
    public static void print2(Collection<String> col) {
        Iterator<String> it = col.iterator();
        while (it.hasNext()) {
            String name = it.next();
            if (name.length() < 10) {
                System.out.print(name + "   ");
            }
        }
        System.out.println("");
        System.out.println("------------------------");
    }

    /**
     * 使用迭代器遍历所有元素，并打印
     */
    public static void print1(Collection<String> col) {
        Iterator<String> it = col.iterator();
        while (it.hasNext()) {
            String name = it.next();
            System.out.print(name + "   ");
        }
        System.out.println("");
        System.out.println("------------------------");
    }
}
