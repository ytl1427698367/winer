import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int[][] array = new int[A][B];
            for (int x = 0; x < A; x++) {
                for (int y = 0; y < B; y++) {

                    System.out.print("*"+" ");
                }
                System.out.println();
            }
            for(int c=0;c<A;c++){

            }
        }
    }
}