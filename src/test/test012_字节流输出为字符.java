package test;

import java.io.*;

public class test012_字节流输出为字符 {
    public static void main(String[] args) throws IOException {
        //创建字节输入流对象
        BufferedReader br =new BufferedReader(new FileReader("1.txt"));
        //创建字符输出流对象(OutputStreamWriter为将字节转换为字符，System.out为输出到控制台)
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String line;
        while ((line = br.readLine()) != null){
            bw.write(line);
            bw.newLine();
        }
        //释放资源
        br.close();
        bw.close();
    }
}
