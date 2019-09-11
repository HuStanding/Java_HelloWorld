import java.io.*;

public class FileStreamTest {
    public static void main(String[] args) {
        try{
            //输出流
            byte bWrite[] = {11,2,33,5,8};
            OutputStream os = new FileOutputStream("test.txt");
            for(int i = 0;i < bWrite.length;i++){
                os.write(bWrite[i]);
            }
            os.close();

            //输入流
            InputStream is = new FileInputStream("test.txt");
            int size = is.available();
            for(int i = 0;i < size;i++){
                System.out.print((char)is.read() + " ");
            }
            is.close();


        }catch (IOException e){
            System.out.println("Exception!");
        }
    }
}
