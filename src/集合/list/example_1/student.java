package 集合.list.example_1;

public class student {
    private String name;
    private int age;

    public  student(){}
    public student(String name,int age){
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

}
