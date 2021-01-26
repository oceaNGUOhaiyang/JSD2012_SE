package string;

/**
 * String支持正则表达式方法之二，
 *
 * String[] split(regex)
 * 将当前字符串按照满足正则表达式的部分进行拆分，将拆分的所有部分以一个String数组形式返回
 */
public class SplitDemo {
    public static void main(String[] args) {
        /**
         * 当遇到连续可拆分项的时候，中间会拆分一个空字符串，如果字符串最开始就是拆分项
         * ，则拆分后第一项就是空字符串，
         * 如果末尾出现可拆分型，所有拆分出来的空字符串会被忽略
         */
        String str = "12..3556.996..8";
        String[] arr = str.split("\\.",5);
        System.out.println(arr.length);
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
//        String regex = "(fk|nmsl|nc|five|nm)";
//        String message = "fk!你真是nm铁five";
//        message = message.replaceAll(regex,"****");
//        System.out.println(message);
    }
}
