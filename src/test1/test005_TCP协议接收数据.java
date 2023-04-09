package test1;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class test005_TCP协议接收数据 {
    public static void main(String[] args) throws IOException {
        //创建接收端Socket对象
        ServerSocket ss = new ServerSocket(1001);
        //监听
        Socket s = ss.accept();
        //获取输入流对象
        InputStream is = s.getInputStream();
        //获取数据
        byte[] bys = new byte[1024];
        int len;
        while ((len = is.read(bys)) != -1){
            //输出数据
            System.out.println(new String(bys, 0, len));
        }

        //关闭连接
        s.close();
    }
}
