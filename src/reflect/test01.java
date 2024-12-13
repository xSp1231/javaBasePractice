package reflect;

/**
 * @Author xushupeng
 * @Date 2024-12-13 12:11
 */
public class test01 {
    public static void main(String[] args) throws ClassNotFoundException {
        //法1 全类名=包名+类名  主要
        Class clazz1=Class.forName("reflect.Student"); //获取Student类字节码文件的对象
        System.out.println(clazz1);

        //法2
        Class clazz2=Student.class; //Student类字节码文件的对象

        System.out.println(clazz2);

        System.out.println(clazz1==clazz2);

        //第三种方式
        Student s=new Student();

        //
        Class clazz3=s.getClass();
//
        System.out.println(clazz3);




    }




}

