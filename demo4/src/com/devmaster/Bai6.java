package com.devmaster;

import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so phan tu cua mang n:");
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap phan tu thu " + i);
            a[i] = scanner.nextInt();
        }
        System.out.print("Cac so hoan hao trong mang la: ");
        for (int i = 0; i < n; i++) {
            if (Sohoanhao(a[i])) {
                System.out.print(a[i] + " ");
            }
        }
    }
    public static boolean Sohoanhao(int n)
    {
        int s = 0;
        for (int i = 1; i < n; i++)
            if (n % i == 0)
                s=s+i;
        if (s == n)
            return true;
        return false;
    }
}
