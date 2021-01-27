package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 读取文本数据
 */
public class ReadStringDemo {
    public static void main(String[] args) throws IOException {
        RandomAccessFile raf = new RandomAccessFile("raf.txt","r");

        byte[] data = new byte[(int)raf.length()];//构造存放字节文件的数组
        raf.read(data);//将raf中的内容一次性读入数组

        //String的构造方法允许将给定字节数组暗中啊指定字符集还原文字
        String line = new String(data,"utf-8");
        System.out.println(line);

    }
}
