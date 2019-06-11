import java.util.Scanner;

/**
 * Author：TaiLong
 * created:2019/5/29
 */
public class Testified {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLong()) {
            long x = sc.nextLong();
               Testified c=new Testified();
               c.count(x);
        }
    }
        public void count(long x){
            long y=1;

            int cout=0;
            for(long i=1;i<=x;i++){
                y=y*i;
            }
            while(y>=10){
                long number;
                number=y%10;
                if(number==0){
                    cout++;
                }
                y=y/10;
            }
            System.out.println(cout);
        }
    }
