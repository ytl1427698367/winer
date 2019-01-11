package longjava;

/**
 * Author：TaiLong
 * created:2019/1/11
 */
public class Test55 {
    public static void main(String[] args){
        int [] dataa=new int[]{22,2,32,323,223,323};
        //方法接收数组
        Arrayprint(dataa);
        System.out.println();
        //二维数组的定义和输出
        int[][] data = new int[][]{{22,22,22,3,3,3},{22,2,22,5,55,5,86,5},{23,23,23,2,325,25,56,65}};
        //输出一定要使用双循环
        for(int i=0;i<data.length;i++){
            for(int x=0;x<data[i].length;x++){
                System.out.print("data{"+i+"]["+x+"]="+data[i][x]+",");
            }
            System.out.println();
        }
    }
    public static void Arrayprint(int[] temp){
        for(int i=0;i<temp.length;i++){
            System.out.print(temp[i]+".");
        }
    }

}
