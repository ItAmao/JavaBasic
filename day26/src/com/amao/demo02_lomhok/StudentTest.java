package com.amao.demo02_lomhok;

import org.junit.Test;

/**
 *  @Author : ItAmao
 *  @Date   : 2020/7/6 17:36
 */
public class StudentTest {
    @Test
    public void test1() {
        Student stu1 = new Student("阿毛", 123);
        Student stu2 = new Student();

        stu2.setName("阿毛");

    }
}
