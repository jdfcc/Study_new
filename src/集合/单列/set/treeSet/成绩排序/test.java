package 集合.单列.set.treeSet.成绩排序;

import java.util.TreeSet;

public class test {
    public static void main(String[] args){
        TreeSet<student> tre=new TreeSet<>();

        student s1=new student("Cy",24,35);
        student s2=new student("Ja",24,35);
        student s3=new student("Cle",76,88);
        student s4=new student("Jem",62,72);
        student s5=new student("Jem",62,72);

        tre.add(s1);
        tre.add(s2);
        tre.add(s3);
        tre.add(s4);
        tre.add(s5);

        for(student s:tre){
            System.out.println(s.getName()+" "+s.getCh()+" "+s.getMath());
        }
    }
}
