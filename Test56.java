package longjava;

/**
 * Author：TaiLong
 * created:2019/1/11
 */
public class Test56 {
    public static void main(String[] args){
        int[] data=init();
        Arrayprint(data);

    }
    //数组的方法返回
    public static int[] init(){
        return  new int[]{23323,232,32,32,323,};
    }
    public static void Arrayprint(int[] temp){
        for(int i=0;i<temp.length;i++){
            System.out.print(temp[i]+",");
        }
    }


}
