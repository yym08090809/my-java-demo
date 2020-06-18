package com.lcx.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Copy {
    public static void main(String[] args) throws Exception
    {
        FileInputStream in = new FileInputStream("F:\\29LRNOE1YK - for 2018.1 or later.txt");// 内存中的
        FileOutputStream out = new FileOutputStream("F:\\out.txt");
        // 缓冲区
        BufferedInputStream bis = new BufferedInputStream(in);
        BufferedOutputStream bos = new BufferedOutputStream(out);
        int len;
        byte[] buffer = new byte[1024];
        long beginTime = System.currentTimeMillis();
        while ((len = bis.read()) != -1)
        {
            bos.write(len);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("拷贝费时 " + (endTime - beginTime));
        bos.close();
        bis.close();
        out.close();
        in.close();
    }
}
