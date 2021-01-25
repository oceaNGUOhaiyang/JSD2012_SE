package Integer;

/**
 * 包装类常用功能
 */
public class IntegerDemo2 {
    public static void main(String[] args) {
        /**
         * 获取最大最小值
         */
        int imax = Integer.MAX_VALUE;
        int imin = Integer.MIN_VALUE;
        System.out.println("imax = :"+imax);
        System.out.println("imin = :"+imin);
        long lmax = Long.MAX_VALUE;
        long lmin = Long.MIN_VALUE;
        System.out.println("lmax = :"+lmax);
        System.out.println("lmin = :"+lmin);
        /**
         * 包装类提供了一个静态方法parserXXX(String line)
         * 可以将字符串解析为对应基本类型的数据，前提是该字符串正描述了基本类型可以保存的值，否则会抛出异常
         * java.lang.NumberFormatException
         */
        String line = "123";
        int in = Integer.parseInt(line);
        System.out.println(in);
        double dou = Double.parseDouble(line);
        System.out.println(dou);
    }
}
