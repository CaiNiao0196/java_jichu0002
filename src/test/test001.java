package test;

import java.util.HashSet;
import java.util.Objects;

/*
练习hashset
 */
public class test001 {
    public static void main(String[] args) {
        HashSet<student> hs = new HashSet<student>();
        student s = new student("aaa", 12);
        student s2 = new student("bbb", 13);
        student s3 = new student("bbb", 13);
        hs.add(s);
        hs.add(s2);
        hs.add(s3);
        for(student student: hs){
            System.out.println(student);
        }


    }



}
//创建学生类
class student{
    String name ;
    int age ;

    public student (String name, int age){
        this.name = name;
        this.age = age;

    }

    @Override
    public String toString() {
        return "student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public boolean equals(Object obj){
        //提高效率
        if(this == obj){
            return true;
        }
        //提高健壮性
        if(this.getClass() != obj.getClass()){
            return false;
        }
        student s = (student)obj;
        if(this.age != s.age){
            return false;
        }
        if( ! this.name.equals(s.name)){
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        return age + name.hashCode();
    }
}
