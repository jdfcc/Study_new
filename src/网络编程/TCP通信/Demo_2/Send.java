package 网络编程.TCP通信.Demo_2;

import java.io.*;
import java.net.Socket;

public class Send {
    public static void main(String[] args) throws IOException {

        Socket socket=new Socket("192.168.159.1",10086);
        BufferedReader bfr=new BufferedReader(new InputStreamReader(System.in));
        String val;
        while ((val=bfr.readLine())!=null){
            if("886".equals(val))
                break;
            OutputStream ous=socket.getOutputStream();
            ous.write(val.getBytes());
        }
        socket.close();
    }
}
