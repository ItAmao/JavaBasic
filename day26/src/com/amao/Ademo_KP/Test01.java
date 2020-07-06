package com.amao.Ademo_KP;

/**
 *  xml
 *      1.概述:
 *          a.xml,可扩展标记语言,是一种标记语言
 *          b.xml是一种非常灵活的语言,没有固定的标签,所有的标签都可以自定义
 *          c.通常.xml被用于信息的记录和传递,因此xml经常被用于充当配置文件
 *
 *      2.格式:
 *          a.声明信息,用于描述xml的版本和编码方式
 *              <?xml version="1.0" encoding="UTF-8" ?>
 *          b.xml要有且仅有一个根元素 元素:由开始标签,元素内容和结束标签组成
 *          c.xml是大小写敏感
 *          d.标签是成对的,而且要正确嵌套
 *          e.属性值要使用双引号
 *          f.注册的写法
 *              <!--这里是注释 -->
 *
 *      3.有效的xml文档
 *          首先必须是格式良好的
 *          使用DTD和XSD定义语义约束
 *
 *      4.作用:
 *          a.用于保存数据
 *          b.用于传输数据,
 *          c.框架的配置文件
 *
 *      5.XML的组成元素:
 *          1.文档声明:
 *              <?xml version="1.0" encoding="UTF-8" ?>
 *                    代表XML的版本      当前的文件编码
 *
 *          2.元素element
 *              元素(Element)也称为标签(Tag),标记(Node)
 *              a.标签的组成: <开始标签>标签体</开始标签>
 *              b.标签体: i.空  ii.一串文本 iii.还是标签
 *              c.如果标签体为空,也称空标签,空标签可以写:<标签/> 自闭合标签
 *              d.元素名:
 *                  i.元素名区分大小写
 *                  ii.元素名不建议使用特殊符号
 *                  iii.不建议使用xml相关的开头
 *              e.一个标准的xml应该只有一个根标签
 *
 *          3.属性attribute
 *              1.属性是元素的一部分,它必须出现在元素的开始标签中
 *              2.属性的定义格式: 属性名="属性值",其中属性值必须是 ''或者""引起来
 *              3.一个标签的属性可以是任意个,多个属性直接使用空格隔开,但是不能出现同名的属性
 *              4.属性名不能使用特殊符号,必须以字母开头
 *
 *          4.注释:
 *              <!--这里是注释 -->
 *
 *          5.转义字符
 *              <   &lt;
 *              >   &gt;
 *              "   &quot;
 *              '   &apos;
 *              &   &amp;
 *
 *----------------------------------------------------------------------------------------------------------
 * DTD
 *  1.DTD简介
 *      因为xml没有预定义标签,导致在书写时,可能比较乱
 *      DTD:Document Type Definition 文档类型定义
 *      DTD用于约束xml的文档格式,保证xml是一个有效的xml
 *      DTD可以分为两种,内部DTD,外部DTD
 *
 *      DTD是xml的约束,可以规定xml可用的标签,规定标签出现的次序,规定标签的嵌套方式
 *      我们开发的重点是: 根据框架提供的DTD约束文档,编写出符合要求的XML文件!!!
 *      a.创建我们自己的XML,引入要约束的DTD文件
 *      b.根据DTD约束(idea有提示),完成我们的XML
 *      c.快速开发:我们只需要写一个根标签,然后回车即可快速开发
 *
 *  2.使用DTD
 *      内部DTD的定义
 *          语法格式:
 *              a,<!DOCTYPE 根元素 [元素声明]>
 *
 *              b,元素声明语法: <!ELEMENT 元素名 (子元素[,子元素...])>
 *
 *              c,数量词      +: 表示出现1次或多次,换句话说,至少出现一次
 *                           ?:表示出现0次或1次
 *                           *:表示可以出现任意次
 *                           标签1,标签2: 表示必须先写标签1,再写标签2
 *                           标签a|标签b|标签c: 表示标签abc只能选择其中的一个出现
 *
 *              d,属性声明语法:<!ATTLIST 元素名称 属性名称 属性类型 默认值>
 *                      属性类型:CDATA :表示字符数据
 *                      默认值:#REQUIRED :表示必须出现   #IMPLIED:不是必须的
 *
 *     外部DTD的定义
 *          1.创建一个独立的DTD文件
 *          2.在xml中引入外部DTD文件 语法:<!DOCTYPE scores SYSTEM "scores.dtd">
 *
 *----------------------------------------------------------------------------------------------------------
 *  schema(提要，纲要;)
 *      1.什么是schema
 *          也是一种xml约束,比DTD更强大,主要表现对数据类型的约束
 *          Schema本身也是xml,但是后缀名是xsd
 *
 *      2.Schema约束的体验
 *          我们开发的重点是: 根据框架提供的Schema约束文档,编写出符合要求的XML文件!!!
 *          a.创建自己的XML,引入Schema约束
 *          b.根据Schema约束(idea有提示),完成我们的XML
 *
 *----------------------------------------------------------------------------------------------------------
 *  XML解析
 *      1.什么是xml解析
 *          所谓的xml解析就是通过编写的代码,将保存在xml的数据读取出来
 *
 *      2.解析方式和解析器和解析开发包
 *          解析理论方式:
 *              a.DOM解析方式:
 *                  将整个xml一次性读取到内存,然后进行解析
 *                  优点:xml结构是完整的,可以对某些标签进行增删改查
 *                  缺点:可能会导致内存溢出
 *              b.SAX解析方式:
 *                  将整个xml一行一行的读取到内存中,读取一行解析一行,解析完一行释放一行
 *                  优点:速度快,不占用大量内存
 *                  缺点:XML结构是不完整的
 *              c.PULL解析方式:
 *                  小型的嵌入式系统的使用
 *
 *      3.解析器:
 *          就是对解析理论方式,进行代码实践
 *          解析器不一定是代码写的,代码也是非常繁琐
 *
 *      4.解析并发包
 *          对解析器进一步的封装,使代码更加简单易用
 *
 * ----------------------------------------------------------------------------------------------------------
 *  DOM4J
 *      解析原理:
 *          一次性将整个XML读取到内存,然后进行解析,返回一个解析后的Document对象(倒立的Dom树)
 *
 *      1.解析方式:
 *              DOM:把整个xml文档加载到内存中解析,在内存中会生成一棵DOM树
 *                  优点:可以对整棵树去操作,可以去执行增删改查操作
 *                  缺点:占用内存太大,可能会导致内存溢出
 *              SAX:一边去读取.一边加载,操作完了一部分,就去释放内存,再去读取下一部分
 *                  优点:占用内存小,不会导致内存问题
 *                  缺点:无法去对所有元素进行增删改的操作
 *
 *     2.解析开发包
 *         JAXP:    java中提供的解析xml的方式,就在jdk里面
 *         DOM4j:   第三方优秀的解析工具包
 *         JSOUP:   是一个专门解析html的技术,也可以解析xml
 *
 *      3.DOM4j结合XPath解析XML
 *          1.什么是XPath
 *              XPath称为路径表达式,我们Dom4J可以结合Xpath,快速获取路径表达式中所指的那个元素和属性!!
 *          2.XPath使用步骤
 *              a.导入jar包
 *              b.使用SaxReader读取xml文件
 *              c.使用API和Xpath结合,快速获取结点
 *                  public List selectNodes("Xpath表达式");获取符合表达式的元素集合
 *                  public Element selectSingleNode("Xpath表达式") 获取符合表达式的唯一元素
 *          3.XPath语法
 *              1. 绝对路径表达式方式 例如: /元素/子元素/子子元素...
 *              2. 相对路径表达式方式 例如: 子元素/子子元素.. 或者 ./子元素/子子元素..
 *              3. 全文搜索路径表达式方式 例如: //子元素//子子元素
 *              4. 谓语（条件筛选）方式 例如: //元素[@attr1=value]
 *
 *          4.
 *
 *----------------------------------------------------------------------------------------------------------
 *
 *  @Author : ItAmao
 *  @Date   : 2020/7/5 21:44
 */
public class Test01 {

}
