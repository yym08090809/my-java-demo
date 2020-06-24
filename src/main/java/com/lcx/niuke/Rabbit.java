package com.lcx.niuke;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Rabbit {
    /**
     * 统计出兔子总数。
     *
     * @param monthCount 第几个月
     * @return 兔子总数
     */
    public static int getTotalCount(int monthCount) {
        Map<Integer, Integer> map = new HashMap<>();
        int f1=1,f2=1;
            map.put(1,1);
            map.put(2,1);
        for (int i = 3; i <= monthCount; i++) {
            map.put(i,map.get(i-1)+map.get(i-2));
        }
        return map.get(monthCount);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int mountCount = scanner.nextInt();
            System.out.println(getTotalCount(mountCount));
        }
    }
}
