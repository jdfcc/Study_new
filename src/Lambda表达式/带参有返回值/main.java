package Lambda表达式.带参有返回值;

public class main {
    public static void main(String[] args) {
        useAdd(new Add() {
            @Override
            public int add(int x, int y) {
                int e = x + y;
                System.out.println(e);
                return e;
            }
        });


        useAdd((int x, int y) -> {
            System.out.println(x + y);
            return x + y;
        });

    }

    private static void useAdd(Add e) {
        System.out.println(e.add(3, 2));
    }
}
