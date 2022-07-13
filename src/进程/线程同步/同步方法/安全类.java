package 进程.线程同步.同步方法;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Vector;

public class 安全类 {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer();
        Hashtable<String,String> ha=new Hashtable<>();
        Vector<String> vec=new Vector<>();
        ha.put("fsh","dis");
        vec.add("sd");
        System.out.println(sb.append(" a").append("+").append("888"));
        System.out.println(ha);
        System.out.println(vec);
    }
}
