package 网络编程.TCP通信;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class send {
    public static void main(String[] args) throws IOException {
//        Socket s=new Socket(InetAddress.getByName("192.168.159.1"),10086);
        Socket s = new Socket("192.168.159.1", 10086);
        OutputStream stream=s.getOutputStream();
        stream.write("HELLO DATA".getBytes());

    }
}
