package 网络编程.TCP通信.Demo_1;

import com.sun.corba.se.spi.activation.Server;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class send {
    public static void main(String[] args) throws IOException {
        Socket s=new Socket("192.168.159.1",10086);

        OutputStream stream=s.getOutputStream();
        stream.write("Hello".getBytes());

        InputStream stream1=s.getInputStream();
        byte[] byt=new byte[1024];
        int len=stream1.read(byt);
        String val=new String(byt,0,len);
        System.out.println(val);

    }
}
