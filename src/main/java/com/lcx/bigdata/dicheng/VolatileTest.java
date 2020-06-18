package com.lcx.bigdata.dicheng;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

class MyData {
    //int number = 0;
    //volatile 实现了线程的可见性 及一个线程将拷贝的值修改后刷回修改了主内存的值，对其他线程可见。
    volatile int number = 0;

    public void addTo60() {
        this.number = 60;
    }

    public void addPulsPuls(){
        number++;
    }

    AtomicInteger atomicInteger = new AtomicInteger();  //默认值是0
    public void myAddAtomic(){
        atomicInteger.getAndIncrement(); //每次加1
    }

}

/**
 * 1. 验证volatile的可见性
 * 1.1 假如 int number = 0；number变量之前没加volatile关键字修饰
 * 1.2 添加了volatile 可以解决可见性问题。
 * 2. 验证volatile不保证原子性
 *  2.1 原子性指的是：不可分割、完整性，也即某个线程正在做某个具体业务时，中间不可被加塞或者被分割
 *      要么同时成功，要么同时失败。
 *  2.2 volatile不保证原子性验证
 *  2.3 why
 *      一个线程在执行完操作后往主内存刷写数据的前一秒，主内存的值被其他线程读取。导致刷回失败。
 *
 *  2.4 如何解决
 *      加synchronized
 *      使用juc下的AtomicInteger
 *      底层使用cas实现
 *
 */
public class VolatileTest {
    public static void main(String[] args) {
        atomicityVerification();
    }

    //volatile  原子性验证   不保证原子性
    private static void atomicityVerification() {
        MyData myData = new MyData();
        //seeOkByVolatile();
        for (int i = 1; i <= 20; i++) {
            new Thread(() -> {
                for(int j=0;j<1000;j++){
                    myData.addPulsPuls();
                    myData.myAddAtomic();
                }
            }, String.valueOf(i)).start();
        }
        //需要等待20个线程计算完成后，再用main线程取得最终的结果值
        while (Thread.activeCount()>2){
            Thread.yield();
        }
        System.out.println(Thread.currentThread().getName()+"\t finally number value: "+myData.number);
        System.out.println(Thread.currentThread().getName()+"\t finally number value: "+myData.atomicInteger);
    }

    //可以保证可见性   及时通知其他线程 主物理内存中的值被修改
    private static void seeOkByVolatile() {
        MyData myData = new MyData();//资源类

        new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + "\t come in");
            //暂停线程
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            myData.addTo60();
            System.out.println(Thread.currentThread().getName() + "\t update number value:" + myData.number);
        }, "AAA").start();
        //第二个线程是main线程
        while (myData.number == 0) {
            //main线程等待，直到number值不为0
        }
        System.out.println(Thread.currentThread().getName() + "\t mission is over");
    }

}
