package string;

/**
 * indexOf()返回给定字符在当前字符串的位置，如果当前字符串不包含给定内容则返回-1
 * indexOf("in",3)从下标为3开始寻找(包含3)
 * lastindexOf("in")最后一次出现in的位置
 */
public class IndexOfDemo {
    public static void main(String[] args) {
        String str = "thinking in java";
        int index = str.indexOf("n ");//检索str中第一次出现in的位置
        System.out.println(index);

        index = str.indexOf("in",3);
        System.out.println(index);

        index = str.lastIndexOf("in");
        System.out.println(index);


    }

}
