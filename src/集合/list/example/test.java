package 集合.list.example;

import 集合.Collection.遍历;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class test {
    public static void main(String[] args){

        student s1=new student("luna",4);
        student s2=new student("cen",3);
        student s3=new student("hud",7);
        student s4=new student("lihua",7);


        List<student> l=new ArrayList<student>();

        l.add(s1);
        l.add(s2);
        l.add(s3);
        l.add(1,s4);

        Iterator<student> i=l.iterator();

//        while(i.hasNext()){
//            student a=i.next();
//            out(a);
//        }

        for(int j=0;j<l.size();j++){
            student z=i.next();
            out(z);
        }

    }

    public static void out(student s){
        System.out.println(s.getName()+" "+s.getAge());
    }
}
