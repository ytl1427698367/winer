import java.util.Scanner;

/**
 * Author：TaiLong
 * created:2019/5/28
 */
public class Ports{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String s=sc.nextLine();
            String[] s1=s.split(" ");
            int [] arr=new int[s.length()];
            for(int i=0;i<arr.length;i++){
                arr[i]=Integer.valueOf(s1[i]);
            }
            int n=arr[arr.length-1];
            for(int j=0;j<arr.length;j++){
                for(int c=0;c<arr.length-j-1;c++){
                    if(arr[c]>arr[c+1]){
                        int h=arr[c];
                        arr[c]=arr[c+1];
                        arr[c+1]=h;
                    }
                }
            }
            for(int cv=0;cv<=n;cv++){
                System.out.println(arr[cv]);
            }

        }
    }
}
