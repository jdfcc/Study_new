package 网络编程.UDP协议;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class test_receive {
    public static void main(String[] args) throws IOException {

        DatagramSocket socket=new DatagramSocket(10086);
        byte[] byt=new byte[1024];
        DatagramPacket packet=new DatagramPacket(byt,byt.length);
        socket.receive(packet);
        int len=packet.getLength();
        byte[] data=packet.getData();
        String dateString=new String(data,0,len);
        System.out.print(dateString);

        socket.close();
    }
}
