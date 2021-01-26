package raf;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.RandomAccess;

/**
 * java.io.RandomAccessFile
 * RAF是专门用来读写文件的类，其基于指针对文件进行随机读取
 */
public class RAFDemo1 {
    public static void main(String[] args) throws IOException {
        //想对当前目录下的rat.dat文件进行处理
        /**
         * RAF常用构造器
         * RandomAccessFile(File file,String mode)
         * RandomAccessFile(String path,String mode)
         * 第一个参数为要进行读写的文件，可以传入file对象。也可以
         * 直接给定该文件的路径。
         * 第二个参数为操作模式，有两种：
         * “r”为只读模式
         * “rw”为读写模式，对文件读写均可
         */
        RandomAccessFile raf = new RandomAccessFile(
                "./raf.dat ","rw"
        );
        //向文件中写入一个二进制数数据
        /**
         * void write(int d)
         * 向文件中写入一个字节，写入的是给定的int值所对应的二进制的“低八位”
         * int型整数1的二进制：
         * 00000000 00000000 00000000 00000001
         *
         * write方法写入该int值对应二进制的低八位：
         *                            vvvvvvvv
         * 00000000 00000000 00000000 00000000
         */
        raf.write(-1);
        raf.write(2);
        System.out.println("写入完毕！");

        raf.close();
    }
}
