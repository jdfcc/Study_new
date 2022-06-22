package map.example_plus;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class test {
    public static void main(String[] args) {
        Map<student,String> map=new HashMap<>();

        student s1=new student("NewYork");
        student s2=new student("BeiJin");
        student s3=new student("Tokyo");
        student s4=new student("NewYork");

        map.put(s1,s1.getAddress());
        map.put(s2,s2.getAddress());
        map.put(s3,s3.getAddress());
        map.put(s4,s4.getAddress());
        System.out.println(map);

        Set<student> se=map.keySet();
        for(student tem:se){
            System.out.println(tem.getAddress());
        }
    }
}
