package generic;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @Author xushupeng
 * @Date 2023-08-27 16:51
 */
public class Generic05_TEST {

    public static void main(String[] args) {
        List<Employee> list=new ArrayList<>();
        list.add(new Employee("xsp",323456,new MyDate(2002,11,1)));
        list.add(new Employee("psx",223456,new MyDate(2003,11,1)));
        list.add(new Employee("xps",123456,new MyDate(2002,10,9)));
        System.out.println(list);
        System.out.println("排序");
        list.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee t1, Employee t2) {

                return 0;
            }
        });

    }
}



