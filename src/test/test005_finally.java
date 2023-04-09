package test;

import java.io.FileWriter;
import java.io.IOException;

/*
练习IO流异常处理，即finally基础使用
 */
public class test005_finally {
    public static void main(String[] args) {
        FileWriter fw = null;
        try {
            fw = new FileWriter("1.txt");
            fw.write("hello");
            System.out.println(2/0);
            fw.write("java");
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                if (fw != null) {
                    fw.close();
                    System.out.println(2/0);
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
