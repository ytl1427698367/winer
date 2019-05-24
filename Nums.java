/**
 * Author：TaiLong
 * created:2019/5/21
 */
public  class Nums{
    public static void main(String[] args){
Nums s=new Nums();
        System.out.println(  s.Drink(10));
    }
    public  int Drink(int num){
        int newdrink=0;
        int other;
        int sum=0;
        if(num<2){
            return 0;
        }
        if(num==2||num==3){
            return 1;
        }

        while(num>3){
            newdrink=num/3;
            other=num%3;
            num=newdrink+other;
            sum=newdrink+sum;

        }
        return sum+1;
    }

}

