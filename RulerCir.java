/**
 * Author：TaiLong
 * created:2019/5/21
 */
public class RulerCir {
    public static void main(String[] args){
        String a="()";
        RulerCir v=new RulerCir();
        System.out.println( v.chkParenthesis(a,2));
    }
    public boolean chkParenthesis(String A, int n) {
        int num=0;
        int n1=1;
        if(n%2!=0){
            return false;
        }

        char[] data = A.toCharArray();
        if(n==2){
            data[0]=data[1];
            return true;
        }
        for (int i = 1; i <= n / 2; i++) {
            if (data[i] == data[0]) {
                num = num + 1;
            }
        }
        for (int j = n - 2; j > n / 2; j--) {
            if (data[j] == data[n-1]) {
                n1=n1+1;
            }
        }
            if(n1==num){
            return true;
            }
            else{
        return false;
        }
    }
}