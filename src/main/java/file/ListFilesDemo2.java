package file;

import javax.naming.Name;
import java.io.File;
import java.io.FileFilter;

/**
 * Files[] listFiles(FileFilter  filter)
 * 将当前File对象表示的目录中所有的符合给定条件的子项返回
 * 该方法会将该目录中所有的子项经过一次给定的过滤器，然后仅保留
 * 并返回要求的子项
 */
public class ListFilesDemo2 {
    public static void main(String[] args) {
        /**
         * 获取当前目录中含有“e”的子项
         */
        File dir = new File(".");
        if (dir.isDirectory()){
            FileFilter fileFilter = new FileFilter() {
                public boolean accept(File file) {
                    String name = file.getName();
                    return name.contains("e");
                }
            };
            File[] subs = dir.listFiles(fileFilter);
            System.out.println("子项个数为："+subs.length);
            for (int i = 0; i <subs.length ; i++) {
                System.out.println(subs[i]);
            }
        }

    }
}
