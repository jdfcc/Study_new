package 集合.单列.set.treeSet;

import org.jetbrains.annotations.NotNull;

public class student implements Comparable<student> {
    private String name;
    private int age;

    public student(){}
    public student(String name, int age){
        this.name=name;
        this.age=age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    @Override
    public int compareTo( student s) {
        int num;
        num=this.age-s.age;//num=s2.age-s1.age
        return num;
    }
}
