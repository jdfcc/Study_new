package 泛型.demo2_泛型方法;

//泛型类
//public class T<S> {
//    public void show(T t){
//        System.out.println(t);
//    }
//}

//泛型方法

public class T<S>{
    public <S> void show(S s){
        System.out.println(s);
    }
}