package Sort;

import java.util.Arrays;

/**
 * Author：TaiLong
 * created:2019/5/13
 */
public class HeapTree {
    private static void heapify(int[] tree, int index) {
        /**
         * 1判断index是不是叶子结点
         * 2.判断是不是完全二叉树，判断有没有左孩子
         */
        int left;
        left = 2 * index + 1;
        if (left >= tree.length) {
            return;
        }


        /**
         * 1不是叶子节点，则说明一定有左孩子；
         * 2找到最大的那个孩子
         */
        int right = 2 * index + 2;
        int max=left;
        if(right<tree.length&&tree[right]>tree[left]){
            max=right;
        }
        /**
         * 和根的值进行比较，
         */
        if (tree[max]<tree[index]){
            return;
            }
            int t=tree[index];
        tree[index]=tree[max];
        tree[max]=t;
        //采用递归，继续向下调整
        heapify(tree,max);
    }
    public  static void main(String[] args){
        int[] trees=new int[]{12,4,52,15,4,36,5,6,5,21,55,48545,12};
        heapify(trees,0);
        System.out.println(Arrays.toString(trees));

    }

}