package bai1;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyThuVien {
    Scanner sc = new Scanner(System.in);
    ArrayList<DocGia> ds = new ArrayList<>();
    void inMenu()
    {
        System.out.println("------>MENU<------");
        System.out.println("1.Nhập danh sách trẻ em");
        System.out.println("2.Nhập danh sách người lớn");
        System.out.println("3.Xuất danh sách ");
        System.out.println("4.Tính tiền làm thẻ");
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
            TreEm k= new TreEm();
            k.nhap();
            ds.add(k);
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
            NguoiLon k= new NguoiLon();
            k.nhap();
            ds.add(k);
        }
    }

    void xuatDS()
    {
        //System.out.println("Danh sách người lớn");
        for (DocGia x:ds ) {
            System.out.println(x.toString());
        }
    }
    int tinhTongTien()
    {
        int sum=0;
        for (DocGia x:ds)
            sum+=x.getTienLamThe();
        return sum;
    }



    public QuanLyThuVien() {
    }
}
