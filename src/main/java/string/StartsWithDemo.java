package string;

/**
 * boolean startsWith(String str)
 * 判断字符串是否以给定的字符串开始的
 *
 * boolean endsWith(String str)
 * 判断字符串是否以芾碇的字符串结尾的
 */
public class StartsWithDemo {
    public static void main(String[] args) {
        String str = "www.tedu.cn";
        boolean start = str.startsWith("www");
        System.out.println(start);

        boolean end = str.endsWith("com");
        System.out.println(end);
    }
}
