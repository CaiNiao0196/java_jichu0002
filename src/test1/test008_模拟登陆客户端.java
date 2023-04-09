package test1;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

public class test008_模拟登陆客户端 {
    public static void main(String[] args) throws IOException {
        //创建客户端对象
        Socket s = new Socket(InetAddress.getByName("xia"), 2001);
        //获取用户名和密码
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("请输入账号：");
        String username = br.readLine();
        System.out.println("请输入密码：");
        String password = br.readLine();
        //创建输出流对象
        PrintWriter pw = new PrintWriter(s.getOutputStream(),true);
        //写出数据
        pw.println(username);
        pw.println(password);

        //接收返回数据
        BufferedReader serverBr = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String str = serverBr.readLine();
        System.out.println(str);
        //释放资源
        s.close();






    }
}
