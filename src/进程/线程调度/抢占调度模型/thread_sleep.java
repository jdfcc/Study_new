package 进程.线程调度.抢占调度模型;

public class thread_sleep extends Thread{
    @Override
    public void run() {
        for(int i=0;i<99;i++) {
            System.out.println(getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
