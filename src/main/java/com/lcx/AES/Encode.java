package com.lcx.AES;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.codec.binary.Base64;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author 李松柏
 * @createTime 2020/8/26 12:54
 * @description 使用AES加密，算法模式为ECB
 */
public class Encode {
    // 加密
    public static String Encrypt(String sSrc, String sKey) throws Exception {
        if (sKey == null) {
            System.out.print("Key为空null");
            return null;
        }
        // 判断Key是否为16位
        if (sKey.length() != 16) {
            System.out.print("Key长度不是16位");
            return null;
        }
        byte[] raw = sKey.getBytes("utf-8");
        SecretKeySpec skeySpec = new SecretKeySpec(raw, "AES");
        Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");//"算法/模式/补码方式"
        cipher.init(Cipher.ENCRYPT_MODE, skeySpec);
        byte[] encrypted = cipher.doFinal(sSrc.getBytes("utf-8"));

        return new Base64().encodeToString(encrypted);//此处使用BASE64做转码功能，同时能起到2次加密的作用。
    }

    // 解密
    public static String Decrypt(String sSrc, String sKey) throws Exception {
        try {
            // 判断Key是否正确
            if (sKey == null) {
                System.out.print("Key为空null");
                return null;
            }
            // 判断Key是否为16位
            if (sKey.length() != 16) {
                System.out.print("Key长度不是16位");
                return null;
            }
            byte[] raw = sKey.getBytes("utf-8");
            SecretKeySpec skeySpec = new SecretKeySpec(raw, "AES");
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            cipher.init(Cipher.DECRYPT_MODE, skeySpec);
            byte[] encrypted1 = new Base64().decode(sSrc);//先用base64解密
            try {
                byte[] original = cipher.doFinal(encrypted1);
                String originalString = new String(original,"utf-8");
                return originalString;
            } catch (Exception e) {
                System.out.println(e.toString());
                return null;
            }
        } catch (Exception ex) {
            System.out.println(ex.toString());
            return null;
        }
    }

    //读文件 (一次读完整个文件)
    public static String readFile(String srcFile){
        try {
            FileInputStream fis = new FileInputStream(srcFile);
            int iAvail = fis.available();
            byte[] bytes = new byte[iAvail];
            fis.read(bytes);
            fis.close();
            return new String(bytes);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }


    public static void main(String[] args) throws Exception {
        /*
         * 此处使用AES-128-ECB加密模式，key需要为16位。
         */
        String cKey = "1234567890123456";
//        // 需要加密的字串
//        String srcFile = "G:\\bigdata\\项目\\mySSM\\SQL\\c2c.sql";
//        String words = readFile(srcFile);
//        System.out.println(words);

        String cSrc = "www.gowhere.so";
        System.out.println(cSrc);
        // 加密
        String enString = Encode.Encrypt(cSrc, cKey);
        System.out.println("加密后的字串是：" + enString);

        // 解密
        String DeString = Encode.Decrypt(enString, cKey);
        System.out.println("解密后的字串是：" + DeString);
    }
}

