package 网络编程.TCP通信.Demo_2;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class receive {
    public static void main(String[] args) throws IOException {
        ServerSocket socket=new ServerSocket(10086);
        Socket s=socket.accept();

        while (true){
            InputStream ins=s.getInputStream();
            byte[] byt=new byte[1024];
            int len=ins.read(byt);
            String val=new String(byt,0,len);
            System.out.println(val);

        }

    }
}
