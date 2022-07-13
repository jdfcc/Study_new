package 进程.线程同步.卖票;

public class test {
    public static void main(String[] args) {
        sell s=new sell();
        Thread t1=new Thread(s,"windows1");
        Thread t2=new Thread(s,"windows2");
        Thread t3=new Thread(s,"windows3");

        t1.start();
        t2.start();
        t3.start();
    }
}
