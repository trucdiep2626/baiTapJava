package bai10;

import java.util.Scanner;

public class bai10 {
    //10. Nhập mảng 2 chiều các số nguyên dương có dạng là ma trận 3x3.
    //Sắp xếp lại các phần tử trong mảng theo thứ tự tăng dần.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[3][3];
        taoMang(a, 3,3);
        int []b=new int [3*3];
        int k=0;
        for(int i = 0; i < 3; ++i) {
            for(int j = 0; j < 3; ++j) {
                b[k]=a[i][j];
                k++;
            }
        }
        sapXepTang(b,3*3);
        k=0;
        for(int i = 0; i < 3; ++i) {
            for(int j = 0; j < 3; ++j) {
                a[i][j]=b[k];
                k++;
            }
        }
        inMang(a,3,3);
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
