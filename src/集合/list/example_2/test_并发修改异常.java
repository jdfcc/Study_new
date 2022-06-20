package 集合.list.example_2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class test_并发修改异常 {
    public static void main(String[] args) {

        List<String> l = new ArrayList<String>();

        l.add("Hello");
        l.add("World");
        l.add("Java");

        Iterator<String> i=l.iterator();
        int num=0;

        for(int nu=0;nu<l.size();nu++){
            String temp=l.get(nu);
            if(temp.equals("World")){
                l.add("Javaee");
            }

        }

        System.out.println(l);


    }

}
