package test;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class test011_字节流复制文件 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("1.txt");
        FileOutputStream fos = new FileOutputStream("2.txt");
        //一次读取一个字节数组
        int len;
        byte[] bytes = new byte[1024];
        while ((len = fis.read(bytes)) != -1) {
            fos.write(bytes, 0, len);
        }
        fis.close();
        fos.close();
    }
}
