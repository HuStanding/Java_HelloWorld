package 常用类;

import java.io.File;
import java.io.IOException;
import java.util.Date;

/**
 * File类的基本方法
 * @author huzhu
 * @date 2019-04-11 11:32
 */
public class FileTest {
    public static void main(String[] args) throws IOException {
        File f = new File("filetest.txt");
        f.createNewFile();
        System.out.println(f);

        System.out.println(System.getProperty("user.dir"));

        File f2 = new File("filetest2.txt");
        f2.createNewFile();


        System.out.println("File是否存在："+f.exists());
        System.out.println("File是否是目录："+f.isDirectory());
        System.out.println("File是否是文件："+f.isFile());
        System.out.println("File最后修改时间："+new Date(f.lastModified()));
        System.out.println("File的大小："+f.length());
        System.out.println("File的文件名："+f.getName());
        System.out.println("File的目录路径："+f.getPath());
    }
}
