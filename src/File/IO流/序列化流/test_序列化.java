package File.IO流.序列化流;

import java.io.*;

public class test_序列化 {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(new FileOutputStream("C:\\Users\\Jdfcc\\IdeaProjects\\Study_new\\src\\File\\test.txt"));
        student s1=new student("张三",20);
        objectOutputStream.writeObject(s1);

        objectOutputStream.close();


    }
}
