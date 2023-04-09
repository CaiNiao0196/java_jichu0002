package test;

import java.io.*;

public class test015_对象输入流和输出流 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //对象输出流使用
        ObjectOutputStream bw = new ObjectOutputStream(new FileOutputStream("4.txt"));
        test015_student s = new test015_student("aaa",90);
        //这里会报错，解决方法：在student类中实现Serializable序列化接口
        bw.writeObject(s);
        bw.close();

        //对象输入流使用（读完会报错，需要捕获异常）
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("4.txt"));
        try {
            while(true){
                System.out.println(ois.readObject());
            }
        }catch (EOFException e){
            System.out.println("读完了，拜拜");
        }
        ois.close();

    }
}
