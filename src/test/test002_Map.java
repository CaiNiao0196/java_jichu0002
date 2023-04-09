package test;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
练习Map
 */
public class test002_Map {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        //添加（key不可以重复，如果重复，后添加的替换之前的，返回值为旧value）
        map.put("001", "aaa");
        //获取（返回值为当前key的value）
        System.out.println(map.get("001"));
        //获取（当前map有几对值）
        System.out.println(map.size());
        //判断（判读是否存在key）
        System.out.println(map.containsKey("001"));
        //判断（判读是否存在value）
        System.out.println(map.containsValue("aaa"));
        //判断（判断是否有对应关系,没有返回true）
        System.out.println(map.isEmpty());
        //获取所有key
        Set<String> set = map.keySet();
        for (String s: set){
            System.out.println(s);
        }
        //获取所有value
        Collection<String> c = map.values();
        for (String s: c){
            System.out.println(s);
        }
        //删除（当前key，存在即输出value，不存在即null）
        System.out.println(map.remove("001"));
        //删除（删除所有）
        map.clear();
    }
}
