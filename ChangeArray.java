import java.util.Arrays;

/**
 * Author：TaiLong
 * created:2019/6/1
 */
public class ChangeArray {

    public static void main(String[] args) {

        int[] c = new int[]{1, 2};
        ChangeArray hg=new ChangeArray();
        hg.exchangeAB(c);
    }
    public int[] exchangeAB(int[] AB) {
            // write code here
            AB[0]^=AB[1];
            AB[1]^=AB[0];
            AB[0]^=AB[1];

           return AB;

        }
    }

