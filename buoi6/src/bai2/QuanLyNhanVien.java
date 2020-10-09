package bai2;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyNhanVien {
    ArrayList<NVGiaoHang> gh;
    ArrayList<NVSuaOngNuoc> son;
    ArrayList<NVXeOm> xo;

    public QuanLyNhanVien() {
        gh=new ArrayList<>();
        son=new ArrayList<>();
        xo=new ArrayList<>();
    }
    void inMenu()
    {
        System.out.println("------>MENU<------");
        System.out.println("1.Nhap danh sach nhan vien giao hang");
        System.out.println("2.Nhap danh sach nhan vien sua ong nuoc");
        System.out.println("3.Nhap danh sach nhan vien xe om");
        System.out.println("4.Xuat danh sach nhan vien giao hang");
        System.out.println("5.Xuat danh sach nhan vien sua ong nuoc");
        System.out.println("6.Xuat danh sach nhan vien xe om");
        System.out.println("7.Tong luong cua cac nhan vien");
        System.out.println("8.Thong ke nhan vien giam dan theo luong");
    }
    void nhapNVGiaoHang()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap so luong : ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++) {
            NVGiaoHang nv = new NVGiaoHang();
            nv.nhap();
            gh.add(nv);
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
            son.add(nv);
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
            xo.add(nv);
        }

    }
    void xuatNVGiaoHang()
    {
        for (NVGiaoHang x:gh
             ) {
            System.out.println(x.toString());
        }
    }
    void xuatNVSuaOngNuoc()
    {
        for (NVSuaOngNuoc x:son
        ) {
            System.out.println(x.toString());
        }
    }

    void xuatNVXeOm()
    {
        for (NVXeOm x:xo
        ) {
            System.out.println(x.toString());
        }
    }
    int tinhTongLuong()
    {
        int sum=0;
        for (NVXeOm x:xo
             ) {
            sum+=x.tinhTien();
        }
        for (NVSuaOngNuoc x:son
             ) {
            sum+=x.tinhTien();
        }
        for (NVGiaoHang x :gh
             ) {
            sum+=x.tinhTien();
        }
        return sum;
    }
    void sort()
    {
        for(int i=0;i<gh.size();i++)
        {
            for(int j=i+1;j<gh.size();j++)
            {
                if (gh.get(i).tinhTien()<gh.get(j).tinhTien()) {
                    NVGiaoHang t = new NVGiaoHang();
                    t = gh.get(i);
                    gh.set(i,gh.get(j));
                    gh.set(j, t);
                }
            }
        }
        for(int i=0;i<son.size();i++)
        {
            for(int j=i+1;j<son.size();j++)
            {
                if (son.get(i).tinhTien()<son.get(j).tinhTien()) {
                    NVSuaOngNuoc t = new NVSuaOngNuoc();
                    t = son.get(i);
                    son.set(i,son.get(j));
                    son.set(j, t);
                }
            }
        }
        for(int i=0;i<xo.size();i++)
        {
            for(int j=i+1;j<xo.size();j++)
            {
                if (xo.get(i).tinhTien()<xo.get(j).tinhTien()) {
                    NVXeOm t = new NVXeOm();
                    t = xo.get(i);
                    xo.set(i,xo.get(j));
                    xo.set(j, t);
                }
            }
        }
    }
}
