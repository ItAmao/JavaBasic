package com.amao.homework.demo12;

public class Test {
    public static void main(String[] args) {
        String port = "积分看电视普京了几分我特朗普将反恐文件风IE哦特朗普积分哦忘记普京";
        String[] keyArray = {"特朗普", "普京"};
        for (int i = 0; i < keyArray.length; i++) {
            port = port.replace(keyArray[i], "*");
        }
        System.out.println(port);
    }
}
