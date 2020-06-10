package com.amao.demo10_抽象类作为方法参数和返回值;

/**
 * @description:
 * @params:
 * @return:
 * @author: ItAmao
 * @time: 2020/6/10 15:56
 */
public class StudentTest {
    public static void main(String[] args) {
        //调用抽象类作为方法的返回值
        Student stu = getStudent();
        stu.doHomework();
        stu.playGame();
        System.out.println("---------------");
        //抽象类作为方法参数
        //创建学生对象 ,并重写抽象方法
        Student stu1 = new Student() {
            @Override
            public void doHomework() {
                System.out.println("小毛做作业");
            }

            @Override
            public void playGame() {
                System.out.println("小毛打游戏");
            }
        };
        //给getStu传入stu1对象
        getStu(stu1);
    }

    /**
     * 抽象类作为方法参数
     */
    public static void getStu(Student stu) {
        System.out.println("抽象类作为方法参数");
        stu.doHomework();
        stu.playGame();
    }

    /**
     * 抽象类作为方法的返回值
     */
    public static Student getStudent() {
        //创建对象,使用匿名内部类重写抽象方法
        Student stu = new Student() {
            @Override
            public void doHomework() {
                System.out.println("阿毛写作业");
            }

            @Override
            public void playGame() {
                System.out.println("阿毛打和平精英");
            }
        };
        //返回Student匿名内部类对象
        return stu;
    }
}
