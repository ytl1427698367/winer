/**
 * Author：TaiLong
 * created:2019/5/23
 */
public class BuyApple {

    public static void main(String[] args) {
BuyApple fg=new BuyApple();
fg.buy(48);
    }
    public int  buy(int n){
            int c=n/6;
            int v=n/8;
            for(int i=0;i<=v;i++){
                for(int j=0;j<=c;j++){
                    if(8*i+6*j==n){
                        System.out.println(i+j);

                    }

                }

                }
            return -1;
    }

}
