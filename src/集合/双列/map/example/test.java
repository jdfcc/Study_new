package 集合.双列.map.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class test {
    public static void main(String[] args) {

        student s1=new student("Lucy",100);
        student s2=new student("Jack",66);
        student s3=new student("John",78);

        Map<String,Integer> map=new HashMap<>();

        map.put(s1.getName(),s1.getScore());
        map.put(s2.getName(),s2.getScore());
        map.put(s3.getName(),s3.getScore());

        System.out.println("Way1:------------------");
        Set<Map.Entry<String,Integer>> se=map.entrySet();

        for(Map.Entry<String,Integer> t:se){
            String key=t.getKey();
            Integer val=t.getValue();
            System.out.println(key+" "+val);
        }
        System.out.println("Way2:-------------------");
        Set<String> key=map.keySet();
        for(String s:key){
            System.out.println(s+" "+map.get(s));
        }
    }
}
