package com.amao.demo_学生管理系统1.service;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 操作接口,增删改查
 */
public interface Operatable<E> {
    /**
     * 查询所有
     *
     * @param list
     * @param sc
     */
    public void selectAll(ArrayList<E> list, Scanner sc);

    /**
     * 添加信息
     *
     * @param list
     * @param sc
     */
    public void addInfor(ArrayList<E> list, Scanner sc);

    /**
     * 删除信息
     *
     * @param list
     * @param sc
     */
    public void removeInfor(ArrayList<E> list, Scanner sc);

    /**
     * 修改信息
     *
     * @param list
     * @param sc
     */
    public void updateInfor(ArrayList<E> list, Scanner sc);

}
