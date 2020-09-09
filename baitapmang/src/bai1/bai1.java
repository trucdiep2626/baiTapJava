package bai1;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
//1. Sử dụng mảng 1 chiều nhập vào dãy số nguyên gồm n phần tử.
// Sắp xếp các phần tử theo thứ tự tăng dần, giảm dần ( Sử dụng switch...case).
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap n : ");
        int n = sc.nextInt();
        int[] a = new int[n];
        taoMang(a, n);
        System.out.println("1.Sap xep tang dan");
        System.out.println("2.Sap xep giam dan");
        int chon = sc.nextInt();
        switch (chon)
        {
            case 1:
                sapXepTang(a,n);
                inMang(a,n);
                break;
            case 2:
                sapXepGiam(a,n);
                inMang(a,n);
                break;
        }

    }

    public static void taoMang(int[] a, int n) {
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < n; ++i) {
            a[i] = sc.nextInt();
        }
    }
    public static void inMang(int[] a, int n) {
        for(int i = 0; i < n; ++i) {
            System.out.printf("%4d",a[i]);
        }
    }

    public static void sapXepTang(int [] a, int n) {
        for(int i = 0; i < n; ++i) {
            for(int j = i; j < n; ++j) {
                if(a[i]>a[j])
                {
                    int tmp = a[i];
                    a[i]=a[j];
                    a[j]=tmp;

                }
            }
        }
    }
    public static void sapXepGiam(int [] a, int n) {
        for(int i = 0; i < n; ++i) {
            for(int j = i; j < n; ++j) {
                if(a[i]<a[j])
                {
                    int tmp = a[i];
                    a[i]=a[j];
                    a[j]=tmp;

                }
            }
        }
    }
}
