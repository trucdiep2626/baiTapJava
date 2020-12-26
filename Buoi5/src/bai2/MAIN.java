package bai2;

import java.util.Scanner;

public class MAIN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap thong tin sach ");
        sach s1= new sach(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextInt(),sc.nextInt(),sc.nextInt());
        sc.nextLine();
        System.out.println("Nhap thong tin tap chi ");
        tapChi tp= new tapChi(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextInt(),sc.nextInt());
        sc.nextLine();
        System.out.println(s1.toString());
        System.out.println(tp.toString());
        if(tp.getTenNXB().compareTo(s1.getTenNXB())==0)
            System.out.println(tp.getTenNXB());
        if(tp.getNgayXB()==s1.getNamXB())
            System.out.println(tp.getNgayXB());
    }
}
