package test1;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class test004_TCP协议发送数据 {
    public static void main(String[] args) throws IOException {
        //创建发送端Socket对象
        Socket s = new Socket(InetAddress.getByName("xia"), 1001);
        //获取输出流对象
        OutputStream os = s.getOutputStream();
        //发送数据
        String str = "hello";
        os.write(str.getBytes());
        //关闭连接
        os.close();
        s.close();
    }
}
