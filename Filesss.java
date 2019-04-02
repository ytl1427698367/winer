import java.io.File;
import java.util.Date;

/**
 * Author：TaiLong
 * created:2018/12/5
 */
//传入一个文件
public class Filesss {

    public static void print(File f) {
        if (f == null) {
            return;
        }
        System.out.println((f.isFile() ? "D" : "F") + " " + f.getName() + " " + f.length() + " " + new Date(f.lastModified()));
        File[] files = f.listFiles();
        if (files != null) {
            for (int i = 0; i < files.length; i++) {
                File item = files[i];
                System.out.println((item.isFile() ? "F" : "D") + " " + item.getName() + " " + item.length() + " " + new Date(item.lastModified()));
            }
        }

    }

    //递归遍历文件
//输出格式tree 目录
    public static void tree(File f) {
        if (f == null) {
            return;
        }
        if (f.isFile()) {
            System.out.println(f.getName());
        } else {
            File[] files = f.listFiles();
            if (files != null) {
                for (File item : files) {
                    tree(item);
                }
            }
        }
    }

    public static void main(String[] args) {
        File file = new File("D:" + File.separator + "steam");
        tree(file);
        print(file);
    }
}