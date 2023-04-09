package test;

import java.io.*;
import java.util.Properties;

public class test018_propertiesIO {
    public static void main(String[] args) throws IOException {
        //perperties.list只能接收打印输出流
        Properties pro = new Properties();
        pro.put("001", "aaa");
        pro.put("002", "bbb");
        PrintWriter pw = new PrintWriter("6.txt");
        pro.list(pw);
        pw.close();
        //properties.load输入流
        FileReader fr =new FileReader("6.txt");
        pro.load(fr);
        fr.close();
        System.out.println(pro);
        //peoperties.store任意形式的输出流(hello代表输出文件的标题)
        FileWriter fw = new FileWriter("7.txt");
        pro.store(fw, "hello");
        fw.close();

        /*
        转换编码问题：
        1.输出流将字符串转为byte类型数据：byte[] b = s.getBytes(字符串, 'UTF-8');
        2.输入流：new String(数组, 0, 长度, "UTF-8")
        3.输出流将字节流转为字符编码格式：OutPutStreamWriter ow = new OutPutStreamWriter(new FileOutPutStream("x.txt"), "UTF-8")

         */
    }
}
