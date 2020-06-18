package com.lcx.niuke;

import java.util.Scanner;

/**
 * 给出一个正整数N和长度L，找出一段长度大于等于L的连续非负整数，他们的和恰好为N。答案可能有多个，我我们需要找出长度最小的那个。
 * 例如 N = 18 L = 2：
 * 5 + 6 + 7 = 18
 * 3 + 4 + 5 + 6 = 18
 * 都是满足要求的，但是我们输出更短的 5 6 7
 */
public class Demo01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int l = scanner.nextInt();
        System.out.println(minOut(n, l));
        System.out.println(minOut1(n,l));
    }

    private static String minOut1(int n, int l) {
        return null;
    }

    private static String minOut(int n, int l) {
        long start = 0;
        String shortLine = "";
        for (int i = l; i <= 100; i++) {
            if (2 * n % i == 0) {
                long firstResult = (long) 2 * n / i + 1 - i;
                if (firstResult % 2 == 0) {
                    start = firstResult / 2;
                    for (int j = 0; j < i; j++) {
                        if (j < i - 1) {
                            shortLine += start + j + " ";
                        } else {
                            shortLine += start + j + "";
                        }
                    }
                    return shortLine;
                }
            }
        }
        return "No";
    }
}
