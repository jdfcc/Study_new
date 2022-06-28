package 集合.双列.map.demo2_遍历;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class test_02 {
    public static void main(String[] args) {

        Map<String,String> ma=new HashMap<>();
        ma.put("2030311","Jdfcc");
        ma.put("894679","John");
        ma.put("234879","CEy");
        ma.put("32434","Jdfcc");

        Set<Map.Entry<String,String>> entry=ma.entrySet();
        for(Map.Entry<String,String> t:entry){
            String key=t.getKey();
            String val=t.getValue();
            System.out.println(key+" "+val);
        }

    }
}
