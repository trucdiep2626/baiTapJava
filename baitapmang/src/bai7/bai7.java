package bai7;

import java.util.Scanner;

public class bai7 {
    public static void main(String[] args) {
        //7. Sử dụng mảng 1 chiều nhập vào dãy số nguyên gồm n phần tử.
        // In ra phần tử MAX, MIN và số thứ tự của chúng trong dãy
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap n : ");
        int n = sc.nextInt();
        int[] c = new int[n];
        taoMang(c, n);
        int k = sc.nextInt();
    }
    public static void taoMang(int[] c, int n) {
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < n; ++i) {
            c[i] = sc.nextInt();
        }
    }
    public static void inMang(int[] c, int n) {
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < n; ++i) {
            c[i] = sc.nextInt();
        }
    }
}
