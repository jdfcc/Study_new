package 进程.生产者消费者模型;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Producer implements Runnable {
    private Box b;

    public Producer(Box box) {
        this.b = box;
    }

    @Override
    public void run() {
        b.putMilk();
    }
}