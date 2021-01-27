package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;

/**
 * 向文件中写入文本数据
 */
public class WriteStringDemo {
    public static void main(String[] args) throws IOException {
        RandomAccessFile raf = new RandomAccessFile(
          "raf.txt","rw"
        );
        String str = "载着你仿佛载着阳光";
        /**
         * String 提供的方法
         * byte[] getByte(String csn)
         * 该方法要求必须处理UnsupportEncodingException
         * 当指定字符集名字不对时会抛出该异常
         */

        byte[]data =str.getBytes("utf-8");//转换为二进制文件
        raf.write(data);

        str = ",一片云飘落在我身边~，捏成你的形状";
        data = str.getBytes("utf-8");
        raf.write(data);
        System.out.println("写入完成");
        raf.close();
    }
}
