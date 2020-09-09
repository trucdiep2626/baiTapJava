package bai3;

import java.util.Scanner;
//3. Sử dụng mảng 1 chiều nhập vào dãy số nguyên gồm n phần tử.
// In ra màn hình các phần tử là số nguyên tố.
public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap n : ");
        int n = sc.nextInt();
        int[] c = new int[n];
        taoMang(c, n);
        System.out.print(" so nguyen to trong mang : ");
        lietKeSNT(c, n);
    }

    public static boolean laSNT(int a) {
        if (a < 2) {
            return false;
        } else {
            for(int i = 2; i < a; ++i) {
                if (a % i == 0) {
                    return false;
                }
            }

            return true;
        }
    }

    public static void taoMang(int[] c, int n) {
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < n; ++i) {
            c[i] = sc.nextInt();
        }

    }

    public static void lietKeSNT(int[] c, int n) {
        for(int i = 0; i < n; ++i) {
            if (laSNT(c[i]) ) {
                System.out.print(" " + c[i]);
            }
        }

    }
}

