package bai1;

import java.util.Scanner;

public class MAIN {
    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        System.out.println("Nhap thong tin sinh vien : ");
        System.out.print("Nhap ho ten : ");
        String ten=sc.nextLine() ;
        System.out.print("Nhap nam sinh : ");
        int namSinh=sc.nextInt();
        sc.nextLine();
        System.out.print("Nhap que quan : ");
        String queQuan=sc.nextLine();
        System.out.print("Nhap gioi tinh : ");
        Boolean gioiTinh=sc.nextBoolean();
        sc.nextLine();
        System.out.print("Nhap ma lop : ");
        String maLop=sc.nextLine();
        System.out.print("Nhap nganh hoc : ");
        String nganhHoc=sc.nextLine();
        System.out.print("Nhap khoa : ");
        String khoa=sc.nextLine();

        SinhVien sv1 = new SinhVien(ten,namSinh,queQuan,gioiTinh,maLop,nganhHoc,khoa);

        System.out.println("Nhap thong tin sinh vien : ");
        System.out.print("Nhap ho ten : ");
        ten=sc.nextLine() ;
        System.out.print("Nhap nam sinh : ");
        namSinh=sc.nextInt();
        sc.nextLine();
        System.out.print("Nhap que quan : ");
        queQuan=sc.nextLine();
        System.out.print("Nhap gioi tinh : ");
        gioiTinh=sc.nextBoolean();
        sc.nextLine();
        System.out.print("Nhap ma lop : ");
        maLop=sc.nextLine();
        System.out.print("Nhap nganh hoc : ");
        nganhHoc=sc.nextLine();
        System.out.print("Nhap khoa : ");
        khoa=sc.nextLine();
        SinhVien sv2 = new SinhVien(ten,namSinh,queQuan,gioiTinh,maLop,nganhHoc,khoa);

        System.out.println("Nhap thong tin giang vien : ");

        System.out.print("Nhap ho ten : ");
        ten=sc.nextLine() ;
        System.out.print("Nhap nam sinh : ");
         namSinh=sc.nextInt();
        sc.nextLine();
        System.out.print("Nhap que quan : ");
         queQuan=sc.nextLine();
        System.out.print("Nhap gioi tinh : ");
         gioiTinh=sc.nextBoolean();
         sc.nextLine();
        System.out.print("Nhap khoa : ");
        khoa=sc.nextLine();
        System.out.print("Nhap mon hoc : ");
         String monHoc=sc.nextLine();
        System.out.print("Nhap nam kinh nghiem : ");
        int namKinhNghiem=sc.nextInt();
        sc.nextLine();
        GiangVien gv1 = new GiangVien(ten,namSinh,queQuan,gioiTinh,khoa,monHoc,namKinhNghiem);
        System.out.println("Nhap thong tin giang vien : ");

        System.out.print("Nhap ho ten : ");
        ten=sc.nextLine() ;
        System.out.print("Nhap nam sinh : ");
        namSinh=sc.nextInt();
        sc.nextLine();
        System.out.print("Nhap que quan : ");
        queQuan=sc.nextLine();
        System.out.print("Nhap gioi tinh : ");
        gioiTinh=sc.nextBoolean();
        sc.nextLine();
        System.out.print("Nhap khoa : ");
        khoa=sc.nextLine();
        System.out.print("Nhap mon hoc : ");
        String monHoc=sc.nextLine();
        System.out.print("Nhap nam kinh nghiem : ");
        int namKinhNghiem=sc.nextInt();
        sc.nextLine();
        GiangVien gv2 = new GiangVien(ten,namSinh,queQuan,gioiTinh,khoa,monHoc,namKinhNghiem);
        if(sv1.getGioiTinh()==false)
        System.out.println(sv1.toString());
        if(sv2.getGioiTinh()==false)
            System.out.println(sv2.toString());
        if(gv1.getGioiTinh()==false)
        System.out.println(gv1.toString());
        if(gv2.getGioiTinh()==false)
            System.out.println(gv2.toString());
        if(gv1.getKhoa().compareTo(sv1.getKhoa())==0)
            System.out.println("Sinh vien "+sv1.getHoTen()+"co co hoi hoc giang vien "+gv1.getHoTen());
        else
            System.out.println("Sinh vien "+sv1.getHoTen()+"khong co co hoi hoc giang vien "+gv1.getHoTen());
    }
}
