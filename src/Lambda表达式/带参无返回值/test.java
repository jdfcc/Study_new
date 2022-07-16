package Lambda表达式.带参无返回值;

public class test {
    public static void main(String[] args) {

        useFly(new Fly() {
            @Override
            public void fly(String s) {
                System.out.println(s);
            }
        });

        useFly((String s)->{
            System.out.println(s+"..");
        });

    }

    private static void useFly(Fly f){
        f.fly("test");
    }
}
