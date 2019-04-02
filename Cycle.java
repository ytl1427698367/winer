/**
 * Author：TaiLong
 * created:2019/3/26
 */
public class Cycle {
    public static void main(String[] args) {
        int line = 10;
        for (int x = 0; x < line; x++) { //控制行数
            for (int y = 0; y < line - x; y++) {//控制空格
                System.out.print(" ");
            }
            for (int z = 0; z < x; z++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }}