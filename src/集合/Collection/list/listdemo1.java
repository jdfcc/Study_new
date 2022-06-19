package 集合.Collection.list;

import java.util.ArrayList;
import java.util.List;

//有序，可重复
public class listdemo1 {

    public static void main(String args[]){
        List<String> l=new ArrayList<String>();

        l.add("hello");
        l.add("world");
        l.add("hello");

        System.out.println(l);
    }
}
