package longjava;

/**
 * Author：TaiLong
 * created:2019/1/11
 */
//给你一个数组，要求可以统计出该数组的最大值、最小值并且从小打到排序
public class Test58 {
    public static void main(String[] args) {
        int[] data = new int[]{25, 2, 5, 6, 6, 36, 6, 25, 6, 2, 6, 6, 5552, 25};
        max(data);
        min(data);
        sum(data);
        java.util.Arrays.sort(data);
        System.out.print("一位数组从小到大排序的结果为：");
        Arrayprint(data);
    }

    public static void max(int[] temp) {
        int max = temp[0];
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] >= max) {
                max = temp[i];
            }
        }
        System.out.println("这个一维数组的最大值为" + max);
    }

    public static void min(int[] temp) {
        int min = temp[0];
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] <= min) {
                min = temp[i];
            }
        }
        System.out.println("这个一维数组的最小值为" + min);
    }

    public static void sum(int[] temp) {
        int sum = 0;
        for (int i = 0; i < temp.length; i++) {
            sum = sum + temp[i];
        }
        System.out.println("这个一维数组的平均值为" + sum / temp.length);
    }

    public static void Arrayprint(int[] temp) {
        for (int i = 0; i < temp.length; i++) {
            System.out.print(temp[i] + ",");
        }
        System.out.println();
    }
}