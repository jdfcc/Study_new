package 集合.单列.set;

import java.util.LinkedHashSet;

public class linkedhashset {
    public static void main(String[] args){
        LinkedHashSet<String> lin=new LinkedHashSet<>();
        lin.add("Hello");
        lin.add("World");
        lin.add("Java");
        lin.add("Hello");

        System.out.println(lin);
    }
}
