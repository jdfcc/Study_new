package 链表和队列.Arrylist嵌套hashMap;

import java.util.*;

public class test {
    public static void main(String[] args) {

        ArrayList<HashMap<String,String>> Arr=new ArrayList<>();
        HashMap<String,String> hash1=new HashMap<>();
        HashMap<String,String> hash2=new HashMap<>();
        HashMap<String,String> hash3=new HashMap<>();

        hash1.put("key1","val1");
        hash2.put("key2","val2");
        hash1.put("jdfc","suau");
        hash3.put("key3","val3");

        Arr.add(hash1);
        Arr.add(hash2);
        Arr.add(hash3);

        for(HashMap<String, String> arr:Arr){
            Set<Map.Entry<String,String>> set=arr.entrySet();
            for(Map.Entry<String,String> ha:set){
                System.out.println(ha.getKey()+" "+ha.getValue());
            }
        }
    }

}
