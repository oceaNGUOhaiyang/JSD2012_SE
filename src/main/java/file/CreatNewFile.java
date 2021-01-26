package file;

import java.io.File;
import java.io.IOException;

/**
 * 使用File创建一个文件
 */
public class CreatNewFile {
    public static void main(String[] args) throws IOException {
        //在当前目录下新建一个文件test.txt
        File file = new File("./text.txt");
        if (file.exists()){
            System.out.println("该文件已经存在");
        }else{
            file.createNewFile();
            System.out.println("文件创建成功！");
        }
    }
}
