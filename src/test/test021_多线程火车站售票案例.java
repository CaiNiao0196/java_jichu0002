package test;

public class test021_多线程火车站售票案例 {
    public static void main(String[] args) {
        //创建线程对象
        test021_多线程火车站售票 test = new test021_多线程火车站售票();

        Thread t = new Thread(test);
        t.setName("窗口1");
        Thread t2 = new Thread(test);
        t2.setName("窗口2");
        t.start();
        t2.start();
    }

}
