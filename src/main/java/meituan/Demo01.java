package meituan;

import jdk.internal.org.objectweb.asm.tree.IntInsnNode;

import java.util.Scanner;

/**
 * 题目描述:
 * <p>
 * 现在一-共有n个任务可以完成。对于每个任务，都有k个子任务可以做。并且第I个子任务需要花费的时间是t。
 * 我们可以认为一个子任务需要的时间只和这个子任务是第几个子任务有关，
 * <p>
 * 而不和这是属于哪个任务有关。也就是说n个任务的第i个子任务需要的时间都是一样的。
 * <p>
 * 每个任务都只可以完成一一次， 同时每个子任务也只能完成一-次， 任何任务都不能重复完成。
 * 每当你完成一个子任务你会获得p分， 而当你完成一个任务的k个子任务后， 你会获得额外的q分，
 * 也就是说你会获得pk+q分。
 * <p>
 * 现在你共有m的时间，你需要求出最大的得分。
 * <p>
 * 输入
 * <p>
 * 第一行三个整数n，k, m. (1<=n<=100,1<=k<=100)(0<=m<=2e9)
 * <p>
 * 第二行两个整数p，q. (1<=p,q<=100)
 * <p>
 * 第三行k个整数表示每个子任务需要的时间。(1=< t<=1e16)
 * <p>
 * 输出
 * <p>
 * 输出在m的时间内能获得的最大得分。
 * <p>
 * 样例输入
 * <p>
 * 3 2 8
 * <p>
 * 3 1
 * <p>
 * 9 5
 * <p>
 * 祥例输出
 * <p>
 * 3
 */
public class Demo01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int m = scanner.nextInt();

        int p = scanner.nextInt();
        int q = scanner.nextInt();

        int[] arr = new int[k];
        for (int i = 0; i < k; i++) {
            arr[i] = scanner.nextInt();
        }
        int count = 0;
        int totalTime = m;
        //判断能执行几个任务
        //执行完一个任务下的所有子任务需要的时间
        int time = 0;
        for (int i = 0; i < k; i++) {
            time += arr[i];
        }
        int qnumber = totalTime / time;
//        //记录执行子任务个数
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < k; j++) {
//                if(totalTime<arr[j]){
//                    continue;
//                }else {
//                    totalTime -= arr[j];
//                    count++;
//                }
//            }
//        }
//        int re =count*p +qnumber*q ;
//        System.out.println(re);
        //对子任务耗时进行升序排序
        int temp = 0;
        for (int i = 0; i < k-1; i++) {
            if (arr[i] > arr[i + 1]) {
                temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        for (int i = 0; i < k; i++) {
            System.out.println(arr[i]);
        }
    }

}
