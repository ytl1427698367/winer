package lon.com;

/**
 * Author：TaiLong
 * created:2018/12/12
 */

import java.io.File;
import java.io.FileWriter;
import java.io.Writer;
import java.nio.file.Paths;

/**字符适合于处理中文数据，Writer是字符输出流的处理类，这个类的定义如下:
        与OutputStream相比多了一个Appendable接口。
        在Writer类里面也提供write()方法，而且该方法接收的类型都是char型，要注意的是，Writer类提供了一个直接输
        出字符串的方法：
        如果要操作文件使用FileWriter子类。
        范例：通过Writer实*/

public class Test36 {
    public static void main(String[] args)throws Exception {
        File file=Paths.get("D:","liukaiaini","xx").toFile();
        if(!file.getParentFile().exists()){
            file.getParentFile().mkdir();
        }
        String msg="java比特nice";
        Writer out=new FileWriter(file);
        out.write(msg);
        out.close();

    }
}
