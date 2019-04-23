package JavaIo;

import java.io.File;

/**
 * Author：TaiLong
 * created:2019/4/23
 */
public class AcquareFileInformation {
    public static void main(String[] args) {
        File file = new File("D/新建文件夹");
        if (file.exists()&&file.isFile()){
            System.out.println("文件大小"+file.length());
            System.out.println("最后一次修改日期"+file.lastModified());

        }
    }
}