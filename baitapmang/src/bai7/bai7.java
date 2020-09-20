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
        int min =c[0],max=c[0];
        int vtmin=0,vtmax=0;
        for(int i = 0; i < n; ++i) {
            if(min>c[i])
            {
                min=c[i];
                vtmin=i;
            }
            if(max<c[i])
            {
                max=c[i];
                vtmax=i;
            }
        }
        System.out.println("MAX = "+max+" o vi tri "+vtmax);
        System.out.println("MIN = "+min+" o vi tri "+vtmin);
    }
    public static void taoMang(int[] c, int n) {
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < n; ++i) {
            c[i] = sc.nextInt();
        }
    }

}
