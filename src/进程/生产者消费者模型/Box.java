package 进程.生产者消费者模型;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Box {
    private int milk = 0;
    boolean flag = true;
    private Lock lock = new ReentrantLock();

    public synchronized void getMilk() {

        while (true) {
            try {
                if (!flag)
                    wait();
                lock.lock();
                System.out.println("the bottle's number has been decreased,it still have" + milk);
                milk--;
                flag=false;
                notify();

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } finally {
                lock.unlock();
            }

        }
    }

    public synchronized void putMilk() {
        while (true) {
            try {
                lock.lock();
                try {
                    if (flag)
                        wait();
                    System.out.println("the bottle's number has been increased,it still have" + milk);
                    this.milk++;
                    flag = true;
                    notify();

                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                } finally {
                    lock.unlock();
                }

            } catch (RuntimeException e) {
                throw new RuntimeException(e);
            }
        }
    }
}