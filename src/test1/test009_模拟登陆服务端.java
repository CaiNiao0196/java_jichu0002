package test1;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;

public class test009_模拟登陆服务端 {
    public static void main(String[] args) throws IOException {
        //创建接收端对象
        ServerSocket ss = new ServerSocket(2001);
        //监听
        Socket s = ss.accept();
        //创建输入流对象
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        //获取用户名和密码
        String username = br.readLine();
        String password = br.readLine();
        //判断用户名和密码是否正确
        Boolean flag = false;
        List<test010_模拟登陆数据类> users = test011_模拟登陆数据库.getUsers();
        test010_模拟登陆数据类 user = new test010_模拟登陆数据类(username, password);
        if(users.contains(user)){
            flag = true;
        }
        //返回判断
        PrintWriter pw = new PrintWriter(s.getOutputStream(), true);
        if (flag = true){
            pw.println("登陆成功！");
        }else {
            pw.println("登陆失败！");
        }
        //关闭资源
        s.close();


    }
}
