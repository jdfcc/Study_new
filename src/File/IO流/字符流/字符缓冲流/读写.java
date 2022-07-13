package File.IO流.字符流.字符缓冲流;

import java.io.*;

public class 读写 {
    public static void main(String[] args) throws IOException {
        BufferedReader bre=new BufferedReader(new FileReader("E:\\test\\source.txt"));
        BufferedWriter bwr=new BufferedWriter(new FileWriter("E:\\test\\aim.txt"));

        char temp[]=new char[1024];
        int len;
        while ((len=bre.read(temp))!=-1)
            bwr.write(temp,0,len);


    bre.close();
    bwr.close();

    }

}
