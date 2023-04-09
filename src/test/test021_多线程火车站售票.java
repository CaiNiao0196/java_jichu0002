package test;

public class test021_多线程火车站售票 implements Runnable {
    int ticket = 100;
    Object obj = new Object();
    public void run(){
        while (true){
            //方式1：使用锁对象同步代码块（即一个线程进去后，其它线程无法进去，安全性高，效率低）
            //方式2：将需要使用锁对象的代码块封装为方法，然后使用synchronized修饰（若为静态方法锁对象为当前类的字节码对象，非静态为this）
            synchronized (obj) {
                if (ticket > 0) {
                    //线程睡一会(会溢出)
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "-" + ticket--);
                }
            }
        }
    }

}
