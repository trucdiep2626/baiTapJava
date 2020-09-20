package bai8;

import java.util.Scanner;

public class bai8 {
    public static void main(String[] args) {
        //8. Sử dụng mảng 1 chiều in ra dãy số Fibonasi với n phần tử (n>0 )
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap n : ");
        int n = sc.nextInt();
        int[] c = new int[n];
        taoMang(c, n);
        inMang(c,n);
    }

    public static void taoMang(int[] c, int n) {
        for(int i = 0; i < n; ++i) {
            if(i==0 || i==1)
                c[i]=1;
            else
                c[i]=c[i-1]+c[i-2];
        }

    }
    public static void inMang(int[] c, int n) {
        for(int i = 0; i < n; ++i) {
            System.out.printf("%4d",c[i]);
        }

    }

}
