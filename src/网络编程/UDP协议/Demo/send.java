package 网络编程.UDP协议.Demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;


public class send {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket();
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        String val;
        while ((val = bfr.readLine()) != null) {
            if ("886".equals(val)) {
                break;
            }
            InetAddress address = InetAddress.getByName("192.168.159.1");
            int port = 10086;
            byte[] data = val.getBytes();
            DatagramPacket packet = new DatagramPacket(data, data.length, address, port);
            socket.send(packet);
        }
        socket.close();
    }

}
