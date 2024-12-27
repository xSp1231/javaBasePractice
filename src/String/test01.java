package String;

/**
 * @Author xushupeng
 * @Date 2024-12-13 12:09
 */
public class test01 {

    public static void main(String[] args) {

        //new String("12131")：
        //这种方式显式地创建了一个新的 String 对象。
        //每次使用 new 关键字时，都会在堆内存中分配一块新的内存，即使字符串内容相同。
        //String c = "12131";：
        //这种方式是使用字符串字面量创建 String 对象。
        //Java 会首先检查字符串常量池（String Pool）中是否已经存在相同内容的字符串。如果存在，c 将引用这个已有的字符串。如果不存在，Java 会在常量池中创建一个新字符串。
     String a=new String("12131");
     String c="12131";
     String b=new String("12131");
     System.out.println(a==b);
     System.out.println(a.equals(b));
     Integer aa=1; //装箱 Integer aa=Integer.valueOf(1);
     Integer bb=2;
     Integer cc=aa+bb;
     System.out.println(cc);




    }
}
