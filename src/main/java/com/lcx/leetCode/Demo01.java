package com.lcx.leetCode;

/**
 * 最小的k个数
 *
 * 输入整数数组 arr ，找出其中最小的 k 个数。例如，
 * 输入4、5、1、6、2、7、3、8这8个数字，则最小的4个数字是1、2、3、4。
 */
public class Demo01 {
    public  static  int[] getLeastNumbers(int[] arr, int k) {
        int[] re = new int[k];
        if(arr.length == 0){
            return arr;
        }
        for(int i = 0;i < arr.length; i++){
            for(int j = 0;j < arr.length-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int i = 0; i<k;i++){
            re[i] = arr[i];
        }
        return re;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int k = 2;
        int[] re = getLeastNumbers(arr, k);
        for (int i = 0; i < re.length; i++) {
            System.out.println(re[i]);
        }
    }
}
