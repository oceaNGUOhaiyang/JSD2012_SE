package string;

import javax.swing.plaf.SpinnerUI;

/**
 * 字符串常量池是JVM在堆内存中专门为了字符串提供的一段空间，用于缓存所有使用字面量形式创建
 * 的字符串对象，当再次使用相同字面量创建字符串时会直接重用常量池中的对象，而不互再次创建新对象
 * 减少内存开销
 */
public class StringDemo {
    public static void main(String[] args) {
        String s1 = "ocean";
        System.out.println("s1= "+s1);

        String s2 = "123abc";
        System.out.println("s2 = "+s2);
        System.out.println(s1==s2);

        String s3 = new String("ocean");

        System.out.println(s3==s2);//比较的是字符串的地址
        System.out.println(s2.equals(s3));//比较的是字符串指向的对象中的内容

        s1 = s1 + "!";//不是在原有的字符串修改，而是重新new了对象，s1中存储的是新对象的地址
        System.out.println(s1 == s2);


        //当编译器在编译一段代码时发现一个计算表达式在编译期间就可以确定结果时，就会进行计算，并将结果编译到.class文件中，
        //这样一来，jvm运行该程序时，就不必每次都进行计算了
        String s4 = "123" + "abc";//可以直接计算
        System.out.println(s2==s4);

        String s5 = "123";
        String s6 = s5 +"abc";//编译器期间没有对象，所以，无法和s2公用同一个对象
        System.out.println(s2==s6);







    }
}
