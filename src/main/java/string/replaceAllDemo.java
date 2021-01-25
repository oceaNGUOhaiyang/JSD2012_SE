package string;

/**
 * String支持正则表达式的方法3
 * String replaceAll(String str)
 * 将指定部分全部替换为str
 */
public class replaceAllDemo {
    public static void main(String[] args) {
        String str = "1aasd23d5fds569fdsa96812dsa";
//        str = str.replaceAll("[a-zA-z]+","#NUMBER#");
        String str1 ;
        //将满足部分替换为空字符串可以达到去除的效果
        str1 = str.replaceAll("[a-z]","");
        System.out.println(str1);
    }
}
