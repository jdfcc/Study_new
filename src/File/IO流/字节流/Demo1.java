package File.IO流.字节流;

import java.io.FileOutputStream;
import java.io.IOException;

public class Demo1 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fou=new FileOutputStream("C:\\Users\\Jdfcc\\IdeaProjects\\Study_new\\src\\File\\test.txt");
//        fou.write(99);
        byte[] bte={97,98,99,100};
        byte [] b1="this is a test".getBytes();

//        fou.write(b1);
        fou.write(b1,1,6);
//        在字节数组里面从指定位置写入多少个在fou里面
        fou.close();
    }
}
