package 集合.Collection;

import java.util.*;

public class test {
    public static void main(String[] args){

        Collection<String> a=new ArrayList<String>();
        a.add("a");
        a.add("hello");
        a.add(("zh"));

        System.out.println(a);
        a.remove("a");
        System.out.println(a);
        System.out.println(a.size());
        System.out.println(a.contains("sdfjkl"));
        System.out.println(a);
        a.clear();
        System.out.println(a);
    }

}

