import java.lang.reflect.Array;
import java.util.Scanner;

/**
 * Author：TaiLong
 * created:2019/5/29
 */
public class Split{
    public static void main(String[] args){
            int[] F=new int[20];
            F[0]=0;
            F[1]=1;
            int i=2;
            while(i<=200){
                F[i]=F[i-1]+F[i-2];
            }
        System.out.println("fff");
        System.out.println(F[0]);
           Scanner sc=new Scanner(System.in);
            while(sc.hasNextInt()){
                int n=sc.nextInt();
                int count=0;
                for(int num=0;num<=200;num++){
                    if(n!=F[num]);
                    count=count++;
                }
                System.out.println(count);
            }
        }
    }