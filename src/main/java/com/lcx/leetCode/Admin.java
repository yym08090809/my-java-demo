package com.lcx.leetCode;

public class Admin {
    public static void main(String[] args) {
        System.out.println(isAdmin("Admin"));
    }

    private static boolean isAdmin(String admin) {
        System.out.println(admin.toLowerCase().equals("admin"));
        System.out.println(System.identityHashCode("admin"));
        System.out.println(System.identityHashCode(admin.toLowerCase()));
        return admin.toLowerCase()=="admain";
    }
}
