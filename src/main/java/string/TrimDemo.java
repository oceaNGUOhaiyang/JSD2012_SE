package string;

/**
 * String trim()取出字符串两边的空格
 */
public class TrimDemo {
    public static void main(String[] args) {
        String str = "   hello          ";
        System.out.println(str);

        String trim = str.trim();
        System.out.println(trim);
    }
}
