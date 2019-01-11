package longjava;

import java.io.IOException;

import static netscape.security.Privilege.add;

/**
 * Author：TaiLong
 * created:2019/1/10
 */
public class Test54 {
    public static void main(String[] args) {
        System.out.println(add1(5, 5));
        System.out.println(add1(11, 12, 54));
        System.out.println(sum(100));
        Arayy();
    }

    public static void Arayy() {
        int[] data = null;
        data = new int[4];
        data[0] = 5;
        data[1] = 2;
        data[2] = 5;
        data[3] = 56;
        System.out.println(data.length);
        for (int i = 0; i <= data.length; i++) {
            System.out.println(data[i]);
        }
        //静态初始化数组
        int[] order = {2, 2, 22, 2, 3, 5, 5, 6, 66, 55, 56};
        for (int x = 0; x <= order.length; x++) {
            System.out.println(order[x]);
        }
        System.out.println(data[1]);
    }


    public static int add1(int x, int y) {
        return x + y;

    }

    public static int add1(int x, int y, int z) {
        return x + y + z;
    }

    public static int sum(int num) {
        //利用递归实现1到100求和
        if (num == 1) {
            return 1;
        } else {
            return num + sum(num - 1);
        }


    }
}
/**
 * int i = 1;
 * int j, x = 10;
 * for (i = 1; i < x; i++) {
 * for (j = 1; j <= i; j++) {
 * System.out.print(i+"*"+j+"="+i*j+"  ");
 * }
 * System.out.println();
 * }
 * }
 * }
 * //
 * /**    System.out.println("bite is best");
 * }
 * case 'b': {
 * System.out.println("java is best");
 * }
 * case 'c': {
 * System.out.println("kai huang is best");
 * }
 * default: {
 * System.out.println("good good study day day up");
 * }
 * }
 */

