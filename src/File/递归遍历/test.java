package File.递归遍历;

import java.io.File;

public class test {
    public static void main(String[] args) {
        File f=new File("E:\\fileTest");
        read(f);

    }

    public static void read(File f){
        File[] list=f.listFiles();

        for(File temp:list){
            if(temp.isDirectory())
                read(temp);
            else
                System.out.println(temp.getAbsoluteFile());
        }

    }
}
