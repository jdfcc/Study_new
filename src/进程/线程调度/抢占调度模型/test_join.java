package 进程.线程调度.抢占调度模型;

public class test_join {
    public static void main(String[] args) throws InterruptedException {
        thread_join t1=new thread_join();
        thread_join t2=new thread_join();
        thread_join t3=new thread_join();

        t1.setName("Ben");
        t2.setName("Jec");
        t3.setName("Bou");

        t1.start();
        t1.join();
        t2.start();
        t3.start();
    }
}
