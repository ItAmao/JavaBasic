package com.amao.Ademo_KP;

public class Array<E> {//<E>这个名字任意取得,表示类型 表示Array里边存放的数据类型是E数据类型
    //private:不希望用户从外部直接获取这些数据的信息
    private E[] data;//数组
    private int size;//在data数组中有多少个有效的元素

    //有参数构造函数:capacity意思是用户传进来多大的容量构造Array
    public Array(int capacity) {
        data = (E[]) new Object[capacity];
        //data = (E[]) new Objects[capacity];多了一个s 你可留点心吧 菜鸡
        size = 0;
    }

    //无参数的构造函数,默认数组的容量capacity=10
    public Array() {
        this(10);
    }

    //获取数组中的元素个数
    public int getSize() {
        return size;
    }

    //获取数组容量
    public int getCapacity() {
        return data.length;
    }

    //判空
    public boolean isEmpty() {
        return size == 0;
    }

    //在第index个位置插入一个新元素e
    public void add(int index, E e) {
        //2.判断index合法 :大于0 小于等于size
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("add failed,index>=0 and index<=size");
        }
        //1.扩容
        if (size == data.length) {
            resize(2 * data.length);//resize的意思是调整大小
        }
        //3.遍历整个数组 从最后一个元素开始 向后移动一个位置 后一个索引位置等于前一个索引的位置
        for (int j = size - 1; j >= index; j--) {
            //往后移动
            data[j + 1] = data[j];
        }
        //5.插入元素
        data[index] = e;
        //6.维护数组
        size++;
    }

    //向所有元素后添加一个新元素
    public void addLast(E e) {
        //可以直接调用add方法
        add(size, e);
    }

    //向所有元素第一个插入一个新元素e
    public void addFirst(E e) {
        add(0, e);
    }

    //获取元素
    public E get(int index) {
        //2.判断index合法 :大于0 小于等于size
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("add failed,index>=0 and index<=size");
        }
        return data[index];
    }

    //获取第一个元素
    public E getFirst() {
        return get(0);
    }

    //改变元素
    public void set(int index, E e) {
        //2.判断index合法 :大于0 小于等于size
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("add failed,index>=0 and index<=size");
        }
        data[index] = e;
    }

    //查找数组中是否有元素e
    public boolean contains(E e) {
        //1.遍历数组
        for (int i = 0; i < size; i++) {
            //2.判断查找的元素是否等于e 等于就返回ture
            if (data[i].equals(e)) {
                return true;
            }
        }
        //3.不等于返回False
        return false;
    }

    //查找数组中元素e所在的索引,如果不存在元素e,则返回-1
    public int find(E e) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(e)) {
                return i;
            }
        }
        return -1;
    }

    //从数组中删除元素 并返回删除的元素
    public E remove(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("add failed,index>=0 and index<=size");
        }
        E ret = data[index];
        for (int i = index + 1; i < size; i++) {
            data[i - 1] = data[i];
        }
        size--;
        data[size] = null;//非必须
        //缩容
        if (size == data.length / 4 && data.length / 2 != 0) {
            resize(data.length / 2);
        }
        return ret;
    }

    //从数组中删除第一个元素
    public E removeFirst() {
        return remove(0);
    }

    //从数组中删除第一个元素
    public E removeLast() {
        return remove(size - 1);
    }

    //从数组中删除元素e
    public void removeElement(E e) {
        int index = find(e);
        if (index != -1) {
            remove(index);
        }
    }

    //覆盖父类方法
    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        //String.format()初始化
        res.append(String.format("Array:size=%d , capacity=%d\n", size, data.length));
        res.append('[');
        for (int i = 0; i < size; i++) {
            res.append(data[i]);
            if (i != size - 1) {//判断i是否为最后一个元素
                res.append(",");
            }
        }
        res.append(']');
        return res.toString();
    }

    //扩容
    private void resize(int newCapacity) {
        E[] newData = (E[]) new Object[newCapacity];
        for (int i = 0; i < size; i++) {
            newData[i] = data[i];
        }
        data = newData;
    }
}