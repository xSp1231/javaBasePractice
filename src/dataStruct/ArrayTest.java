package dataStruct;

import java.util.*;

/**
 * @Author forerunner
 * @Date 2025-01-07 15:12
 */
public class ArrayTest {

    public static void main(String[] args) {
//    String [] str = {"a","b","c"};
//    System.out.println(str.length);
//    int [] a=new int[]{1,2,3,4,5,6};
//    System.out.println(a.length);
        List<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(22);
        list.add(13);
        list.add(23);
        list.add(31);
        list.add(30);
        list.add(66);
        list.add(111);
        list.add(1);
//    list.sort(new Comparator<Integer>() { //匿名内部类
//       @Override
//       public int compare(Integer integer, Integer t1) {
//           return Integer.compare(integer,t1); //从小到大排序
//       }
//   });
//    for (Integer integer : list) {
//        System.out.println(integer);
//     }
//    }

//list reverse函数
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer integer, Integer t1) {
                return Integer.compare(integer,t1); //从大到小排序
            }
        });
        for (Integer integer : list) {
            System.out.print(integer+" ");
        }

        System.out.println();
        Collections.reverse(list);
        for (Integer integer : list) {
            System.out.print(integer+" ");
        }

        //数组转为集合

        Integer [] arr={1,2,3,4,5,6,7,8,9};
        List<Integer> list1= Arrays.asList(arr);
        String []s=new String[3];
        s[0]="a";
        s[1]="b";
        s[2]="c";
        List<String> list2= new ArrayList<>(Arrays.asList("a","b","c"));
        System.out.println(list2);
        list2.add("d");
        System.out.println(list2);

    }



}
