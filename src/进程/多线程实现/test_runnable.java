package 进程.多线程实现;

public class test_runnable {
    public static void main(String[] args) {
        runnable r1=new runnable();
        Thread t1=new Thread(r1,"a");
        Thread t2=new Thread(r1,"b");

        t1.start();
        t2.start();
    }
}
