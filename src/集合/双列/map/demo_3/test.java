package 集合.双列.map.demo_3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class test {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String val=input.next();

        HashMap<Character, Integer> hashMap=new HashMap<>();
        for(int i=0;i<val.length();i++){
            char tem=val.charAt(i);
            if(hashMap.get(tem)==null)
                hashMap.put(tem,1);
            else {
                int va;
                va=hashMap.get(tem);
                va++;
                hashMap.put(tem,va);
            }
        }
        Set<Map.Entry<Character, Integer>> se=hashMap.entrySet();
        for(Map.Entry<Character,Integer> map:se){
            System.out.println(map.getKey()+" "+map.getValue());
        }


    }
}
