package fileTest;

import java.io.File;
import java.io.IOException;

/**
 * @Author xushupeng
 * @Date 2023-09-07 22:44
 */
public class fileTset01 {
    public static void main(String[] args) throws IOException {
     String path="C:\\Users\\86187\\Desktop\\demo\\";
        File file = new File(path+"a1\\b1\\c1\\d1");
        if(file.exists()){
            System.out.println("文件存在");
        }
        else{
           // file.createNewFile();
            file.mkdirs();
            System.out.println("文件创建成功");
        }

    }
}
