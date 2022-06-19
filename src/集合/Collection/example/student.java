package 集合.Collection.example;

public class student{
    private String name;
    private int age;

    public student(){};
    public student(String name,int age){
        this.name=name;
        this.age=age;
    }

    public void setname(String S){
        this.name=S;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}