package 进程.线程调度.抢占调度模型;

public class test_Daemon {
    public static void main(String[] args) {

        thread_Daemon t2=new thread_Daemon();
        thread_Daemon t3=new thread_Daemon();

        t2.setName("Cau");
        t3.setName("Rul");
        Thread.currentThread().setName("Ben");

        t2.setDaemon(true);
        t3.setDaemon(true);

        t2.start();
        t3.start();
        for(int i=0;i<9;i++)
        System.out.println(Thread.currentThread().getName()+i);


    }
}
