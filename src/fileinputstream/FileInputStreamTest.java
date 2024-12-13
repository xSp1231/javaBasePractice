package fileinputstream;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.io.*;
import java.util.Arrays;

public class FileInputStreamTest {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\86187\\Desktop\\demo\\c.pdf");
        write(file);
        file.delete();
//
    }

    public static void write(File file) throws IOException {

        FileWriter fw = new FileWriter(file,true);
        String content="日日行,不怕千万里。我的网站地址是 http://8.137.112.197/LoginAndRegister";
        fw.write(content);//写入内容
        fw.close();//关闭流
    }
    public static String read(File file) throws IOException { //读取文件内容
        FileReader fr = new FileReader(file);
        char[] chars = new char[1024];//一次读出十个字符
        int length;
        StringBuilder res= new StringBuilder();
        while((length=fr.read(chars))!=-1){ //一批一批读取文件上的内容  每次都从上一个位置继续 不会重复读取
//            System.out.println("每次读取内容的长度 is "+length);
//            System.out.println(chars);
            res.append(chars,0,length);
        }
        fr.close();
        return res.toString();
    }
}
