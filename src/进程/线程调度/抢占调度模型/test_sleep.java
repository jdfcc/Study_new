package 进程.线程调度.抢占调度模型;

public class test_sleep {
    public static void main(String[] args) {
        thread_sleep t1=new thread_sleep();
        thread_sleep t2=new thread_sleep();
        thread_sleep t3=new thread_sleep();

        t1.setName("Lucy");
        t2.setName("Jdf");
        t3.setName("Cuo");

        t1.start();
        t2.start();
        t3.start();
    }
}
