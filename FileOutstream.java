package JavaIo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * Author：TaiLong
 * created:2019/4/23
 */
    public class FileOutstream {
    public static void main(String[] args) throws IOException {
        File file = new File( "E:/STM32/MDK55");
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdir();
        }//OutputStream是个抽象类，所以要通过子类实例化实现，只能操作file类
        OutputStream output = new FileOutputStream(file);
        //要求传输到文件的内容
        String s = "hello world";
        //将内容变为字节数组
        output.write(s.getBytes());
        //关闭输出
        output.close();
    }
}


