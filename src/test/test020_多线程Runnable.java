package test;

public class test020_多线程Runnable {
    public static void main(String[] args) {
        //多线程实现方式2：通过实现Runnable接口，使用Thread调用run方法
        test020_Runnable run = new test020_Runnable();
        Thread t= new Thread(run);
        t.start();
    }
}
