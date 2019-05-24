import java.util.Scanner;

/**
 * Author：TaiLong
 * created:2019/5/21
 */
public class BackHallf {
    public static boolean Huiwen(String str) {
        int i = 0;
        int j = str.length()- 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String str1=scanner.nextLine();
        String str2=scanner.nextLine();
        int count=0;
        for(int i=0;i<str1.length();i++){
            StringBuilder s=new StringBuilder(str1);
            s.insert(i,str2);
            if(Huiwen(s.toString())){
                count++;
                }
        }
        System.out.println(count);
    }
}