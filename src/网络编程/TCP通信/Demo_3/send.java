package 网络编程.TCP通信.Demo_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

public class send {
    public static void main(String[] args) throws IOException {
        Socket socket=new Socket("192.168.159.1",10086);
        BufferedReader bfr=new BufferedReader(new InputStreamReader(System.in));

        String val;
        while ((val=bfr.readLine())!=null){
            OutputStream ous=socket.getOutputStream();
            ous.write(val.getBytes());
        }


        socket.close();

    }
}
