package Character;

/**
 * @Author xushupeng
 * @Date 2024-12-13 12:02
 */

public class test01 {


    public static void main(String[] args) {
     char a='a';
     System.out.println(a);
     char [] arr=new char[9];
     arr[0]='a';
     arr[1]='b';
     arr[2]='c';
     arr[3]='d';
     arr[4]='e';
     arr[5]='f';
     System.out.println(arr.length);
     System.out.println(arr[5]);

     Character ch=new Character('a');

     Character.isLetter(ch);

    }

}
