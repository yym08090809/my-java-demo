package com.lcx.bigdata.hadoop;

import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

public class IOTest {
    @Test
    public void test() throws Exception {
        String name = "books.txt";
        File file = new File(name);
        //System.out.println(file.exists());
        RandomAccessFile randomAccessFile = new RandomAccessFile(name,"rw");
        int i = randomAccessFile.read();
        System.out.println(i);
        String s = randomAccessFile.readLine();
        System.out.println(s);

    }
}
