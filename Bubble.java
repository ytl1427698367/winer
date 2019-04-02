/**
 * Author：TaiLong
 * created:2019/3/30
 */
public class Bubble {
    public static void bubbleSort(int[] array){
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array.length-2-i;j++){
                if(array[j]>array[j+1]){
                    int t=array[j];
                    array[j]=array[j+1];
                    array[j+1]=t;
                }
            }
        }
    }

    public static void main(String[] args) {

    }
}
