package 网络编程.TCP通信.Demo_3;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class receive {
    public static void main(String[] args) throws IOException {
        ServerSocket socket=new ServerSocket(10086);
        BufferedWriter bfw=new BufferedWriter(new FileWriter("C:\\Users\\Jdfcc\\IdeaProjects\\Study_new\\src\\网络编程\\TCP通信\\Demo_3\\test.txt"));
        Socket s=socket.accept();

        while (true){
            InputStream ins=s.getInputStream();
            byte[] byt=new byte[1024];
            int len=ins.read(byt);
            String val=new String(byt,0,len);
            bfw.write(val);
            bfw.newLine();
            bfw.flush();
        }

    }
}
