package Sort;

/**
 * Author：TaiLong
 * created:2019/4/27
 */
public class Chose {
    public static void main(String[] args) {
        int[] arr = new int[]{121, 2, 6, 3, 56, 323, 50, 20};
        sllectSort(arr);
    }

    public static void sllectSort(int[] array) {
        for (int i = 0; i <= array.length; i++) {
            int min = i;
            for (int j = i + 1; j <= array.length; j++) {
                if (array[i] > array[j]) {
                    array[j] = array[i];
                    array[i] = array[min];
                    array[min] = array[j];
                    i++;
                }

            }
            System.out.println(array);
        }
    }
}