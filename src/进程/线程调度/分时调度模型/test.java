package 进程.线程调度.分时调度模型;

public class test {
    public static void main(String[] args) {
        myThread t1=new myThread();
        myThread t2=new myThread();
        myThread t3=new myThread();

        t1.setName("subway");
        t2.setName("plane");
        t3.setName("car");

        t1.setPriority(5);
        t2.setPriority(10);
        t3.setPriority(1);

        t1.start();
        t2.start();
        t3.start();
    }
}
