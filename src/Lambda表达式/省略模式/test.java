package Lambda表达式.省略模式;

public class test {
    public static void main(String[] args) {

        useFly(s->System.out.println(s+".."));
//        Runnable r=()-> System.out.println("s");
//        new Thread(r).start();

        new Thread(()-> System.out.println("s")).start();

    }
    private static void useFly(Fly f){
        f.fly("test");
    }
}
