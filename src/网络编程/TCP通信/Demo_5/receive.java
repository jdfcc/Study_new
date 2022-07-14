package 网络编程.TCP通信.Demo_5;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class receive {
    public static void main(String[] args) throws IOException {
        ServerSocket socket = new ServerSocket(10086);
        Socket s = socket.accept();
        BufferedReader bfr=new BufferedReader(new InputStreamReader(s.getInputStream()));
        BufferedWriter bfw = new BufferedWriter(new FileWriter("C:\\Users\\Jdfcc\\IdeaProjects\\Study_new\\src\\网络编程\\TCP通信\\Demo_5\\aim.txt"));
        String val;

        while ((val=bfr.readLine())!=null) {

            bfw.write(val);
            bfw.newLine();
            bfw.flush();

            OutputStream ous=s.getOutputStream();
            ous.write("Received".getBytes());
        }



    }
}
