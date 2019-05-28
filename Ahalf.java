import java.util.Scanner;

/**
 * Author：TaiLong
 * created:2019/5/26
 */
public class Ahalf {
        public static void main(String[] args){
            Scanner s=new Scanner(System.in);
            while(s.hasNext()){
                String str=s.nextLine();
                String[] str1=str.split(" ");
                int[] arr=new int[str1.length];
                for(int i=0;i<arr.length;i++){
                    arr[i]=Integer.valueOf(str1[i]);
                    }
                    int num=arr[0];
                int count=0;
                for(int j=0;j<=arr.length;j++){
                    if (num==arr[j]){
                        count++;
                    }
                   else if(count>=(arr.length)/2){
                        num=arr[j];
                    }

                }
                System.out.println(num);
        }
    }
}
