package 网络编程.TCP通信.Demo_6;


import java.io.*;
import java.net.Socket;

public class send  {
    public static void main(String[] args) throws IOException {
        Socket socket=new Socket("192.168.159.1",10086);
        BufferedReader bfr=new BufferedReader(new FileReader("C:\\Users\\Jdfcc\\IdeaProjects\\Study_new\\src\\网络编程\\TCP通信\\Demo_6\\source.txt"));
        BufferedWriter bfw=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        String val;
        while ((val=bfr.readLine())!=null){
            bfw.write(val);
            bfw.newLine();
            bfw.flush();
        }

        socket.shutdownOutput();
        BufferedReader reader=new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String v=reader.readLine();
        System.out.println(v);

        reader.close();
        bfr.close();
        socket.close();
    }

}

