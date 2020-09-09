package bai5;

import java.util.Scanner;

public class bai5 {
    public bai5() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap n : ");
        int n = sc.nextInt();
        int[] c = new int[n];
        taoMang(c, n);
        int k = sc.nextInt();
        System.out.print(" so o vi tri " + k + " trong mang : " + c[k]);
    }

    public static void taoMang(int[] c, int n) {
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < n; ++i) {
            c[i] = sc.nextInt();
        }

    }
}

