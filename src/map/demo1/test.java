package map.demo1;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class test {
    public static void main(String[] args) {
        Map<String,String> ma=new HashMap<>();
        ma.put("2030311","Jdfcc");
        ma.put("894679","John");
        ma.put("234879","CEy");
        ma.put("32434","Jdfcc");

//        System.out.println(ma.remove("2030311"));
        System.out.println(ma);
        System.out.println("-----------");
        System.out.println(ma.get("2030311"));
        System.out.println("-------------");
        //获取所有key的集合
        Set<String> se=ma.keySet();
        for(String s:se)
            System.out.println(s);
        System.out.println("----------------");
        //获取值的集合
        Collection<String> co=ma.values();
        for(String s:co)
            System.out.println(s);

    }
}
