package lon.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.file.Paths;

/**
 * Author：TaiLong
 * created:2018/12/11
 */
//实现文件信息的读取
public class Test35 {
    public static void main(String[] args) throws Exception{
        File file=Paths.get("D:","liukaiaini","xx.txt").toFile();
if(file.exists()){
    //必须保证文件存在才能处理
    InputStream input=new FileInputStream(file);
    byte[] data=new byte[30];
    //每次可以读取的最大数量
    int len=input.read(data);
    //此时的数据读取到了数组之中
    String result=new String(data,0,len);
    //将字节数组转为String
    System.out.println("读取内容【"+result+"】") ;
    input.close();

}
    }
}
