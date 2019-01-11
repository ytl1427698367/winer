package longjava;

/**
 * Author：TaiLong
 * created:2019/1/11
 */
public class Test57 {
    //实现数组的排序
    public static void main(String[] args){
        int [] intdata=new int[]{22,3,23,23,3,233,3};
        char[] chardata=new char[]{'c','d','p','l'};
        java.util.Arrays.sort(intdata);
        java.util.Arrays.sort(chardata);
        Arrayprint(intdata);
        Arrayprint(chardata);

    }
    public static void Arrayprint(int[] temp) {
        for (int i = 0; i < temp.length; i++) {
            System.out.print(temp[i]+",");
        }
        System.out.println();
    }
        public static void Arrayprint(char[] temp){
                for(int i=0;i<temp.length;i++){
                    System.out.print(temp[i]+"," );
        }
            System.out.println();
    }

}
