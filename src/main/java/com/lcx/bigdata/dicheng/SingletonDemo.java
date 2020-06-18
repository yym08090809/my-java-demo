package com.lcx.bigdata.dicheng;

public class SingletonDemo {
    private SingletonDemo(){
        System.out.println(Thread.currentThread().getName()+"\t 单例");
    }

    //加volatile 多线程下保证线程安全  禁止指令重排序
    private static volatile SingletonDemo instance = null;
    public static SingletonDemo getInstance(){
        if(instance == null){
            synchronized (SingletonDemo.class){
                if(instance == null){
                    instance = new SingletonDemo();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            new Thread(() -> {
                getInstance();
            }, String.valueOf(i)).start();
        }
    }
}
