package File.IO流.字符流;

import java.io.FileInputStream;
import java.io.IOException;

public class Demo1 {
    public static void main(String[] args) throws IOException {
        FileInputStream fin=new FileInputStream("C:\\Users\\Jdfcc\\IdeaProjects\\Study_new\\src\\File\\test.txt");
        int temp;
        while ((temp=fin.read())!=-1)
            System.out.print((char)temp);
    }
}
