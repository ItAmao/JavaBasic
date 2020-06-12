package com.amao.demo05_泛型类;

/**
 * @description:学生泛型类
 * @params:
 * @return:
 * @author: ItAmao
 * @time: 2020/6/12 16:38
 */
public class Student<E> {
    private E name;
    private E age;

    public void setName(E name) {
        this.name = name;
    }

    public void setAge(E age) {
        this.age = age;
    }

    public E getName() {
        return name;
    }

    public E getAge() {
        return age;
    }

}
