package test1;

import java.util.ArrayList;
import java.util.List;

public class test011_模拟登陆数据库 {
    private static List<test010_模拟登陆数据类> users = new ArrayList<test010_模拟登陆数据类>();
    static {
        users.add(new test010_模拟登陆数据类("admin","admin"));
        users.add(new test010_模拟登陆数据类("123456", "123456"));
    }
    public static List<test010_模拟登陆数据类> getUsers(){
        return users;
    }
}
