import java.util.Scanner;

/**
 * Author：TaiLong
 * created:2019/5/29
 */
public class DelectCommon {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String str=sc.nextLine();
            char[] ch=sc.nextLine().toCharArray();
            for(int i=0;i<ch.length;i++){
                if(!str.contains(String.valueOf(ch[i]))){
                    System.out.print(ch[i]);
                }
            }
        }
    }
}
