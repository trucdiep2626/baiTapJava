package bai1;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyThuVien {
    Scanner sc = new Scanner(System.in);
    ArrayList<treEm> te;
    ArrayList<nguoiLon> nl;
    void inMenu()
    {
        System.out.println("------>MENU<------");
        System.out.println("1.Nhập danh sách trẻ em");
        System.out.println("2.Nhập danh sách người lớn");
        System.out.println("3.Xuất danh sách trẻ em");
        System.out.println("4.Xuất danh sách người lớn");
        System.out.println("5.Tính tiền làm thẻ");
        System.out.println("Chọn chức năng cần sử dụng");
    }
    void nhapDSTreEm()
    {
        System.out.print("Nhập số lượng trẻ em : ");
        int n=sc.nextInt();
        sc.nextLine();
        for (int i=0;i<n;i++)
        {
            System.out.println("Nhập trẻ em thứ "+(i+1));
            treEm k= new treEm();
            k.nhap();
            te.add(k);
        }
    }
    void nhapDSNguoiLon()
    {
        System.out.print("Nhập số lượng người lớn : ");
        int n=sc.nextInt();
        sc.nextLine();
        for (int i=0;i<n;i++)
        {
            System.out.println("Nhập người lớn thứ "+(i+1));
            nguoiLon k= new nguoiLon();
            k.nhap();
            nl.add(k);
        }
    }
    void xuatDSTreEm()
    {
        System.out.println("Danh sách trẻ em");
        for (treEm x:te ) {
            System.out.println(x.toString());
        }
    }
    void xuatDSNguoiLon()
    {
        System.out.println("Danh sách người lớn");
        for (nguoiLon x:nl ) {
            System.out.println(x.toString());
        }
    }
    int tinhTongTien()
    {
        int sum=0;
        for (treEm x:te)
            sum+=x.tinhTien();
        for (nguoiLon x:nl)
            sum+=x.tinhTien();
        return sum;
    }



    public QuanLyThuVien() {
        te=new ArrayList<>();
        nl=new ArrayList<>();
    }
}
