package com.lcx.sort;

public class HeapSort {
    //声明全局变量，用于记录数组array的长度；
    static int len;

    /**
     * 堆排序算法
     * @param arr
     * @return
     */
    public static int[] heapSort(int[] arr){
        len = arr.length;
        if(len <1){
            return arr;
        }
        //1.构建一个最大堆
        buildMaxHeap(arr);
        //2.循环将堆首位（最大值）与末位交换，然后在重新调整最大堆
        while (len>0){
            swap(arr,0,len-1);
            len--;
            adjustHeap(arr,0);
        }
        return arr;
    }

    private static void buildMaxHeap(int[] arr) {
        //从最后一个非叶子节点开始向上构造最大堆
        for (int i = (len -1)/2; i >=0; i--) {
            adjustHeap(arr,i);
        }
    }

    /**
     * 调整使之成为最大堆
     *
     * @param arr
     * @param i
     */
    private static void adjustHeap(int[] arr, int i) {
        int maxIndex = i;
        //如果有左子树，且左子树大于父节点，则将最大指针指向左子树
        if (i * 2 < len && arr[i * 2] > arr[maxIndex]){
            maxIndex = i * 2;
        }
        //如果有右子树，且右子树大于父节点，则将最大指针指向右子树
        if (i * 2 + 1 < len && arr[i * 2 + 1] > arr[maxIndex]){
            maxIndex = i * 2 + 1;
        }
        //如果父节点不是最大值，则将父节点与最大值交换，并且递归调整与父节点交换的位置。
        if (maxIndex != i) {
            swap(arr, maxIndex, i);
            adjustHeap(arr, maxIndex);
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    public static void main(String[] args) {
        int[] arr = {8, 2, 7, 3, 6, 43, 5, 9};
        int[] re = heapSort(arr);

        for (int i = 0; i < re.length; i++) {
            System.out.print(re[i] + " ");
        }
    }

}
