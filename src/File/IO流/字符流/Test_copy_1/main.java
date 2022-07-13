package File.IO流.字符流.Test_copy_1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) throws IOException {
        ArrayList<student> arrayList = new ArrayList<>();
        BufferedWriter bfw = new BufferedWriter(new FileWriter("C:\\Users\\Jdfcc\\IdeaProjects\\Study_new\\src\\File\\test.txt"));

        student s1 = new student("张三", 4);
        student s2 = new student("李四", 7);
        student s3 = new student("王五", 9);

        arrayList.add(s1);
        arrayList.add(s2);
        arrayList.add(s3);

        for (student s : arrayList) {
            StringBuilder sb=new StringBuilder();
            sb.append(s.getName()+","+s.getAge());
            bfw.write(String.valueOf(sb));
            bfw.newLine();
            bfw.flush();
        }
        bfw.close();
    }
}
