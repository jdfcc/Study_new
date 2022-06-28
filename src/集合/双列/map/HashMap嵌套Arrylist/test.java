package 集合.双列.map.HashMap嵌套Arrylist;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class test {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> hash=new HashMap<>();
        ArrayList<String> ar1=new ArrayList<>();
        ar1.add("this is ar1");
        ar1.add("this is ar1_1");
        ArrayList<String> ar2=new ArrayList<>();
        ar1.add("this is ar2");
        ar1.add("this is ar2_1");
        ArrayList<String> ar3=new ArrayList<>();
        ar1.add("this is ar3");
        ar1.add("this is ar3_1");

        hash.put("001" ,ar1);
        hash.put("002" ,ar2);
        hash.put("003" ,ar3);

        Set<Map.Entry<String,ArrayList<String>>> se=hash.entrySet();
        for(Map.Entry<String,ArrayList<String>> tem:se){
            System.out.println(tem.getKey());
            for(String s:tem.getValue()){
                System.out.println(s);
            }
        }

    }
}
