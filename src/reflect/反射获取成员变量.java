package reflect;

import java.lang.reflect.Field;

/**
 * @Author xushupeng
 * @Date 2024-12-13 15:03
 * 反射获取成员变量
 */
public class 反射获取成员变量 {
    public static void main(String[] args) throws ClassNotFoundException {
        System.out.println("hello");
        Class z= Class.forName("reflect.Student");
        Field[] fields = z.getFields(); //获取公有字段 PUBLIC
        for(Field field:fields){
            System.out.println(field);
        }
        //获取所有字段，包括私有，保护，默认，公有
        Field[] fields1 = z.getDeclaredFields();
        for(Field field:fields1){
            System.out.println(field);
        }



    }

}
