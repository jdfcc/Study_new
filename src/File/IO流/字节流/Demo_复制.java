package File.IO流.字节流;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;


public class Demo_复制 {
    public static void main(String[] args) throws IOException {
        FileOutputStream ous=new FileOutputStream("E:\\test\\aim.txt");
        FileInputStream ins=new FileInputStream("E:\\test\\source.txt.txt");

        ArrayList<Integer> lis=new ArrayList<>();
        int temp;
        while ((temp= ins.read())!=-1)
            lis.add(temp);

        for(int tem:lis){
            ous.write(tem);
        }
        ous.close();
        ins.close();

    }
}
