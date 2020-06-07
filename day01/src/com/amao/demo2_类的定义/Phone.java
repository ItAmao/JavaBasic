package com.amao.demo2_类的定义;

/*
    手机类
 */
/*
    定义一个类的格式:
        public class 类名{
            属性(状态信息)    成员变量:定义在类中方法外的变量   局部变量:定义在方法内的变量
            行为(功能)       成员方法
        }
 */

public class Phone {
    //属性
    public String brand;//手机品牌
    public int price;//价格


    /**
     * 打电话的功能
     *
     * @param phoneNum 电话号码
     */
    public void call(String phoneNum) {
        System.out.println("正在给" + phoneNum + "打电话...");
    }

    /**
     * 发短信的功能
     *
     * @param phoneNum 电话号码
     * @param message  短信内容
     */
    public void sendMessage(String phoneNum, String message) {
        System.out.println("正在给" + phoneNum + "发送短信,短信的内容是:" + message);
    }

}
