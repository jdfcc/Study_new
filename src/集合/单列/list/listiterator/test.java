package 集合.单列.list.listiterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class test {
    public static void main(String[] args){

        List<String> l = new ArrayList<String>();

        l.add("Hello");
        l.add("World");
        l.add("Java");
        ListIterator<String> it=l.listIterator();

//        while (it.hasNext()){
//            System.out.println(it.next());
//        }
//
//        System.out.println("-----------------------");
//
//        while (it.hasPrevious()){
//            System.out.println(it.previous());
//        }

        while (it.hasNext()){
            String s=it.next();
            if(s.equals("World"))
              it.add("Javaee");
        }
        System.out.println(l);


    }
}
