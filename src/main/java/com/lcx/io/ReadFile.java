package com.lcx.io;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    public static void main(String[] args) {
        File file = new File("src/1.txt");
        FileInputStream fis = null;
        BufferedReader br = null;
        List<String> list = new ArrayList<>();


        try {
            fis = new FileInputStream(file);
            br = new BufferedReader(new InputStreamReader(fis));
            String line = null;
            while ((line = br.readLine()) != null) {
                list.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

        for (String s:list) {
            System.out.println(s);
        }
    }


}
