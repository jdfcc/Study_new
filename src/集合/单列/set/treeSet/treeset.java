package 集合.单列.set.treeSet;

import java.util.TreeSet;

public class treeset {
    public static void main(String[] args){
        student s1=new student("Jack",24);
        student s2=new student("Jay",27);
        student s3=new student("John",21);

        TreeSet<student> tre=new TreeSet<>();
        tre.add(s1);
        tre.add(s2);
        tre.add(s3);

        for(student s:tre){
            System.out.println(s.getName()+" "+s.getAge());
        }
    }

}
