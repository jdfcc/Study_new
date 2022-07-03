package File.递归l删除;

import java.io.File;
import java.io.IOException;

public class test {
    public static void main(String[] args) throws IOException {
        File f=new File("E:\\fileTest");
        delete(f);
    }

    public static void delete(File f){
        File[] list=f.listFiles();
        for(File temp:list) {
            if (temp.isFile())
                temp.delete();
            else
                delete(temp);
        }
        f.delete();
    }
}
