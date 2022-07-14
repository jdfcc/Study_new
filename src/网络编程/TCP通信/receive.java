package 网络编程.TCP通信;

import com.sun.corba.se.spi.activation.Server;
import jdk.net.Sockets;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;


public class receive {
    public static void main(String[] args) throws IOException {
        ServerSocket s=new ServerSocket(10086);
        Socket socket=s.accept();
//        监听客户端连接，接受连接请求

        InputStream stream=socket.getInputStream();
        byte[] byt=new byte[1024];
        int len=stream.read(byt);
        String data=new String(byt,0,byt.length);
        System.out.println(data);

        s.close();
        socket.close();
    }
}
