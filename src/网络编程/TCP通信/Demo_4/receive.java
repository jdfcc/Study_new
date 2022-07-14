package 网络编程.TCP通信.Demo_4;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class receive {
    public static void main(String[] args) throws IOException {
        ServerSocket socket = new ServerSocket(10086);
        Socket s = socket.accept();
        BufferedReader bfr = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String val;

        while ((val = bfr.readLine()) != null) {
            System.out.println(val);
        }
        bfr.close();
        socket.close();
    }
}
