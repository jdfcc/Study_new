package 集合.双列.map.demo2_遍历;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class test_01 {
    public static void main(String[] args) {
        Map<String,String> ma=new HashMap<>();
        ma.put("2030311","Jdfcc");
        ma.put("894679","John");
        ma.put("234879","CEy");
        ma.put("32434","Jdfcc");

        Set<String> tre=ma.keySet();
        for(String s:tre){
            System.out.println(s+" "+ma.get(s));
        }

    }
}
