package dataStruct;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author forerunner
 * @Date 2025-01-07 15:56
 */
public class MapTest {
    public static void main(String[] args) {
        Map<String,Object> map = new HashMap<>();
        map.put("name","xsp");
        map.put("age",18);
        System.out.println(map);
        for(String key:map.keySet()){
            System.out.println(key+":"+map.get(key));
        }
        if(map.containsKey("name")){
            map.put("name","forerunner");
        }
        map.forEach((k,v)-> System.out.println(k+":"+v));


    }
}
