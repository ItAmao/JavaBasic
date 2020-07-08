package com.amao.demo01_枚举;

import lombok.*;

/**
 *  @Author : ItAmao
 *  @Date   : 2020/7/7 08:56
 */
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class Person {
    private String name;
    private int age;
    private Gender gender;
}
