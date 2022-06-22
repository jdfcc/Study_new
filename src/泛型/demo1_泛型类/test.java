package 泛型.demo1_泛型类;

public class test {
    public static void main(String[] args){
        T<String> t1=new T<>();
        t1.setS("ds");
        System.out.println(t1.getS());

        System.out.println("______________________");
        T<Integer> t2=new T<>();
        t2.setS(7);
        System.out.println(t2.getS());
    }


}
