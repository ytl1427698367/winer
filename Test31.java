package tailong;

import java.io.File;
import java.lang.ref.PhantomReference;
import java.nio.file.Paths;

/**
 * Author：TaiLong
 * created:2018/12/9
 */
//列出目录的所有组成
public class Test31 {
    public static void main(String[] args) {
        File file=Paths.get("D:","steam").toFile();
        if (file.exists()&&file.isDirectory()){

File[] result=file.listFiles();
for(File file2:result){
    System.out.println(file2);
}
        }
    }

}
