package file;

import java.io.File;

public class MkDirDemo {
    /**
     * 使用File创建一个目录
     * @param args
     */
    public static void main(String[] args) {
        //在当前目录下新建一个目录
        File dir = new File("demo");
        if (dir.exists()){
            System.out.println("目录已经存在");
        }else {
            dir.mkdir();
            System.out.println("目录创建成功!");
        }
    }
}
