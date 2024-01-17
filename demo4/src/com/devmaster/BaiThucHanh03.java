package com.devmaster;

import java.util.ArrayList;
import java.util.Collections;

public class BaiThucHanh03 {
    public static void main(String[] args) {
        BaiThucHanh03 demo = new BaiThucHanh03();
        demo.test();
    }
    public void test() {
        ArrayList<String> lstMonHoc = new ArrayList<>();
        lstMonHoc.add("Java");
        lstMonHoc.add("SQL");
        lstMonHoc.add("PHP");
        lstMonHoc.add("C#");
        lstMonHoc.add("Android");
        System.out.println("Danh sach chua sap xep");
        for (int i = 0; i < lstMonHoc.size(); i++) {
            String get = lstMonHoc.get(i);
            System.out.println((i + 1) + " " + get);
        }
        Collections.sort(lstMonHoc);
        System.out.println("Danh sach sau khi sap xep");
        for (int i = 0; i < lstMonHoc.size(); i++) {
            String get = lstMonHoc.get(i);
            System.out.println((i + 1) + " " + get);
        }
    }
}



