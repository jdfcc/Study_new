package File.IO流.字节流.字节缓冲流;

import java.io.*;

public class Demo1 {
    public static void main(String[] args) throws IOException {

        BufferedInputStream bin=new BufferedInputStream(new FileInputStream("E:\\test\\source.txt"));
//        FileInputStream ins= new FileInputStream("E:\\test\\source.txt");
//        BufferedInputStream bou=new BufferedInputStream(ins);
        int temp;
        while ((temp=bin.read())!=-1){
            System.out.print((char) temp);
        }

        BufferedOutputStream bou= new BufferedOutputStream(new FileOutputStream("C:\\Users\\Jdfcc\\IdeaProjects\\Study_new\\src\\File\\test.txt"));
        bou.write("hello".getBytes());
        bou.close();


    }
}
