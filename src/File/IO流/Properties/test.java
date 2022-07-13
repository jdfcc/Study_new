package File.IO流.Properties;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class test {
    public static void main(String[] args) throws IOException {
        Properties pro=new Properties();
        FileReader fre=new FileReader("C:\\Users\\Jdfcc\\IdeaProjects\\Study_new\\src\\File\\test.txt");
        game ga=new game();

        pro.load(fre);
        fre.close();
        System.out.println(pro);

    }
}
