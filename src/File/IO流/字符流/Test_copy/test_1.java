package File.IO流.字符流.Test_copy;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class test_1 {
    public static void main(String[] args) throws IOException {
        ArrayList<String> arrayList=new ArrayList<>();
        BufferedWriter bfw=new BufferedWriter(new FileWriter("C:\\Users\\Jdfcc\\IdeaProjects\\Study_new\\src\\File\\test.txt"));

        arrayList.add("中国");
        arrayList.add("China");
        arrayList.add("****");

        for(String s:arrayList) {
            bfw.write(s);
            bfw.newLine();
            bfw.flush();
        }
        bfw.close();
    }
}
