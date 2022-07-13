package File.IO流.字符流.Test_copy_2;

import org.jetbrains.annotations.NotNull;

public class student implements Comparable<student>{
   String name;
   int score;

   public student(){}
    public student(String na,int sc){
       this.name=na;
       this.score=sc;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public int compareTo(@NotNull student o) {
        int num;
        num=o.score-this.score;
        if(num==0)
            num=this.name.compareTo(o.name);
        return num;
    }
}
