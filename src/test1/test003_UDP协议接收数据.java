package test1;

import com.sun.xml.internal.ws.wsdl.writer.document.http.Address;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class test003_UDP协议接收数据 {
    public static void main(String[] args) throws IOException {
        //创建接收端Socket对象
        DatagramSocket ds = new DatagramSocket(8888);
        //接收数据
        byte[] bys = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bys, bys.length);
        ds.receive(dp);
        //解析数据
        InetAddress address = dp.getAddress();  //获取发送端ip地址
        byte[] b = dp.getData();    //获取接收到的内容
        int length = dp.getLength();    //获取接收到的数据长度
        //输出数据
        System.out.println(address.getHostAddress());
        System.out.println(new String(b, 0 , length));

        //关闭
        ds.close();

    }
}
