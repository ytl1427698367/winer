package longjava;

import java.sql.SQLOutput;

/**
 * Author：TaiLong
 * created:2018/12/30
 */
public class Test53 {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().isDaemon());
        class A implements Runnable {
            private int i;

            @Override
            public void run() {
                try {
                    while (true) {
                        i++;
                        System.out.println("线程名称" + Thread.currentThread().getName() + "i=" + i + "是否为守护线程" + Thread.currentThread().isDaemon());
                        Thread.sleep(1000);
                    }
                } catch (InterruptedException e) {
                    System.out.println("线程名称：" + Thread.currentThread().getName() + "中断线程了");
                }

            }
        }
    }
}



