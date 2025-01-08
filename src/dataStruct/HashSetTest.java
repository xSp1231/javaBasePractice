package dataStruct;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {
    public static void main(String[] args) {
        Set<String> sites = new HashSet<String>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Zhihu");
        sites.add("Runoob");// 重复的元素不会被添加
        sites.add("xsp");
//      sites.clear();
        System.out.println(sites);
        sites.remove("xsp");
        System.out.println(sites.size());
        //System.out.println(sites.contains("xsp"));
        for(String it:sites){
            System.out.println(it);
        }
        //HashSet是一个集合，它没有提供直接读取指定元素的方法，因为HashSet中的元素是无序的，
        //没有按照添加的顺序进行存储，所以没有办法通过下标来读取指定位置的元素。
    }
}
