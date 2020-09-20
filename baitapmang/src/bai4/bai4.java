package bai4;

import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap n : ");
        int n = sc.nextInt();
        int[] c = new int[n];
        taoMang(c, n);
        int k = sc.nextInt();
        kiemTra(c, n, k);
    }

    public static void taoMang(int[] c, int n) {
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < n; ++i) {
            c[i] = sc.nextInt();
        }

    }

    public static void kiemTra(int[] c, int n, int k) {
        int dem = 0;

        for(int i = 0; i < n; ++i) {
            if (c[i] == k) {
                ++dem;
            }
        }

        if (dem == 0) {
            System.out.println(k + " khong xuat hien trong mang");
        } else {
            System.out.println(k + " xuat hien " + dem + " lan");
        }

    }
}

