import java.io.File;

public class CreateDir {
    public static void main(String[] args) {
        String dirname = "/Users/hz/Documents/java/HelloWorld/src/newdir";
        File d = new File(dirname);
        // 现在创建目录
        System.out.println(d.mkdirs()
        );
    }
}
