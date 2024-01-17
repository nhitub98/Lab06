package com.devmaster;

import java.util.Random;

public class Bai2 {
    public static void main(String[] args) {
        Random random = new Random();
        int[]a = new int[10];
        for (int i = 0; i < 10; i++) {
            a[i] = random.nextInt(20);
        }
        System.out.println("Mang vua nhap ");
        for (int i = 0; i < 10; i++) {
            System.out.printf(a[i] + "\n");
        }
    }
}
