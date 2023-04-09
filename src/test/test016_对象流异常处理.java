package test;

import java.io.*;
import java.util.ArrayList;

public class test016_对象流异常处理 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //创建对象输出流，将student输出到文件中
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("5.txt"));
        ArrayList<test015_student> list = new ArrayList<test015_student>();
        list.add(new test015_student("bbb",12));
        list.add(new test015_student("ddd", 13));
        oos.writeObject(list);
        oos.close();

        //创建对象输入流，读取对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("5.txt"));
        Object obj = ois.readObject();
        ArrayList<test015_student> lists = (ArrayList<test015_student>)obj; //向下转型，将Object转为ArrayList类型
        for (test015_student student: lists){
            System.out.println(student);
        }
        ois.close();


    }
}
