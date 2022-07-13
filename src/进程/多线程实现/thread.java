package 进程.多线程实现;

public class thread extends Thread{
    public void run(){
        for(int i=0;i<99;i++)
            System.out.println(getName()+" "+i);
    }
}
