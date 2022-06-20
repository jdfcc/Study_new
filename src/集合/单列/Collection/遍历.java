package 集合.单列.Collection;
import java.util.*;

public class 遍历 {
    public static void main(String[] args){
        Collection<String> s=new ArrayList<String>();
        s.add("a");
        s.add("b");
        s.add("c");
        Iterator<String> it=s.iterator();
        while (it.hasNext()){
           System.out.println(it.next());
           }

      //  System.out.println(s.iterator().next());
    }
}
