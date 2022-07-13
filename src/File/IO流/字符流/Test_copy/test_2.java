package File.IO流.字符流.Test_copy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class test_2 {
    public static void main(String[] args) throws IOException {
        ArrayList<String> arrayList=new ArrayList<>();
        BufferedReader bfr=new BufferedReader(new FileReader("C:\\Users\\Jdfcc\\IdeaProjects\\Study_new\\src\\File\\test.txt"));

        String s;
        while ((s=bfr.readLine())!=null)
            arrayList.add(s);

        bfr.close();
        System.out.println(arrayList);
    }
}
