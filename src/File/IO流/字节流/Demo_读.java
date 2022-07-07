package File.IO流.字节流;

import java.io.FileInputStream;
import java.io.IOException;

public class Demo_读 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("C:\\Users\\Jdfcc\\IdeaProjects\\Study_new\\src\\File\\test.txt");

        int by;
        while ((by=fis.read())!=-1)
            System.out.print((char)by);


    }
}
