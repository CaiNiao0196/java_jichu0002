package test;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class test014_打印流 {
    public static void main(String[] args) throws IOException {
        //打印流特有功能：1自动换行println 2自动刷新在FileWriter后打开开关
        //第一个true代表是否追加写入，第二个代表是否自动刷新
        PrintWriter pw = new PrintWriter(new FileWriter("1.txt", true),true);
        pw.println("hello");
        pw.close();
    }
}
