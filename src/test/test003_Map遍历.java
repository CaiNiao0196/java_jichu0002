package test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class test003_Map遍历 {
    public static void main(String[] args) {
//        //方式1（获取key，通过key获取value）
//        Map<String, String> map = new HashMap<String, String>();
//        map.put("001","AAA");
//        map.put("002","BBB");
//        map.put("003","CCC");
//        Set<String> keys = map.keySet();
//        for (String key: keys){
//            System.out.println(key+map.get(key));
//        }
        //方式2(获取所有ky对对象)
        Map<String, String> map = new HashMap<String, String>();
        map.put("001","AAA");
        map.put("002","BBB");
        map.put("003","CCC");
        Set<Map.Entry<String, String>> entrys = map.entrySet();
        for (Map.Entry<String, String> entry: entrys){
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+value);
        }
    }
}
