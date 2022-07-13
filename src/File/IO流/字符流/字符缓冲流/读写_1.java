package File.IO流.字符流.字符缓冲流;

import java.io.*;

public class 读写_1 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bfw=new BufferedWriter(new FileWriter("E:\\test\\aim.txt"));
        BufferedReader bfr=new BufferedReader(new FileReader("E:\\test\\source.txt"));

        String temp;
        while ((temp=bfr.readLine())!=null){
            bfw.write(temp);
            bfw.newLine();
        }

        bfw.close();
        bfr.close();

    }
}
