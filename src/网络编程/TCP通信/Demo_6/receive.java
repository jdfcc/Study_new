package 网络编程.TCP通信.Demo_6;

import java.io.*;
import java.net.Socket;

public class receive extends Thread{
    private Socket s;
    public receive(Socket socket) throws IOException {
        this.s=socket;
    }

    @Override
    public void run() {
        try {
            BufferedReader bfr=new BufferedReader(new InputStreamReader(s.getInputStream()));
            BufferedWriter bfw=new BufferedWriter(new FileWriter("C:\\Users\\Jdfcc\\IdeaProjects\\Study_new\\src\\网络编程\\TCP通信\\Demo_6\\aim.txt",true));
            String val;
            while ((val=bfr.readLine())!=null){
                bfw.write(val);
                bfw.newLine();
                bfw.flush();
            }

            BufferedWriter writer=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
            writer.write("Received");
            writer.newLine();
            writer.flush();
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
