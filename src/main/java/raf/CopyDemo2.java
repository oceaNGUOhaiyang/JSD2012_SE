package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 通过提高每次读写的数据量减少实际读写的次数可以提高读写效率。
 * 单字节读写是随机读写
 * 一组字节读写是块读写
 * 对于机械硬盘而言，单字节读写几乎没有效率可言，块读写效率很好。
 * 对大部分硬件而言，减少硬件调用次数都可以提高效率
 */
public class CopyDemo2 {

    public static void main(String[] args) throws IOException {
        RandomAccessFile src = new RandomAccessFile(
                "setup.exe","r"
        );
        RandomAccessFile desrc = new RandomAccessFile(
                "setup_cp","rw"
        );
        /**
         * RAF的块读写方法：
         * 块写：
         * void write(byte[] data)
         * 一次性将给定的字节数组中所有字节写入文件
         * void write(byte[] data,int offset,int len)
         * 一次性将给定的数组中从下标offset处开始的连续的len个字节写入文件
         *
         * 块读：
         * int read(byte[] data)
         * 一次性从文件中读取给定的字节数组data总长度字节量并将读取到的文件顺序的
         * 存入到该数组中。返回实际读取到的字节量。如果返回值为-1表示读取到了文件末尾
         * 文件数据
         * 10011001 10101010 11010101 01010101 11110010
         * byte[] data = new byte[6]
         * data = [00000000,00000000,00000000,00000000,00000000,00000000]
         * int len = raf.read();
         * data = [10011001 10101010 11010101 01010101 11110010 00000000]
         * len = 5//返回值为5,说明本次实际只读取到5个字节
         * 与单字节读取的区别：
         * int d = raf.read()//返回一个字节，返回值就是实际读取的字节大小
         * d：000000000 000000000 000000000 10011001//该字节方法低八位上
         */
        int len;
        byte[] data = new byte[1024*10];//10kb
        long start = System.currentTimeMillis();
        while ((len = src.read(data))!=-1){
            desrc.write(data,0,len);//读了多少就写入多少
        }
        long end = System.currentTimeMillis();
        System.out.println("复制完成！"+(end-start));
        src.close();
        desrc.close();
    }
}
