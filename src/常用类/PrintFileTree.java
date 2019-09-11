package 常用类;

import java.io.File;

/**
 * 打印目录树
 *
 * @author huzhu
 * @date 2019-04-11 21:55
 */
public class PrintFileTree {
    public static void main(String[] args) {
        File f = new File("/Users/hz/Documents/codes/java");
        printFile(f, 0);

    }

    public static void printFile(File file, int level) {
        for (int i = 0; i < level; i++) {
            System.out.print('-');
        }
        System.out.println(file.getName());
        if (file.isDirectory()) {
            File[] files = file.listFiles();

            for (File item : files) {
                printFile(item, level + 1);
            }
        }
    }
}
