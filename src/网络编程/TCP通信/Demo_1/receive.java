package 网络编程.TCP通信.Demo_1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class receive {
    public static void main(String[] args) throws IOException {
        ServerSocket socket=new ServerSocket(10086);
        Socket s=socket.accept();
        InputStream stream=s.getInputStream();
        byte[] byt=new byte[1024];
        int len=stream.read(byt);
        String val=new String(byt,0,len);
        System.out.println(val);

        OutputStream ous=s.getOutputStream();
        ous.write("Received".getBytes());


    }
}
