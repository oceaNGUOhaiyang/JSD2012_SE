package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 *  用户注册
 *  程序启动后要求用户顺序输入用户名，密码，昵称和年龄
 *  然后将该记录写入文件user.dat中保存
 *
 *  每条记录占用固定的100字节，其中用户名，密码，昵称为字符串
 *  ，各占32字节，年龄int占4字节
 */
public class RegDemo {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("欢迎注册！");
        System.out.println("请输入用户名：");
        String username = scanner.nextLine();
        System.out.println("请输入密码：");
        String password = scanner.nextLine();
        System.out.println("请输入昵称：");
        String nickname = scanner.nextLine();
        System.out.println("请输入年龄：");
        int  age = scanner.nextInt();

        RandomAccessFile raf = new RandomAccessFile("user.dat","rw");
        raf.seek(raf.length());//每次在使用前将指针拨到每个文件的长度处

        byte[] data = username.getBytes("utf-8");
        data = Arrays.copyOf(data,32);
        raf.write(data);

        data = password.getBytes("utf-8");
        data = Arrays.copyOf(data,32);//这里还是需要扩容的，byte[] data第一次指向username.getBytes数组长度根据用户输入来看
        raf.write(data);                       //第一次扩容后是32，但是随后又指向了password.getBytes,长度又和用户输入有关
                                                //所以还需要扩容

        data = nickname.getBytes("utf-8");
        data = Arrays.copyOf(data,32);
        raf.write(data);

        raf.writeInt(age);
        System.out.println("注册完毕！");
        raf.close();
    }
}
