package string;

/**
         * static String valueoOf(XXX xxx)
         * String 提供了一组重载的静态方法：valueOf，作用是将java中其他类型转换为String
         * 最常用于将基本类型转换为字符串
         */
        public class ValueOfDemo {
            public static void main(String[] args) {
                int i = 123;
                String str = String.valueOf(i);
                System.out.println(i);


                double j = 23.3;
                String str1 = String.valueOf(j);
                System.out.println(str1);

                String str3 = i + "";
                System.out.println(str3);
    }
}
