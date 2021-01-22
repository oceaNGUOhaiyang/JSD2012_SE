package string;

/**
 * String substring (int start,int end)
 * 截取指定范围内的字符串。两个参数分别是范围对应的下标。
 * 注：在JAVA API中通常使用两个数字表示范围都是”左闭右开“
 * 有一个重载方法substring(start)从start开始截取后面所有的字符（闭区间）
 */
public class substring {
    public static void main(String[] args) {
        String host = "www.tedu.cn";
        String sub = host.substring(4,8);
        System.out.println(sub);

        sub = host.substring(4);//包含4
        System.out.println(sub);

    }
}
