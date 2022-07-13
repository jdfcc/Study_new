package 网络编程.UDP协议;

import java.io.IOException;
import java.net.*;

public class test_send {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket=new DatagramSocket();
//        创建Socket对象
        byte[] byt="Hello Date!".getBytes();
        int len=byt.length;
        InetAddress address=InetAddress.getByName("192.168.159.1");
        int port=20084;

        DatagramPacket packet=new DatagramPacket(byt,len,address,port);
//        数据打包
        socket.send(packet);
//        数据发送

        socket.close();
    }
}
