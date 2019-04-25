package JavaIo;

import java.io.*;

/**
 * Author：TaiLong
 * created:2019/4/23
 */
public class InputStream {
    public static void main(String[] args) throws IOException {
        File file=new File("E:/STM32/MDK5/安装过程.txt");
        //必须保证文件存在才可以进行操作
        if(file.exists()){
            Reader input= new FileReader(file);
            char[] data=new char[1024];//每次可以读取的最大数据量
            int len =input.read(data);//将数据读取到数组之中
            String result=new String(data,0,len);//将字节数组转为String 类型
            System.out.println("读取内容"+result);
            input.close();
        }
    }
}
