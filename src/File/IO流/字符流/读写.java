package File.IO流.字符流;

import java.io.*;

public class 读写 {
    public static void main(String[] args) throws IOException {
        FileWriter fwr= new FileWriter("E:\\test\\aim.txt");
//        osw.write("哈哈哈");

        FileReader fre=new FileReader("E:\\test\\source.txt");
//        int temp;
//        while ((temp=isr.read())!=-1)
//            osw.write(temp);

        int len;
        char[] byt=new char[1024];
        while ((len= fre.read(byt))!=-1){
            fwr.write(byt,0 ,len);

        }

        fwr.close();
        fre.close();


    }
}
