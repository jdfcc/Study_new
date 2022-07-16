package Lambda表达式.无参无返回值;

public class test {
    public static void main(String[] args) {
        Eat e = new Eatimi();
        e.eat();
        useEat(e);

        useEat(new Eat() {

            @Override
            public void eat() {
                System.out.println("eat");
            }
        });

        useEat(() -> {
            System.out.println("eat");
        });
    }

    private static void useEat(Eat e) {
        e.eat();
    }
}
