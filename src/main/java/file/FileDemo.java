package file;

import java.io.File;
import java.sql.SQLOutput;

/**
 * java.io.File可以表示硬盘上的一个文件或目录
 * 使用File可以：
 * 1、访问该文件或目录的属性信息（大小、修改日期、可以读写）
 * 2、创建或者删除文件和目录
 * 3、访问一个目录中的所有子项
 *
 * 但是File不能访问文件中的数据
 */
public class FileDemo {
    /**
     * File创建是可以指定路径
     * 该路径使用相对路径，它有更好的跨平台性
     * 相对路径中“./”表示当前目录，当前目录具体是哪里要视当前程序运行的环境而定
     * 在eclipse或者idea中运行时，当前目录指这个程序所在的项目目录
     */
    public static void main(String[] args) {
        File file = new File("./demo.txt");
        /**
         * 获取名字和文件字节大小
         */
        String filename = file.getName();
        System.out.println(filename);

        long len = file.length();
        System.out.println(len+"字节");

        /**
         * 查看文件可读？可写？隐藏？
         */
        boolean cr = file.canRead();
        boolean cw = file.canWrite();
        System.out.println(cr);
        System.out.println(cw);

        boolean ih = file.isHidden();
        System.out.println(ih);




    }


}
