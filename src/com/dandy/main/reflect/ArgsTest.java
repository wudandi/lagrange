package com.dandy.main.reflect;

/*可变长参数
*   int...args 这就是可变长参数
*   语法：类型...
*
*  参数的个数是0~N个
*  可变长度参数在参数列表中必须在最后一个位置上，而且可变长度参数只能有一个
* */
public class ArgsTest {
    public static void main(String[] args) {
        m();
        m(20,1);
        m("assdsadsa",1,2,3,4);
        m1("qwe","123","741852");
    }
    public static void m(int... args){
        System.out.println("cao");
    }
    public static void m(String a,int... args){
        System.out.println("nb");
    }
    public static void m1(String... args){
        for (int i = 0; i <args.length ; i++) {
            System.out.println(args[i]);
        }

    }
}
