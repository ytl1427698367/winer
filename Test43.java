package lon.com;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Author：TaiLong
 * created:2018/12/16
 */
//把属性输出到文件
public class Test43 {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        properties.setProperty("1", "tailong");
        properties.setProperty("2", "liukai");
        properties.setProperty("3", "happy");
        File file = new File("/D:/log/tt");
        properties.store(new FileOutputStream(file), "testProperties");
    }
}
