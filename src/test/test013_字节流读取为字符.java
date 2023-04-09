package test;

import java.io.*;

public class test013_字节流读取为字符 {
    public static void main(String[] args) throws IOException {
        //创建字符输入流对象(InputStreamReader表示将写入的字节数据转为字符，System.in表示键盘录入)
        Reader r = new InputStreamReader(System.in);
        //创建输出流对象
        FileWriter bw =new FileWriter("3.txt");
        int len;
        char[] chs = new char[1024];
        while ((len = r.read(chs)) !=-1){
            bw.write(chs,0,len);
            bw.flush();
        }
        //释放资源
        r.close();
        bw.close();


    }
}
