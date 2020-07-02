package com.amao.Ademo_KP;

/**
 *  单元测试
 *      测试分类:
 *          1.黑盒测试:不需要写代码,给输入值,看程序是否能够输出期望的值
 *          2.白盒测试:需要些代码,关注程序具体的执行流程
 *
 *      1.什么是单元测试?
 *          a.单元测试是针对最小的功能单元编写测试代码
 *          b.Java程序最小的功能单元是方法
 *          c.单元测试就是针对单个Java方法的测试
 *
 *      2.测试驱动开发TDD                           Y
 *      编写接口--->编写测试---->编写实现---->运行测试----->任务完成
 *                              \            /
 *                               \----------/
 *                                    N
 *
 *      3.单元测试的好处
 *          a.确保单个方法运行正常
 *          b.如果修改了方法代码,只需确保其对应的单元测试通过
 *          c.测试代码本身就可以作为示例代码
 *          d.可以自动化运行所有测试并获得报告
 *
 *      4.JUnit(白盒测试)
 *          JUnit是一个开源的Java语言的单元测试框架
 *          a.专门针对Java语言设计的,使用最广泛
 *          b.JUnit是事实上的标准单元测试框架
 *
 *      5.使用步骤
 *          a.定义一个测试类(测试用例) 建议:1.测试类名:被测试的类名+Test
 *          b.定义测试方法:可以独立运行 建议:1.方法名:test+测试的方法名    2.建议返回值void  3.参数列表:空参
 *          c.给方法加注解@Test
 *          d.导入JUnit依赖文件
 *
 */
public class Test {

}
