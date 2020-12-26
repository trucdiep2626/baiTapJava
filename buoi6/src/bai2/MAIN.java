package bai2;


import java.util.Scanner;

public class MAIN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuanLyNhanVien qlnv = new QuanLyNhanVien();
        while (true)
        {
            qlnv.inMenu();
            int chon=sc.nextInt();
            switch (chon)
            {
                case 1:
                    qlnv.nhapNVGiaoHang();
                    break;
                case 2:
                    qlnv.nhapNVSuaOngNuoc();
                    break;
                case 3:
                    qlnv.nhapNVXeOm();
                    break;
                case 4:
                    qlnv.xuatNVGiaoHang();
                    break;
                case 5:
                    qlnv.xuatNVSuaOngNuoc();
                    break;
                case 6:
                    qlnv.xuatNVXeOm();
                    break;
                case 7:
                    System.out.println("Tong luong "+qlnv.tinhTongLuong());
                    break;
                case 8:
                    qlnv.sort();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Chon chuc nang tu 1 den 8 ");
                    break;
            }
        }
    }
}
