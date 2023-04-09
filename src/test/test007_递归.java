package test;
/*
练习递归
 */
public class test007_递归 {
    public static void main(String[] args) {
        System.out.println(dg(5));
    }
    public static int dg(int n){
        if(n == 1){
            return 1;
        }else {
          return n * dg(n-1 );
        }
    }

}

