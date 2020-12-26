package bai1;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyTaiLieu {
    ArrayList<taiLieu> dstl= new ArrayList<>();
    void inMenu()
    {
        System.out.println("1.Nhap thong tin sach");
        System.out.println("2.Nhap thong tin tap chi");
        System.out.println("3.Nhap thong tin bao");
        System.out.println("4.Hien thi thong tin toan bo tai lieu");
        System.out.println("5.Hien thi thong tin 1 tai lieu");
        System.out.println("6.Thoat");
        System.out.print("Chon chuc nang can su dung : ");
    }
    public void nhapSach()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong sach : ");
        int n=sc.nextInt();
        sc.nextLine();
        for (int i=0;i<n;i++)
        {
            Sach sach=new Sach();
            sach.nhap();
            dstl.add(sach);
        }
    }
    public void nhapTapChi()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong Tap Chi : ");
        int n=sc.nextInt();
        sc.nextLine();
        for (int i=0;i<n;i++)
        {
            TapChi tc=new TapChi();
            tc.nhap();
            dstl.add(tc);
        }
    }
    public void nhapBao()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong bao : ");
        int n=sc.nextInt();
        sc.nextLine();
        for (int i=0;i<n;i++)
        {
            Bao bao=new Bao();
            bao.nhap();
            dstl.add(bao);
        }
    }
    public void inDS()
    {
        for (taiLieu x:dstl) {
            System.out.println(x.toString());
        }
    }
    public void inDSSach()
    {
        for (taiLieu x:dstl) {
            if(x.getLoai()==1)
            System.out.println(x.toString());
        }
    }
    public void inDSTapChi()
    {
        for (taiLieu x:dstl) {
            if(x.getLoai()==2)
                System.out.println(x.toString());
        }
    }
    public void inDsBao()
    {
        for (taiLieu x:dstl) {
            if(x.getLoai()==3)
                System.out.println(x.toString());
        }
    }




}
