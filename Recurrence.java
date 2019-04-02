/**
 * Author：TaiLong
 * created:2019/3/26
 */
//用递归实现1到100相加
public class Recurrence {
    public static void main(String args[]){
        System.out.println(sum(100));
    }
    public static int sum(int num){
        if (num==1){
            return 1;
            }
            else{
            return num+sum(num-1);
        }
    }
}
