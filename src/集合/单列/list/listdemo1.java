package 集合.单列.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//有序，可重复
//可对指定位置元素修改

public class listdemo1 {

    public static void main(String args[]){
        List<String> l=new ArrayList<String>();

        l.add("hello");
        l.add("world");
        l.add("hello");

        Iterator<String> l1=l.iterator();
        while(l1.hasNext()){
            String s=l1.next();
            System.out.println(s);
        }

    }
}
