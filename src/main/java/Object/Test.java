package Object;

public class Test {
    public static void main(String[] args) {
        Point p = new Point(1,2);
        /**
         * Object中定义了方法：
         * String toString()
         * 作用是将当前对象转换为String
         * Object中该方法的实现反悔的字符串格式为：类名@地址
         */
        String str = p.toString();//把当前对象转换为字符串
        System.out.println(str);
        /**
         * 向控制台输出是很常用的操作，当我们输出一个对象时，
         * 实际上该方法会调用该对象的toString方法，将返回的字符串输出到控制台
         */
        System.out.println(p);

        /**
         *  字符串与其他类型连接是，会将其他类型转换为String
         *  而转换也是依靠该对象的toString
         *  下面实际上是将p,toString()返回的字符串连接的
         */

        String line = "this object is :"+p;
        System.out.println(line);

        Point p2 = new Point(1,2);
        System.out.println(p==p2);
        /**
         * Object提供的另一个方法：
         * boolean equals(Object o)
         * 该方法的作用是比较当前对象与参数给定的对象内容是否相同
         * 但是如果子类不重写这个方法，则该方法毫无价值，因为Object实现该方法是是使用“==”比较的
         */

        System.out.println(p.equals(p2));
        /**
         * java提供的类基本都妥善的重写了toString和equals比如String
         * 只有自己定义的类在使用equals时需要重写
         */
        String str1 = "123";
        String str2 = "123";
        System.out.println(str1.equals(str2));
    }
}
