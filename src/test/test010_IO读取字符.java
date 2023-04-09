package test;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class test010_IO读取字符 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("1.txt");
        FileWriter fw = new FileWriter("2.txt");
        //一次读取一个字符
        int str;
        while ((str = fr.read()) != -1){
            fw.write(str);
            fw.flush();
        }
        //一次读取一个字符数组
        int len;
        char[] chs = new char[1024];
        while ((len = fr.read(chs)) != -1){
            fw.write(chs, 0, len);
            fw.flush();
        }

        fr.close();
        fw.close();
    }


}
