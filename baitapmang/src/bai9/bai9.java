package bai9;

import java.util.Scanner;

public class bai9 {

        //9. Nhập mảng 2 chiều các số nguyên có dạng ma trận 3x4.
        // Liệt kê các phần tử là số nguyên tố trong có trong mảng.
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int[][] a = new int[3][4];
            taoMang(a, 3,4);
            System.out.print(" so nguyen to trong mang : ");
            lietKeSNT(a, 3,4);
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

    public static void taoMang(int[][] c, int n, int m) {
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < n; ++i) {
            for(int j = 0; j < m; ++j) {
                c[i][j] = sc.nextInt();
            }

        }

    }

    public static void lietKeSNT(int[][] c, int n, int m) {
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                if (laSNT(c[i][j]) ) {
                    System.out.print(" " + c[i][j]);
                }
            }

        }
    }
}
