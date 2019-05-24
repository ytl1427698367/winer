/**
 * Author：TaiLong
 * created:2019/5/21
 */
public class AntiOder {
    public  void count(int[] A, int n) {
        int sum=0;
        if (n > 5000) {
            System.out.println("  ");
        }

            for (int i = 0; i < A.length -1; i++) {
                for (int j = i + 1; j < A.length; j++) {
                    if (A[i]>A[j]) {
                     int  num=1;
                      sum=sum+num;
                    }
                }

            }
        System.out.println(sum);
        }

    public static void main(String [] args){
AntiOder c=new AntiOder();
        int [] a=new int[]{1,2,3,4,5,6,7,0};

        c.count(a,2000);

        System.out.println();
    }
}