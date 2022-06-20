package 集合.list.example_2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class test {
    public static void main(String[] args) {

        List<String> l = new ArrayList<String>();

        l.add("Hello");
        l.add("World");
        l.add("Java");

        Iterator<String> i=l.iterator();
        int num=0;

        while(i.hasNext()){
            num++;
            String temp=i.next();
            if(temp.equals("World")){
                l.add(num,"Javaee");
            }

        }



    }

}
