package com.amao.demo04_动态代理;

import java.util.*;

/**
 *  ArrayList集合的代理类
 *  @Author : ItAmao
 *  @Date   : 2020/7/8 17:05
 */
//1.让被代理对象和代理对象实现相同的接口
public class ArrayListProxy implements List<String> {
    //2.在代理对象中保存被代理对象的引用
    private ArrayList<String> arr;

    public ArrayListProxy(ArrayList<String> arr) {
        this.arr = arr;
    }

    @Override
    public int size() {
        return arr.size();
    }

    @Override
    public boolean isEmpty() {
        return arr.isEmpty();
    }

    @Override
    public boolean add(String s) {
        throw new UnsupportedOperationException("该方法不支持!");//不支持这种操作异常
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public String remove(int index) {
        return null;
    }

    @Override
    public String set(int index, String element) {
        //抛出异常
        throw new UnsupportedOperationException("该方法不支持!");//不支持这种操作异常
    }

    @Override
    public String get(int index) {
        return arr.get(index);
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<String> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }


    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends String> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends String> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }


    @Override
    public void add(int index, String element) {

    }


    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<String> listIterator() {
        return null;
    }

    @Override
    public ListIterator<String> listIterator(int index) {
        return null;
    }

    @Override
    public List<String> subList(int fromIndex, int toIndex) {
        return null;
    }
}
