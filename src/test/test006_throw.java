package test;
/*
练习自定义异常
 */
public class test006_throw {
    public static void main(String[] args){
        try {
            getFraction(1001);
        } catch (Exception e) {
            //throw new RuntimeException(e);
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            e.printStackTrace();
        }
    }
    public static void getFraction(double fraction) throws Exception {
        if(fraction<0 || fraction>100){
            //Exception（编译时期异常）需要抛出异常，而RunTimeException（运行时期异常）不需要
            throw new Exception("就想弄个异常");
        }
        System.out.println("没有异常哦");
    }
}
