import java.util.Scanner;

/**
 * Author：TaiLong
 * created:2019/6/3
 */
public class Square {
        public static void main(String []args){
            Scanner sc=new Scanner(System.in);
            int num=sc.nextInt();
            String str=sc.next();
            for(int i=0;i<num/2;i++){
                for(int j=0;j<num;j++){
                    System.out.print(str);
                }
                System.out.println();
            }
        }
    }

