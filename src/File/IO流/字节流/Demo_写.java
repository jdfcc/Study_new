package File.IO流.字节流;

import java.io.FileOutputStream;
import java.io.IOException;

public class Demo_写 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fou=new FileOutputStream("C:\\Users\\Jdfcc\\IdeaProjects\\Study_new\\src\\File\\test.txt"/* ,true */);//为true则追加写入
//        fou.write(99);
        byte[] bte={97,98,99,100};
        byte [] b1="this is a test".getBytes();

//        fou.write("\n".getBytes());
        fou.write(bte);

//        fou.write(b1,1,6);
//        在字节数组里面从指定位置写入多少个在fou里 面
        fou.close();

    }
}
