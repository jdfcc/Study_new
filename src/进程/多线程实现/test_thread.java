package 进程.多线程实现;

public class test_thread {
    public static void main(String[] args) {
        thread t1=new thread();
        thread t2=new thread();
//        t1.run();
//        t2.run();
        t1.setName("t1");
        t2.setName("t2");

        t1.start();
        t2.start();
    }
}
