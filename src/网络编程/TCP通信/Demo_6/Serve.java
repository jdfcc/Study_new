package 网络编程.TCP通信.Demo_6;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Serve {
    public static void main(String[] args) throws IOException {
        ServerSocket s = new ServerSocket(10086);
        while (true) {
            Socket socket = s.accept();
            new Thread(new receive(socket)).start();
        }
    }
}
