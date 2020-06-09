package com.amao.demo05_SimpDateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
    public static void main(String[] args) throws ParseException {
        //1.创建SimpleDateFormat对象
        //2.希望时间是  2020-06-29 13点14分52秒
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年-MM月-dd日 HH点mm分ss秒");
        //3.创建一个Date对象
        Date now = new Date();
        String format = simpleDateFormat.format(now);
        System.out.println(format);
        //4.解析
        Date d = simpleDateFormat.parse("3000年-10月-10日 10点10分10秒");//必须符合上边pattern对象
        System.out.println(d);
    }
}
