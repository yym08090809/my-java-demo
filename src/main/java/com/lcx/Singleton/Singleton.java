package com.lcx.Singleton;

public class Singleton {
    private Singleton() {

    }
    //volatile  jvm提供的轻量级的同步机制 可见性  不保证原子性   禁止指令重排序
    //jmm
    //加锁前 主内存-》工作内存
    //解锁前  工作内存写入-》主内存


    private static volatile Singleton instace = null;

    public static Singleton getInstance() {
        if (instace == null) {
            synchronized (Singleton.class) {
                if (instace == null) {
                    instace = new Singleton();
                }
            }
        }
        return instace;
    }

    public static void main(String[] args) {
        System.out.println(getInstance());
        System.out.println(getInstance());
    }
}
