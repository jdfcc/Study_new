package 进程.生产者消费者模型;

public class User implements Runnable{
    private Box b;
    public User(Box box) {
        this.b=box;
    }

    @Override
    public void run() {
        b.getMilk();
    }
}
