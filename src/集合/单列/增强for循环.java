package 集合.单列;

import java.util.ArrayList;
import java.util.List;

public class 增强for循环 {
    public static void main(String[] args){
        int ar[]={1,2,3,4,5,9,0};
        for(int i:ar)
            System.out.println(i);
        System.out.println("_______________");

        String str[]={"Hello","World","Java"};
        for(String s:str)
            System.out.println(s);
        System.out.println("----------------");

        List<String> li=new ArrayList<String>();
        li.add("Hello");
        li.add("World");
        li.add("Java");
        for(String s1:li){
            System.out.println(s1);

        }

    }
}
