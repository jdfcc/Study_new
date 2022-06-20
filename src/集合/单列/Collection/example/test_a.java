package 集合.单列.Collection.example;

import java.util.*;
public class test_a {
    public static void main(String[] args){
        Collection<student> a=new ArrayList<student>();
        student s1=new student("MM",4);
        student s2=new student("Martin",4);
        student s3=new student("lyly",4);

        a.add(s1);
        a.add(s2);
        a.add(s3);

        Iterator it=a.iterator();
        while (it.hasNext()){
            student h= (student) it.next();
            System.out.println(h.getName()+" "+h.getAge());
        }
    }
}
