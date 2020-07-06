package com.amao.Ademo_KP.java3;

import org.junit.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 *  获取运行时类的方法结构
 *
 *  @Author : ItAmao
 *  @Date   : 2020/7/5 17:58
 */
public class MethodTest {
    @Test
    public void test1() throws ClassNotFoundException {
        Class clazz = Class.forName("com.amao.Ademo_KP.java2.Person");

        //getMethods 获取当前运行时类及其所有父类声明为public权限的方法
        Method[] methods = clazz.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }
        System.out.println("");

        //getDeclaredMethods 获取当前运行时类中声明的所有方法,(不包含父类中声明的)
        Method[] declaredMethods = clazz.getDeclaredMethods();
        for (Method m : declaredMethods) {
            System.out.println(m);
        }
    }

    /**
     * @Xxx
     * 权限修饰符, 返回值类型, 方法名(参数类型1 形参名1, ....) throws XXXException{}
     */
    @Test
    public void test2() throws ClassNotFoundException {
        Class clazz = Class.forName("com.amao.Ademo_KP.java2.Person");
        Method[] declaredMethods = clazz.getDeclaredMethods();
        for (Method m : declaredMethods) {
            //1.获取方法声明的注解
            Annotation[] annos = m.getAnnotations();
            for (Annotation a : annos) {
                System.out.println(a);
            }
            //2.关于权限修饰符
            int modifiers = m.getModifiers();
            String string = Modifier.toString(modifiers);
            System.out.print(string + "\t");

            //3.返回值类型
            Class returnType = m.getReturnType();
            System.out.println(returnType.getName() + "\t");

            //4.方法名
            System.out.print(m.getName());
            System.out.print("(");
            //5.形参列表
            Class[] parameterTypes = m.getParameterTypes();
            //无参数类型情况
            if (!(parameterTypes == null && parameterTypes.length == 0)) {
                for (int i = 0; i < parameterTypes.length; i++) {
                    if (i == parameterTypes.length - 1) {
                        System.out.print(parameterTypes[i].getName() + "args_" + i);
                        break;
                    }
                    System.out.print(parameterTypes[i].getName() + "args_" + i + ",");
                }
            }
            System.out.print(")");

            //6.抛出的异常
            Class[] exceptionTypes = m.getExceptionTypes();
            System.out.println("");
        }


    }
}
