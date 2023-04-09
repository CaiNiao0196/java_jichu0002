package test;

public class test019_thread extends Thread{
    //重写thread方法，使用start调用
    @Override
    public void run() {
        System.out.println(getName()+"001");
    }
}
