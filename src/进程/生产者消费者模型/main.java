package 进程.生产者消费者模型;

public class main {
    public static void main(String[] args) {
        Box b=new Box();
        Producer p=new Producer(b);
        User u=new User(b);

        Thread t1=new Thread(p,"producer");
        Thread t2=new Thread(u,"user");

        t1.start();
        t2.start();

    }
}

// TODO:跑不起来，卡死。有空改掉
