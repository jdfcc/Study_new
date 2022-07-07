package File.IO流.字节流;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo_复制plus {
    public static void main(String[] args) throws IOException {
        FileInputStream ins=new FileInputStream("E:\\test\\source.txt");
        FileOutputStream ous=new FileOutputStream("E:\\test\\aim.txt");
        byte[] byt=new byte[1024];
        int temp;

        if((temp=ins.read(byt))!=-1)
           ous.write(byt,0,temp);

        ins.close();
        ous.close();
    }
}
