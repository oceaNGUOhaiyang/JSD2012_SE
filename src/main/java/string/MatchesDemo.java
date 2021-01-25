package string;

import javax.xml.transform.Source;

public class MatchesDemo {
    public static void main(String[] args) {
        String e_mail = "157610ss@qq.com";
        String regex = "[a-zA-Z0-9_]+@[a-zA-Z0-9]+(\\.[a-zA-Z])+";
        boolean match = e_mail.matches(regex);
        if (match){
            System.out.println("是一个邮箱");
        }else {
            System.out.println("不是邮箱");
        }
    }
}
