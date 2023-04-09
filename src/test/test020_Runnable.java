package test;

public class test020_Runnable implements Runnable {

    @Override
    public void run() {
        //通过Thread获取线程名称
        System.out.println(Thread.currentThread().getName()+"001");
    }
}
