package string;

/**
 * String 的优化导致其为不变对象，这会存在利于重用但是不利于修改操作，
 * 频繁修改String会降低性能并有较多的系统开销
 *
 * java.lang.StringBuilder是专门设计用来修改String的API其内部维护一个可变的char数组
 * ，并提供了多种修改字符串内容的方法，例如：增删改查，和
 * String原有的相关方法：indexOf,length
 * StringBuilder修改String内容速度快，开销小
 */
public class StringBuilderDemo {
    public static void main(String[] args) {
        String str = "好好学习java";
        //内部表示空字符串
        StringBuilder stringBuilder = new StringBuilder();
        //基于给定的字符串进行修改，将str引用中的字符串复制一份到stringBuilder1中
//        StringBuilder stringBuilder1 = new StringBuilder("好好学习java");//非线程安全
        StringBuffer stringBuilder1 = new StringBuffer("好好学习java");//线程安全
        stringBuilder1.append(",赚钱！");//在stringBuiler1中追加字符串
        str = stringBuilder1.toString();
        System.out.println(str);

        /**
         * replace :替换当前字符串中的部分内容为指定内容
         */
        stringBuilder1.replace(9,12,"为了改变世界");
        System.out.println(stringBuilder1.toString());
        //直接输出stringBuiler1也是直接输出toString返回的字符串

        //按照指定位置删除
        stringBuilder1.delete(0,8);
        System.out.println(stringBuilder1);

        //将给定内容插入到指定位置
        stringBuilder1.insert(0,"活着");
        System.out.println(stringBuilder1);

        //字符串反转
        stringBuilder1.reverse();
        System.out.println(stringBuilder1);


    }
}
