package bai2;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyNV {
    ArrayList<NhanVien> dsnv=new ArrayList<>();

    public QuanLyNV() {

    }
    void inMenu()
    {
        System.out.println("------>MENU<------");
        System.out.println("1.Nhap danh sach nhan vien giao hang");
        System.out.println("2.Nhap danh sach nhan vien sua ong nuoc");
        System.out.println("3.Nhap danh sach nhan vien xe om");
        //System.out.println("4.Xuat danh sach nhan vien giao hang");
        //System.out.println("5.Xuat danh sach nhan vien sua ong nuoc");
        System.out.println("4.Xuat danh sach nhan vien ");
        System.out.println("5.Tong luong cua cac nhan vien");
        System.out.println("6.Thong ke nhan vien giam dan theo luong");
    }
    void nhapNVGiaoHang()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap so luong : ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++) {
            NVShip nv = new NVShip();
            nv.nhap();
            dsnv.add(nv);
        }

    }
    void nhapNVSuaOngNuoc()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap so luong : ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++) {
            NVSuaOngNuoc nv = new NVSuaOngNuoc();
            nv.nhap();
            dsnv.add(nv);
        }

    }
    void nhapNVXeOm()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap so luong : ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++) {
            NVXeOm nv = new NVXeOm();
            nv.nhap();
            dsnv.add(nv);
        }

    }
//    void xuatNVGiaoHang()
//    {
//        for (NVShip x:dsnv) {
//            System.out.println(x.toString());
//        }
//    }
//    void xuatNVSuaOngNuoc()
//    {
//        for (NVSuaOngNuoc x:dsnv) {
//            System.out.println(x.toString());
//        }
//    }

    void xuatNV()
    {
        for (NhanVien x:dsnv) {
            System.out.println(x.toString());
        }
    }
    int tinhTongLuong()
    {
        int sum=0;
        for (NhanVien x:dsnv
        ) {
            sum+=x.getTienLuong();
        }
//        for (NVSuaOngNuoc x:dsnv) {
//            sum+=x.tinhTien();
//        }
//        for (NVShip x :dsnv) {
//            sum+=x.tinhTien();
//        }
        return sum;
    }
    void sort()
    {
        for(int i=0;i<dsnv.size();i++)
        {
            for(int j=i+1;j<dsnv.size();j++)
            {
                if (dsnv.get(i).getTienLuong()<dsnv.get(j).getTienLuong()) {
                    NhanVien t ;
                    t = dsnv.get(i);
                    dsnv.set(i,dsnv.get(j));
                    dsnv.set(j, t);
                }
            }
        }

    }
}
