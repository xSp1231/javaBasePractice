package dataStruct;

import java.util.HashMap;

public class HashMapTest {
    public static void main(String[] args) {
        HashMap<Integer, String> mp = new HashMap<Integer, String>();
        mp.put(1,"one");
        mp.put(2,"two");
        mp.put(3,"three");
        mp.put(4,"four");
        System.out.println(mp);
        //System.out.println(mp.get(3));//获取指定元素
        mp.remove(4);
        System.out.println(mp);
//        mp.clear();
//        System.out.println(mp);

        for(Integer it :mp.keySet()){ //获取键
            System.out.println(it);
        }
        for(String it :mp.values()){ //获取值
            System.out.println(it);
        }
        System.out.println(mp.get(1)); //读取指定元素 类比c++ stl
        System.out.println(mp.isEmpty()); //判断是否为空
    }
}
