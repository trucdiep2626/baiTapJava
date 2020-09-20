package bai12;

import java.util.Scanner;

public class bai12 {
    //12. Nhập và mảng A, B là mảng 2 chiều. Các phân tử trong mảng là các số nguyên.
    // B có phải là ma trận nghịch đảo của A hay không?
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
        if(dongA==cotA && dongB==cotB)
        {
            int [][] c = new int [dongA][cotB];
            for(int i = 0; i < dongA; ++i) {
                for(int j = 0; j < cotB; ++j) {
                    for (int k=0;k<cotA;k++) {

                        c[i][j] += a[i][k] * b[k][j];
                    }
                }
            }
            int [][] d = new int [dongB][cotA];
            for(int i = 0; i < dongB; ++i) {
                for(int j = 0; j < cotA; ++j) {
                    for (int k=0;k<cotB;k++) {

                        d[i][j] += b[i][k] * a[k][j];
                    }
                }
            }
            int flag=0;
            for(int i = 0; i < dongA; ++i) {
                for(int j = 0; j < cotB; ++j) {
                    if(i==j)
                    {
                        if(c[i][j]==1 && d[i][j]==1)
                            flag++;
                    }
                    else
                    {
                        if(c[i][j]==0 && d[i][j]==0)
                            flag++;
                    }
                }
            }
            if(flag!=(dongA*cotA))
            {
                System.out.println("khong la ma tran nghich dao");
            }
            else
            {
                System.out.println("la ma tran nghich dao");
            }
        }
        else
            System.out.println("khong la ma tran nghich dao");
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
