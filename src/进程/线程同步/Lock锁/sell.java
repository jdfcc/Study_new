package 进程.线程同步.Lock锁;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class sell implements Runnable {
    private int ticket = 100;
    private Lock lk=new ReentrantLock();
    @Override
    public void run() {
        boolean flag = true;
        while (flag) {
            try {
                lk.lock();
                if (ticket > 0) {
                    System.out.println(Thread.currentThread().getName() + "are selling " + ":" + ticket);
                    ticket--;
                }

                if (ticket <= 0) flag = false;

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            } finally {
                lk.unlock();
            }
        }
    }
}

