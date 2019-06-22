import java.util.Scanner;

public class Fb {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
      int n = s.nextInt();
        System.out.println(count(13));

        }
        public static int count(int n){
        if(n==0||n==1){
            return n;
        }
        return count(n-2)+count(n-1);
        }
    }
