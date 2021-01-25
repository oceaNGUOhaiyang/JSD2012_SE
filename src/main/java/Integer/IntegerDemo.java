package Integer;

/**
 * 包装类，
 * 包装类是为了解决基本类型不能直接参与面向对象开发的问题，使得基本类型
 * 可以以”对象“的形式存在
 * 包装类都定义在java.lang包中作为基础类使用。6个数字类型的包装类
 * 继承子Number,其余两个直接继承自Object。
 */
public class IntegerDemo {
    public static void main(String[] args) {
        int d = 123;
//        Integer i1 = new Integer(d);
//        Integer i2 = new Integer(d);
        /**
         * 基本类型转换为包装类建议使用包装类的静态方法valueOf对于Integer而言，
         * 该方法会重用1字节（-127~128）以内的对象
         */
        Integer i1 = Integer.valueOf(d);
        Integer i2 = Integer.valueOf(d);
        System.out.println(i1==i2);//Integer已经为我们重写好了equals方法了
        System.out.println(i1.equals(i2));
        /**
         * 基本类型和引用类型之间的转换
         */
        int i = i1.intValue();//将包装类表示的数字
        System.out.println(i);

        double dou = i1.doubleValue();//以double类型返回
        System.out.println(dou);
    }
}
