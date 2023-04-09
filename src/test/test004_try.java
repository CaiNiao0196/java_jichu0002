package test;
/*
练习异常
 */
public class test004_try {
    public static void main(String[] args) {
        try {
            System.out.println(2/0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
