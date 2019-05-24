import java.util.Arrays;

/**
 * Author：TaiLong
 * created:2019/5/21
 */
public class gg {
    public int  count(int[] A, int n) {
        int sum = 0;
        int num;
        if (n > 5000) {
           return 0;
        }

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length - 1 - i; j++) {
                if (A[j] >= A[j + 1]) {
                    num = 1;
                    sum = num + sum;

                    int t = A[j + 1];
                    A[j + 1] = A[j];
                    A[j] = t;

                }

            }

           // System.out.println(sum);
        }
        return sum;
        }

    public static void main(String[] args) {
        gg n = new gg();
        int[] a = new int[]{1, 2, 3, 4, 5, 6, 7, 0};
        n.count(a, 9);

    }
}