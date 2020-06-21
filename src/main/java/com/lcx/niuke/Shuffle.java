package com.lcx.niuke;

import java.util.ArrayList;
import java.util.Scanner;

//洗牌
public class Shuffle {
    public static void main(String[] args) {
        //input
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()){
            int T = sc.nextInt();
            for (int i = 0; i < T; i++) {
                int n = sc.nextInt();
                int k = sc.nextInt();
                ArrayList<Integer> card = new ArrayList<>();
                for (int j = 0; j < 2 * n; j++) {
                    card.add(sc.nextInt());
                }
                ShuffleCord(card, k, n);
            }
        }
    }

    private static void ShuffleCord(ArrayList<Integer> card, int k, int n) {
        ArrayList<Integer> LeftCard = new ArrayList<>();
        ArrayList<Integer> RightCard = new ArrayList<>();
        while (k > 0) {
            //初始化左边手牌
            for (int i = 0; i < n; i++) {
                LeftCard.add(card.get(i));
            }
            //右边
            for (int i = n; i < 2 * n; i++) {
                RightCard.add(card.get(i));
            }
            //洗牌   洗牌前将cord清空 否则洗牌后的顺序将在index=7的位置添加
            card.clear();
            for (int i = 0; i < n; i++) {
                card.add(LeftCard.get(i));
                card.add(RightCard.get(i));
            }
            k--;
            //同理 完成一波洗牌后 将左右手牌清空
            LeftCard.clear();
            RightCard.clear();
        }
        for (int r:card) {
            System.out.print(r+" ");
        }
        System.out.println();
    }
}
