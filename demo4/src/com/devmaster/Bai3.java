package com.devmaster;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhap so phan tu cua mang n:");
            int n = scanner.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                System.out.println("Nhap phan tu thu " + i);
                a[i] = scanner.nextInt();
            }
        for (int i = 0; i < n; i++) {
            System.out.println(a[i] + "");
            }
        }
    }
