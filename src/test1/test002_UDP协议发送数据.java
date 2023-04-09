package test1;

import java.io.IOException;
import java.net.*;

public class test002_UDP协议发送数据 {
    public static void main(String[] args) throws IOException {
        //创建发送端Socket对象
        DatagramSocket ds = new DatagramSocket();
        //创建数据并打包（发送端数据）
        String  s = "hello";
        byte[] bys = s.getBytes();    //发送的数据
        int length = bys.length;    //发送的数据长度
        InetAddress address = InetAddress.getByName("xia");     //设备的地址
        int port = 8888;    //进程的地址
        DatagramPacket dp = new DatagramPacket(bys, length, address, port);
        //发送
        ds.send(dp);
        //关闭
        ds.close();

    }


}
