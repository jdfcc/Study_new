package File.IO流.序列化流;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class 反序列化 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream=new ObjectInputStream(new FileInputStream("C:\\Users\\Jdfcc\\IdeaProjects\\Study_new\\src\\File\\test.txt"));
        Object obj=objectInputStream.readObject();
        student s=(student) obj;
        System.out.println(s.getName()+s.getAge());
        objectInputStream.close();
    }

}
