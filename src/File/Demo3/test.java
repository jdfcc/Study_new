package File.Demo3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class test {
    public static void main(String[] args) throws FileNotFoundException {

        File f1=new File("E:\\fileTest");
        String[] arr=f1.list();
        for(String S:arr)
            System.out.println(S);
        System.out.println("______________");

        File[] list=f1.listFiles();
        for(File tem:list){
            System.out.println(tem);
            System.out.println(tem.getName());
        }

//        FileOutputStream s1=new FileOutputStream(f1);
//        System.out.println(s1);

    }
}
