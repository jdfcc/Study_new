package 进程.线程同步.同步方法;

public class sell implements Runnable {
    private int ticket = 100;
    private Object obj=new Object();
    public synchronized void sellTicket(){
        boolean flag = true;
        while (flag) {
            synchronized (this) {

                if (ticket > 0) {
                    System.out.println(Thread.currentThread().getName() + "are selling " + ":" + ticket);
                    ticket--;
                }

                if (ticket <= 0)
                    flag = false;
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }

    @Override
    public void run() {
        sellTicket();
    }
}
