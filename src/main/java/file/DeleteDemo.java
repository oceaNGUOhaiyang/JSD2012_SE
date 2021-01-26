package file;

import java.io.File;

/**
 * 删除目录
 */
public class DeleteDemo {
    public static void main(String[] args) {
        //删除当前目录下的Demo目录
        File dir = new File("./demo");
        if (dir.exists()){
            //delete方法删除目录时要求该目录必须是一个空目录才可以
            dir.delete();
            System.out.println("目录已经删除！");
        }else {
            System.out.println("目录不存在");
        }
    }
}
