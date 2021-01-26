package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class CopyDemo {
    /**
    复制原理：从源文件中顺序读取每个字节到另外一个文件中
     */
    public static void main(String[] args) throws IOException {
        RandomAccessFile src = new RandomAccessFile("ocean.png","r");
        RandomAccessFile desrc = new RandomAccessFile("ocean1.png","rw");
        /**
         * ocean.txt:
         * 10000010 0101010 1010101....
         *
         * d:
         * 00000000 00000000 00000000 0101010
         *
         * ocean1.txt:
         * 0101010
         *
         */
        int d ;//如果在此处写 int d = src.read();则循环中一直不等于-1，一直复制第一个字节
        long start = System.currentTimeMillis();
        while ((d= src.read())!=-1){
            desrc.write(d);
        }
        long end = System.currentTimeMillis();
        System.out.println("复制完成,耗时："+(end - start));
        src.close();
        desrc.close();

    }

}

