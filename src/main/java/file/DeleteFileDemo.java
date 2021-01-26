package file;

import java.io.File;

public class DeleteFileDemo {
    public static void main(String[] args) {
        //将test.txt文件删除
        File file = new File("text.txt");
        if (file.exists()){
            file.delete();
            System.out.println("文删除成功！");
        }else {
            System.out.println("文件不存在！");
        }
    }
}
