public class Finderf {
    public int findKth(int[] a, int n, int K) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] < a[j + 1]) {
                    int v = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = v;
                }
            }
            // write code here
        }
        if (K > n) {
            System.out.println("n的取值错误");
        }
        return (a[K]);
    }

    public static void main(String[] args) {
        Finderf x = new Finderf();
        int[] a = new int[]{12, 56, 26, 3, 6, 56, 85};
        x.findKth(a, 7, 3);
    }
}