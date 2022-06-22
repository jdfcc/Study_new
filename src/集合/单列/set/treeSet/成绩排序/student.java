package 集合.单列.set.treeSet.成绩排序;

import org.jetbrains.annotations.NotNull;

public class student implements Comparable<student>{
    private String name;
    private int Ch;
    private int Math;

    public student(){}
    public student(String na,int ch,int ma){
        this.name=na;
        this.Ch=ch;
        this.Math=ma;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCh() {
        return Ch;
    }

    public void setCh(int ch) {
        Ch = ch;
    }

    public int getMath() {
        return Math;
    }

    public void setMath(int math) {
        Math = math;
    }

    @Override
    public int compareTo(@NotNull student o) {
        int num;
        num=this.Math+this.Ch-o.Math-o.Ch;
        num=num*-1;
        if(num==0)
            num=this.name.compareTo(o.name);
        return num;
    }
}
