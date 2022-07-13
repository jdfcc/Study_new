package File.IO流.字符流.字符缓冲流;

import java.io.*;

public class Demo {
    public static void main(String[] args) throws IOException {
        BufferedReader bfr=new BufferedReader(new FileReader("C:\\Users\\Jdfcc\\IdeaProjects\\Study_new\\src\\File\\test.txt"));
//        BufferedWriter bfw=new BufferedWriter(new FileWriter("C:\\Users\\Jdfcc\\IdeaProjects\\Study_new\\src\\File\\test.txt"));

//        for(int i=0;i<10;i++){
//            bfw.write("hello"+i);
//            bfw.write("\n\r");
//            bfw.newLine();
//        }
        String val=bfr.readLine();
        System.out.println(val);

        bfr.close();
//        bfw.close();
    }
}
