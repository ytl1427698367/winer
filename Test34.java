package lon.com;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.nio.file.Paths;
/**
 * Author：TaiLong
 * created:2018/12/11
 */
//部分内容输出
public class Test34 {
    public static void main(String[] args)throws Exception {
        File file=Paths.get("D:","log","tt.txt").toFile();
        if(!file.getParentFile().exists()){
            file.getParentFile().mkdir();
        }
        OutputStream output=new FileOutputStream(file,true);
        String tailong="hellokai,乖孩子";
        output.write(tailong.getBytes(),0,7);
        output.close();


    }
}
