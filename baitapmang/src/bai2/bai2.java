package bai2;

import java.util.Scanner;

public class bai2 {
    //2. Sử dụng mảng 1 chiều nhập vào dãy số nguyên gồm n phần tử. Tính tổng các phần tử thuộc mảng.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap n : ");
        int n = sc.nextInt();
        int[] a = new int[n];
        int sum =taoMang(a, n);
        System.out.println("tong cac phan tu = "+sum);
    }
    public static int taoMang(int[] a, int n) {
        Scanner sc = new Scanner(System.in);
        int sum=0;
        for(int i = 0; i < n; ++i) {
            a[i] = sc.nextInt();
            sum+=a[i];
        }
        return sum;
    }


}
