package reflect;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.lang.reflect.Field;

/**
 * @Author xushupeng
 * @Date 2024-12-13 15:49
 */
public class 反射练习 {
    //对于任意一个对象 都可以把对象所有的字段名和值，保存到文件中去

    public static void saveStudent( Student student) throws Exception{
        Class clazz = student.getClass();
        //创建io流
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("student.txt"));
        //获取类的所有字段
        Field[] fields = clazz.getDeclaredFields();
        //获取所有字段对应的值
        for(Field field:fields){
            String filedName=field.getName();
            //获取字段对应的值 使用field类里面的方法
            field.setAccessible(true);//临时取消访问权限
            Object value = field.get(student);

            //将field value 以field:value 形式写入到txt中
            System.out.println(filedName+":"+value);
            bufferedWriter.write(filedName+":"+value);
            bufferedWriter.newLine();

        }
        bufferedWriter.close();
        System.out.println("保存成功");
    }

    public static void main(String[] args) throws Exception {
        Student s = new Student("小明",18,666);
        saveStudent(s);
    }

}
