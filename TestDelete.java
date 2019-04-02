import java.io.File;
import java.io.IOException;
/**
 * Author：TaiLong
 * created:2018/12/8
 */
//编写文件的基本操作，如果文件不存在则进行删除，如果存在，则进行创建

public class TestDelete {
    public static void main(String[] args) {
        File file=new File("D:" + File.separator + "练习java"+File.separator+"overflow.class");
        if(file.exists()) {
            file.delete();
        }
        else{
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
