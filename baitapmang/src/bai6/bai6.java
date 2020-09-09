package bai6;

import java.util.Scanner;
//Sử dụng mảng 1 chiều nhập vào dãy số nguyên dương gồm n phần tử.
// Sắp xếp lại dãy số theo dạng, nửa đầu của dãy là các số nguyên dương theo thứ tự tăng dần, nửa sau của dãy là các số nguyên âm sắp xếp theo thứ tự giảm dần.
//INPUT: -3, 4, 6, -5, 3, 8, -2, -1
//OUTPUT: 3, 4, 6, 8, -1, -2, -3, -5
public class bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap n : ");
        int n = sc.nextInt();
        int[] c = new int[n];
        taoMang(c, n);
        sapXepTang(c,n);
        hienThiMang(c,n);
        int k = tim(c, n);
        //mang so am
        int[] a = new int[k + 1];
        System.arraycopy(c,0,a,0,k+1);
        sapXepGiam(a,k+1);
        //mang so duong
        int[] b = new int[n - k];
        System.arraycopy(c,k+1,b,0,n-k-1);
        //copy vao mang ban dau
        System.arraycopy(b,0,c,0,b.length);
        System.arraycopy(a,0,c,n-k-1,a.length);

        hienThiMang(c,n);
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
    public static int tim(int[] c, int n) {
        for(int i = 0; i < n; ++i) {
            if (c[i] < 0 && (c[i + 1] > 0 || c[i + 1] == 0)) {
                return i;
            }
        }

        return 0;
    }

    public static void taoMang(int[] c, int n) {
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < n; ++i) {
            c[i] = sc.nextInt();
        }

    }

    public static void hienThiMang(int[] c, int n) {
        for(int i = 0; i < n; ++i) {
            System.out.printf("%4d", c[i]);
        }
        System.out.println();
    }
}
