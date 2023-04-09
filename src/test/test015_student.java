package test;

import java.io.Serializable;

public class test015_student implements Serializable {
    //生成反序列化id，可以避免因为类中内容改变导致对象输出流报错
    private static final long serialVersionUID = 3220446275893631767L;
    String name;
    int age;
    public test015_student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "test015_student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
