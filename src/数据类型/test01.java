package 数据类型;

/**
 * @Author xushupeng
 * @Date 2024-12-10 17:05
 */
//people 类定义
//引用数据类型是指存储对象的引用或地址，而不是对象本身。引用数据类型包括类、接口、数组和枚举等。


import java.awt.*;
import java.io.*;

class Person implements Serializable {
    private static final long serialVersionUID = 1L; // 版本控制
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

}

public class test01 {
    public static  int fileNum=0;
    public static void visit(String dirname){

        File f1 = new File(dirname);

        //是文件
        if(!f1.isDirectory()){
           // System.out.println("文件 " + dirname);
            fileNum++;
        }
        //是目录
        else{
            //System.out.println("目录 " + dirname);
            String s[] = f1.list();
            if(s==null){ // 如果数组没有被初始化，引用将为 null。 int[] array = null;  array为null   如果数组被初始化但没有任何元素，长度将为0。 int[] array = new int[0];
                return ;
            }
            for (int i = 0; i < s.length; i++) {
                visit(dirname+"\\"+s[i]);
            }
        }
    }


    public static void main(String[] args) throws IOException {
//             String dirname = "C:\\";
//               visit(dirname);
//        System.out.println("文件数量"+fileNum);
        Person p=new Person("张三",18);
        System.out.println(p);



        int sum=0;
        for(int i=0;i<10;i++){
            sum+=i;
            if(sum>=10) {
                break;
            }
        }



    }

}

