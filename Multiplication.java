/**
 * Author：TaiLong
 * created:2019/3/26
 */
//乘法口诀表的打印
public class Multiplication {
    public static void main(String args[]){
        int row=10;
        int line=10;
        for(row=1;row<10;row++)//
        {
            for(line=1;line<=row;line++){
                System.out.print(line+"*"+row+"="+row*line+" ");
            }
            System.out.println();
        }
    }
}
