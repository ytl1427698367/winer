/**
 * Author：TaiLong
 * created:2019/4/2
 */
public class TestSdenmo {
    public static void main(String[] args){
        int[] data=new int[]{12,23,2,5,65,8,6,5};
        Adds add1=new Adds();
        System.out.println(add1.adds("hello",data));
        System.out.println(Adds.adds("world",new int[]{12,25,36,5,55,1}));

    }
}
class Adds {
    public static int adds(String arg,int[] array) {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            result = result + array[i];
        }
        return result;
    }
}
