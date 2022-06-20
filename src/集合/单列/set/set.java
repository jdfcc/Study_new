package 集合.单列.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class set {
    public static void main(String[] args){
        Set<String> se=new HashSet<String>();
        se.add("hello");
        se.add("World");
        se.add("Java");

        for(String s:se){
            System.out.println(s);
        }

        System.out.println("-----------");
        Iterator<String> it=se.iterator();
        while (it.hasNext()){
            String s=it.next();
            System.out.println(s);
        }

    }
}
