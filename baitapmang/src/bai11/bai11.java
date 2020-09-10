package bai11;

import java.util.Scanner;

public class bai11 {
//11. Nhập và mảng A, B là mảng 2 chiều.
// Các phân tử trong mảng là các số nguyên. Tính A x B.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so dong va so cot cua mang A : ");
        int dongA = sc.nextInt();
        int cotA = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap mang A ");
        int[][] a = new int[dongA][cotA];
        taoMang(a, dongA, cotA);
        System.out.println("Nhap so dong va so cot cua mang B : ");
        int dongB = sc.nextInt();
        int cotB = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap mang B ");
        int[][] b = new int[dongB][cotB];
        taoMang(b, dongB, cotB);
        if(cotA==dongB)
        {
            int [][] c = new int [dongA][cotB];
            for(int i = 0; i < dongA; ++i) {
                for(int j = 0; j < cotB; ++j) {
                    for (int k=0;k<cotA;k++) {

                        c[i][j] += a[i][k] * b[k][j];
                    }
                }
            }
            inMang(c,dongA,cotB);
        }
        else
            System.out.println("khong the nhan hai ma tran nay");
        }

    public static void taoMang(int[][] c, int n, int m) {
        Scanner sc = new Scanner(System.in);
            for(int i = 0; i < n; ++i) {
                for(int j = 0; j < m; ++j) {
                    c[i][j] = sc.nextInt();
                }
            }

}
    public static void inMang(int[][] c, int n, int m) {
        for(int i = 0; i < n; ++i) {
            for(int j = 0; j < m; ++j) {
                System.out.printf("%4d",c[i][j]);
            }
            System.out.println();
        }

    }
}
