package 集合.单列.set.example;

import java.util.HashSet;
import java.util.Iterator;

public class test {
    public static void main(String[] args){
        HashSet<student> has=new HashSet<>();
        student s1=new student("luna",4);
        student s2=new student("cen",3);
        student s3=new student("hud",7);
        student s4=new student("luna",4);

        has.add(s1);
        has.add(s2);
        has.add(s3);
        has.add(s4);

        Iterator<student> it=has.iterator();
        for(student s:has){
            System.out.println(s.getName()+""+s.getAge());
        }
    }

}
