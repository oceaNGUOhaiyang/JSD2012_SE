package raf;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 使用RAF读写基本类型数据，以及RAF指针的操作
 */
public class RAFDemo3 {
    public static void main(String[] args) throws IOException {
        RandomAccessFile raf = new RandomAccessFile("raf.dat","rw");
        /**
         * 向文件中写入一个最大值；int
         * 01111111 11111111 11111111 11111111
         * 使用右移操作将每个字节都移到低八位
         */
        int imax = Integer.MAX_VALUE;
        long pos = raf.getFilePointer();//获取指针的位置
        System.out.println("pos = "+pos);
        raf.write(imax>>>24);
        raf.write(imax>>>16);
        raf.write(imax>>>8);
        raf.write(imax);
        pos = raf.getFilePointer();
        System.out.println("pos = "+pos);

        raf.writeInt(imax);//连续写4个字节，将int值写出，等同于上面4句代码
        raf.writeLong(123L);
        raf.writeDouble(123.123);
        pos = raf.getFilePointer();
        System.out.println("pos = "+pos);

        System.out.println("写入完成！");

        raf.seek(0);//指针指到第1位（数组下标为0）
        int d = raf.readInt();
        System.out.println(d);
        System.out.println("pos"+pos);
        //读long值
        raf.seek(8);//将指针移到第8位
        long l = raf.readLong();
        System.out.println(l);
        System.out.println("pos:"+raf.getFilePointer());

        //读double值
        double dou = raf.readDouble();
        System.out.println(dou);
        System.out.println("pos :"+raf.getFilePointer());

        //修改raf.dat文件中long所在位置的值改为456
        //1将指针移动到long值开始的位置
        raf.seek(8);
        //2、重新写入新的long值来覆盖原有数据
        raf.writeLong(456l);
        raf.seek(8);
        l = raf.readLong();
        System.out.println(l);

















        raf.close();
    }
}
