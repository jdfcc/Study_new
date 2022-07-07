package File.IO流.字节缓冲流;

import java.io.*;

public class Demo_Copy {
    public static void main(String[] args) throws IOException {
        BufferedOutputStream bou=new BufferedOutputStream(new FileOutputStream("E:\\test\\aim.mp4"));
        BufferedInputStream bin=new BufferedInputStream(new FileInputStream("E:\\test\\source.mp4"));

//        int temp;
//        while ((temp=bin.read())!=-1){
//            bou.write(temp);
//        }

        byte[] byt=new byte[1024];
        int length;
        while ((length=bin.read(byt))!=-1){
            bou.write(byt,0,length);
        }

        bou.close();
        bin.close();
    }
}
