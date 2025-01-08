package String;

/**
 * @Author forerunner
 * @Date 2025-01-08 15:23
 */
public class test02 {

    public static void main(String[] args) {

        String obj1 = new String("runoob");
        String obj2 = new String("runoob");


        if(obj1.hashCode() == obj2.hashCode())
            System.out.println("object1 与 object2 哈希码相等"); //字符串的hash根据内容值计算，所以哈希码相等

        if(obj1 == obj2)
            System.out.println("object1 与 object2 内存地址一样");

        if(obj1.equals(obj2))
            System.out.println("object1 与 object2 值相等");

    }


    static int fun(int y,int x )
    {
        return x;
    }
}
