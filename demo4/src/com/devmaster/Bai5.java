package com.devmaster;

import java.util.Scanner;
public class Bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so phan tu cua mang n:");
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap phan tu thu " + i);
            a[i] = scanner.nextInt();
        }
        System.out.print("Cac so nguyen to trong mang la: ");
        for (int i = 0; i < n; i++) {
            if (SNT(a[i])) {
                System.out.print(a[i] + " ");
            }
        }
    }
    public static boolean SNT(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}