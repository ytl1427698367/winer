package longjava;

/**
 * Author：TaiLong
 * created:2019/1/12
 */
public class Test61 {
    public static void main(String[] args) {
        while(true){
            new Thread(()->{}).start();
        }
    }
}
