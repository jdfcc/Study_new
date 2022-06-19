package 集合.list;

import java.util.ArrayList;
import java.util.List;

public class Listdemo2 {
    public static void main(String[] args){

        List<String> l=new ArrayList<String>();

        l.add("hello");
        l.add("world");
        l.add("hello");

        System.out.println(l);
        l.add(1,"ak");//不能越界
        System.out.println(l);
        l.remove(0);
        System.out.println(l);


    }
}
