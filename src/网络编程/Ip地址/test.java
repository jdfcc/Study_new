package 网络编程.Ip地址;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class test {
    public static void main(String[] args) throws UnknownHostException {

       InetAddress address=InetAddress.getByName("192.168.159.1");
        String name=address.getHostName();
        String ip=address.getHostAddress();

        System.out.println(name);
        System.out.println(ip);
    }
}
