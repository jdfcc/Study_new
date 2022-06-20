package 集合.单列.eg;

import 集合.单列.Collection.example.student;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

public class test {
    public static void main(String[] args){

        List<student> a=new ArrayList<student>();
        student s1=new student("MM",4);
        student s2=new student("Martin",4);
        student s3=new student("lyly",4);

        a.add(s1);
        a.add(s2);
        a.add(s3);

        ListIterator<student> ls=a.listIterator();
        System.out.println("Way 1---the for:");
        student tem;
        for(int i=0;i<a.size();i++){
            tem=a.get(i);
            System.out.println(tem.getName()+" "+tem.getAge());
        }

        System.out.println("Way 2---the while:");
        while (ls.hasNext()) {
            tem = ls.next();
            System.out.println(tem.getName()+" "+tem.getAge());
        }

        System.out.println("Way 3---the superFor");
        for(student temp:a)
            System.out.println(temp.getName()+" "+temp.getAge());

    }
}
