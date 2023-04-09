package test1;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class test001_InetAddress {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress inetAddress = InetAddress.getByName("xia");//输入主机名，返回主机名和ip地址
        //InetAddress inetAddress1 = InetAddress.getByName("ip");//输入IP地址，返回ip地址
        System.out.println(inetAddress);
        String hostAddress = inetAddress.getHostAddress();//返回IP地址
        String hostName = inetAddress.getHostName();//返回主机名
        System.out.println(hostAddress);
        System.out.println(hostName);
    }
}
