package test;

import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class test017_Properties {
    public static void main(String[] args) {
        Properties pro = new Properties();
        pro.put("001", "aaa");
        pro.put("002", "bbb");
        pro.put("003", "ccc");
        //获取所有ky对方式1
        Set<Object> pros_key = pro.keySet();
        for(Object key: pros_key){
            Object value = pro.get(key);
            System.out.println(key + "=" + value);
        }
        //获取多有ky对方式2
        Set<Map.Entry<Object, Object>> entrys = pro.entrySet();
        for (Map.Entry<Object, Object> kv : entrys){
            System.out.println(kv.getKey() +"="+ kv.getValue());
        }

    }
}
