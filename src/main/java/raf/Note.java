package raf;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

/**
 * 简易记事本工具
 * 程序启动后要求用户输入一个文件名，然后对该文件进行写操作。
 * 之后用户在控制台输入的每一行字符串都写入到该文件中（不考虑换行问题）
 * 当用户单独输入"exit"时程序退出
 */
public class Note {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入文件名：");
        String name = scanner.nextLine();
        File file = new File(name+".txt");
        String str = "";
        if (!file.exists()){
            file.createNewFile();
            RandomAccessFile tx = new RandomAccessFile(name,"rw");
            System.out.println("请输入文件内容：");
            str = scanner.nextLine();
            while (!"exit".equals(str)){//变量字符串和常量字面量equals时，用字面量去equals变量字符串
                tx.write(str.getBytes("utf-8"));
                str = scanner.nextLine();

            }
            System.out.println("写入完成！");
            tx.close();
        }else {
            System.out.println("文件已经存在！");
        }
    }
}
