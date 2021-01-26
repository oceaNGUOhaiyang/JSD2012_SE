package file;

import java.io.File;

/**
 * 创建多级目录
 */
public class MkDirsDemo {
    public static void main(String[] args) {
        //在当前目录下新建目录a/b/c/d/e/f
        File dirs = new File("a/b/c/d/e/f");
        if (dirs.exists()){
            System.out.println("目录已经存在");
        }else{
            dirs.mkdirs();
            System.out.println("目录创建成功");
        }
    }
}
