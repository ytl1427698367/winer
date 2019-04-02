/**
 * Author：TaiLong
 * created:2019/3/26
 */
public class ArrayDemo {
    public static void main(String[] args) {
      /*  byte[] bytes=new byte[5];//数组动态初始化
        bytes[0]=23;
        bytes[1]=21;
        bytes[2]=26;
        for(int j=0;j<=bytes.length;j++){
            System.out.println("bytes"+j+"="+bytes[j]);
        }
        int [] bum=new int[]{21,25,23,25,23,25};//  数组静态初始化
        for(int i=0;i<=bum.length;i++){
            System.out.println("bum"+i+"="+"{"+bum[i]+"}");
        }
      //多个栈内存指向一个堆空间
        int[] x=null;
        int[] temp=null;
        x=new int[3];
        x[0]=20;
        x[1]=12;
        for(int i=0;i<x.length;i++){
            System.out.println(x[i]);
        }
        temp=x;
        temp[1]=25;
        System.out.println(x[1]);
        //方法接收数组
        int[] data =init();
      bigger(data);
        receivearray(data);

    }


  public static void receivearray(int[] temp) {
        for (int l = 0; l < temp.length; l++) {
            System.out.print(temp[l]+".");
        }
    }
    //方法返回数组
    public static int[] init(){
        return new int[] {1,2,3,4,5} ; // 匿名数组
    }
    //方法修改数组,将数扩大五倍
    public static void bigger(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= 5; // 每个元素扩大5
        }*/
      //查找一个数组的最大值，最小值和平均值
        int [] data=new int[]{25,25,6,26,6,6,5,4,8};
        printArray(data);}
        public static void printArray(int[] are){
            int max=are[0];
            int min=are[0];
            int sum=0;
            for(int i=0;i<are.length;i++){
                sum=sum+are[i];
                if(max<are[i]){
                    max=are[i];
                }
                if(min>are[i]){
                    min=are[i];
                }
                }
            System.out.println("这个数组的最大值为"+max);
            System.out.println("这个数组的最小值为"+min);
            System.out.println("这个数组的平均值为"+sum/are.length);
        }
    }
