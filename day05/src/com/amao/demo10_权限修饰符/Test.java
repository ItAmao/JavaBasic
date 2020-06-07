package com.amao.demo10_权限修饰符;

/**
 * @Author：pengzhilin
 * @Date: 2020/6/5 11:51
 */
public class Test {
    public static void main(String[] args) {
        /*
            - 概述
                在Java中提供了四种访问权限，使用不同的访问权限修饰符修饰时，被修饰的内容会有不同的访问权限，
                    public：公共的
                    protected：受保护的
                    (空的)：默认的
                    private：私有的

            - 不同权限修饰符的访问能力
                             本类      同一个包        不同包父子类          不同包无关类
                 public      √           √              √                   √
                 protected   √           √              √                   ×
                 空的        √            √             ×                   ×
                 private     √           ×              ×                   ×

             访问权限大小关系: public > protected  > 空  > private

            - 类使用public,方便使用
            - 成员变量使用private ，隐藏细节。
            - 构造方法使用public ，方便创建对象。
            - 成员方法使用public ，方便调用方法。

         */
        Person p = new Person();
        p.method1();
        p.method2();
        p.method3();
        //p.method4();// 编译报错
    }
}
