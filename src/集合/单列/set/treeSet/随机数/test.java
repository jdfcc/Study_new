package 集合.单列.set.treeSet.随机数;

import java.math.*;
import java.util.*;

public class test {
    public static void main(String[] args){
        Random r=new Random();
        Set<Integer> tre=new HashSet<>();
//                (new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                int num,num1;
//                num=o2-o1;
//                return num;
//            }
//        });

        while(tre.size()<10) {
            int a = r.nextInt(20);
            tre.add(a);
        }

        for(int i:tre){
        System.out.println(i);
        }

    }
}
