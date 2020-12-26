package sinhVien;

import java.util.Scanner;

public class SinhVien {
    Scanner sc = new Scanner(System.in);
    String maSV;
    String ten;
    String queQuan;
    float diemA1;
    float diemA3;
    float diemNL;
    void nhap()
    {
        System.out.println( "Nhap ma sinh vien : ");
        maSV=sc.nextLine();
        System.out.println("Nhap ten sinh vien : ");
        ten=sc.nextLine();
        System.out.println("Nhap que quan : ");
        queQuan=sc.nextLine();
        System.out.println("Nhap diem A3 : ");
        diemA3=sc.nextFloat();
        System.out.println("Nhap diem A1 : ");
        diemA1=sc.nextFloat();
        System.out.println("Nhap diem NL : ");
        diemNL=sc.nextFloat();
    }
    Float diemTB()
    {
        return (diemA3+diemA1+diemNL)/3;
    }
    int tienThiLai()
    {
        int count=0;
        if(diemA1<4)
            count++;
        if(diemA3<4)
            count++;
        if(diemNL<4)
            count++;
        return count;
    }
}

