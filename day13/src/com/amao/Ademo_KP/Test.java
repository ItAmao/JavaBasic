package com.amao.Ademo_KP;

/**
 * @description:
 * @params:
 * @return:
 * @author: ItAmao
 * @time: 2020/6/16 09:03
 */
public class Test {
    public static void main(String[] args) {
        /**
         *  Map集合
         *      1.Map的特点:
         *          1.Collection集合的元素是单独存在的,Map集合的元素是成对存在的
         *          2.Map集合中键是唯一的,值可以重复
         *          3.Collection<E>集合的泛型只有一个,Map<K,V>集合的泛型是两个
         *              其中k代表键的类型,v代表值的类型
         *
         *      2.Map的3个常用子类以及其特点
         *          实现类:
         *              HashMap<K,V>:存储数据采用的哈希表结构，元素的存取顺序不能保证一致。
         *                           由于要保证键的 唯一、不重复，需要重写键的hashCode()方法、equals()方法。
         *              LinkedHashMap<K,V>:存储数据采用的哈希表结构 +链表结构。
         *                           通过链表结构可以保证元素的存取顺序一致;通过哈希表结构可以保证的键的唯一、 不重复，
         *                           需要重写键的hashCode()方法、equals()方法。
         *              TreeMap<K,V>:底层的数据结构是红黑树;是无序的,但是可以对元素的进行排序，
         *                      排序方式有两种:自然排序和比较器排序
         *
         *      3.Map的通用方法
         *          注意:Map接口和Collection接口没有直接的继承关系
         *          增:put(K key,V value);
         *          删:remove(K key);
         *          改:put(K key,V value):   replace
         *          查:get(K key)
         *          其他:
         *              size() 获取Map集合中键值对的个数
         *              containskey (K key) 是否包含某个键
         *              containsValue(V Value)是否包含某个值(很少用)
         *
         *
         *      4.Map遍历
         *          注意
         *              Map集合没有索引,因此无法直接fori遍历
         *              Map集合也没有迭代器,因此也无法使用增强for遍历
         *
         *          第一种遍历map的方法，通过加强for循环map.keySet()，然后通过键key获取到value值
         *          第二种只遍历键或者值，通过加强for循环
         *          第三种方式Map.Entry<String, String>的加强for循环遍历输出键key和值value
         *          第四种Iterator遍历获取，然后获取到Map.Entry<String, String>，再得到getKey()和getValue()
         *
         *      5.HashMap存储自定义类型的键
         *          demo03
         *          注意:
         *              如果Map中键的自定义类型,键如果需要保证唯一性,那么需要重写HashCode和equals方法
         *
         *
         *     6.LinkedHashMap介绍
         *          1.LinkedHashMap继承HashMap ,但是它是有序的
         *
         *     7.TreeMap集合
         *          TreeMap是无序的,但是它会按照键的自然顺序排序
         *
         *-----------------------------------------------------------------------------------------------
         *  集合的嵌套
         *      1.什么是集合的嵌套
         *          集合中的元素还是集合
         *
         *      2.List嵌套list
         *          demo07_ListNestedList
         *      3.List嵌套Map
         *          demo08_ListNestedMap
         *      4.Map嵌套Map
         *
         *
         *
         */
    }
}
