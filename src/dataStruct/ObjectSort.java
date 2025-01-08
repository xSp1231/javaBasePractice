package dataStruct;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @Author forerunner
 * @Date 2025-01-07 15:42
 */
public class ObjectSort {

    public static void main(String[] args) {
        List<User> userList = new ArrayList<>();
         userList.add(new User(25, "Alice"));
         userList.add(new User(30, "Bob"));
         userList.add(new User(20, "Charlie"));
         userList.add(new User(25, "David"));
         userList.add(new User(30, "Eve"));
         userList.sort(new Comparator<User>() {
             @Override
             public int compare(User user, User t1) {
                 if(!user.getAge().equals(t1.getAge())){ //年龄由
                     return user.getAge().compareTo(t1.getAge()); //age从小到大排序
                 }
                 else{
                     return user.getName().compareTo(t1.getName());//名字由小到大排序
                 }

             }
         });
         for (User user : userList) {
             System.out.println(user.getAge()+" "+user.getName());
         }

         Integer a = 1111;
         Integer b = 2111;
         System.out.println(a.compareTo(b));


    }

}
