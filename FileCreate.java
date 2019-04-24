package JavaIo;

import java.io.File;
import java.io.IOException;

/**
 * Author：TaiLong
 * created:2019/4/23
 */
public class FileCreate {
    public static void main(String[] args) throws IOException {
        File file=new File("D/练习java/新建文件夹/ll");
        if(!file.getParentFile().exists()){
            file.getParentFile().mkdir();
            //创建父目录，有多少级就创建多少级
        }
        if(file.exists()){
            //文件存在，进行删除
            file.delete();
        }
       else{
            //文件不存在进行创建
            file.createNewFile();
        }
    }
}
