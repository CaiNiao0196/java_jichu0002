package test;

public class test019_多线程 {
    //多线程实现方式1：通过继承Thread类调用run方法
    //主方法时单线程的
    public static void main(String[] args) {
        test019_thread t = new test019_thread();
        t.setName("xia");   //修改线程名称
        t.start();
    }
}
