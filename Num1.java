import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Author：TaiLong
 * created:2019/6/1
 */
public class Num1 {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        String str=scanner.next();
        char[] ch=str.toCharArray();
        for(int i=0;i<ch.length;i++){
            for(int j=0;j<ch.length-i-1;j++){
                if (ch[j] < ch[j+1]) {
                    char a=ch[j+1];
                    ch[j+1]=ch[j];
                    ch[j]=a;

                }


            }

        }
        int num=1;
        for(int c=0;c<ch.length-1;c++){
            if(ch[c]!=ch[c+1]){
                num=num+1;
            }
            }
        System.out.println( num);

    }

}
