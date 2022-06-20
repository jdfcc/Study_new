package 链表和队列.Linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class test {
    public static void main(String[] args){

        LinkedList<student> link=new LinkedList<student>();

        student s1=new student("Jack",4);
        student s2=new student("Lucy",3);
        student s3=new student("Kim",3);
        student s4=new student("King",1);

        link.push(s1);
        link.push(s2);
        link.push(s3);

        Iterator<student> li=link.iterator();

//        for(student s:link)
//            System.out.println(s.getName()+" "+s.getAge()+" ");

        for(int i=0;i< link.size();i++){
            student tem;
            tem=link.get(i);
            if(tem==s2)
                link.add(i,s4);
        }

        for(int i=0;i<link.size();i++){
            student s=link.get(i);
            System.out.println(s.getName()+" "+s.getAge()+" ");
        }
    }
}
