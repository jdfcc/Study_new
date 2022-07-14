package 网络编程.TCP通信.Demo_5;

import java.io.*;
import java.net.Socket;

public class send {
    public static void main(String[] args) throws IOException {
        Socket socket=new Socket("192.168.159.1",10086);
        BufferedReader bfr=new BufferedReader(new FileReader("C:\\Users\\Jdfcc\\IdeaProjects\\Study_new\\src\\网络编程\\TCP通信\\Demo_5\\source.txt"));
        BufferedWriter bfw=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        String val;
        while ((val=bfr.readLine())!=null){
            bfw.write(val);
            bfw.newLine();
            bfw.flush();

            InputStream S=socket.getInputStream();
            byte[] byt=new byte[1024];
            int len=S.read(byt);
            String v=new String(byt,0,len);
            System.out.println(v);
        }

        bfr.close();
        socket.close();

    }
}
