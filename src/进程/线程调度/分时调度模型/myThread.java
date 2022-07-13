package 进程.线程调度.分时调度模型;

public class myThread extends Thread {
    @Override
    public void run() {
        System.out.println(getName());
    }
}
