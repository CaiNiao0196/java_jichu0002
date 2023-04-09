package test1;

import com.sun.xml.internal.ws.wsdl.writer.document.http.Address;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class test006_练习收发数据之客户端 {
    public static void main(String[] args) throws IOException {
        //创建Socket对象
        Socket s = new Socket(InetAddress.getByName("xia"),1002);
        //创建输出流对象
        OutputStream os = s.getOutputStream();
        //发送数据
        String str = "hello";
        os.write(str.getBytes());

        //创建输入流对象
        InputStream is = s.getInputStream();
        //接收数据
        byte[] bys = new byte[1024];
        int len;
        len = is.read(bys);
        String strs = new String(bys, 0, len);
        System.out.println(strs);
        //关闭连接
        s.close();

    }
}
