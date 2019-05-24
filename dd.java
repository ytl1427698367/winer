/**
 * Author：TaiLong
 * created:2019/5/21
 */
public  class dd{
    public static void main(String[] args){
        dd s=new dd();
        s.Drink(new int[]{10,0,1,81,2,36});
    }
    public  void Drink(int[] o) {

        for (int i = 0; i < o.length; i++) {
            int num = o[i];
            int sum=0;
            int newdrink = 0;
            int other;

            if (num < 2) {
                System.out.println("0");
                continue;
            }

            if (num == 2 || num == 3) {
                System.out.println("1");
                continue;
            }
            while (num > 3) {
                {
                    newdrink = num / 3;
                    other = num % 3;
                    num = newdrink + other;
                    sum = newdrink + sum;
                }

            }
            System.out.println(sum + 1);
            }

    }

}

