import java.util.Scanner;

/**
 * Author：TaiLong
 * created:2019/5/29
 */
public class ArrayFount {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextLine()) {
            String str = sc.nextLine();
            String[] str1 = str.split(" ");
            int[] arr = new int[str1.length];
            for (int i = 0; i <=str1.length; i++) {
                arr[i] = Integer.valueOf(str1[i]);
                System.out.print(arr[i]);
            }
            int num = sc.nextInt();
            int count1 = sc.nextInt();
            int count2 = sc.nextInt();


        }
    }
}
