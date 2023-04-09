package test1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class test007_练习收发数据之服务端 {
    public static void main(String[] args) throws IOException {
        //创建接收端Socket对象
        ServerSocket ss = new ServerSocket(1002);
        //监听
        Socket s = ss.accept();
        //创建输入流对象
        InputStream is = s.getInputStream();
        //接收数据
        byte[] bys = new byte[1024];
        int len;
        //while ((len = is.read(bys)) != -1){
        //    String str = new String(bys, 0, len);
        //}
        len = is.read(bys);
        String str = new String(bys, 0, len);
        System.out.println(str);

        //收到的字符转为大写
        String strs = str.toUpperCase();
        //创建输出流对象
        OutputStream os = s.getOutputStream();
        //输出数据
        os.write(strs.getBytes());

        //关闭连接（服务器不用关闭）
        s.close();
    }
}
