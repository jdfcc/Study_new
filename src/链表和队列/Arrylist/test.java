package 链表和队列.Arrylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class test {
    public static void main(String[] args){

        ArrayList<student> array=new ArrayList<student>();

        student s1=new student("Jack",4);
        student s2=new student("Lucy",3);
        student s3=new student("Kim",3);

        array.add(s1);
        array.add(s2);
        array.add(s3);

        Iterator<student> it=array.iterator();
        for(student s:array){
            System.out.println(s.getName()+" "+s.getAge());
        }
        System.out.println("------------");

        for(int i=0;i<array.size();i++){
            student s=array.get(i);
            System.out.println(s.getName()+" "+s.getAge());
        }
        System.out.println("-------------");
//nothing
        while (it.hasNext()){
            student s=it.next();
            System.out.println(s.getName()+" "+s.getAge());
        }

    }
}
