package lon.com;

import java.io.*;
import java.nio.file.Paths;

/**
 * Author：TaiLong
 * created:2018/12/11
 */
//实现文件的内容追加
    public class Test33 {
    public static void main(String[] args) throws Exception {
        File file= Paths.get("D:","liukaiaini","xx.txt").toFile();
        if(!file.getParentFile().exists()){
            //必须保证父目录存在
            file.getParentFile().mkdir();
            //创建多级目录
        }
        OutputStream output=new FileOutputStream(file,true);
        //要求输出到文件内容
        String mad="hello,world,hello java";
        //将内容变为字节数组
            output.write(mad.getBytes());
            //关闭输出；
        output.close();


    }
}
