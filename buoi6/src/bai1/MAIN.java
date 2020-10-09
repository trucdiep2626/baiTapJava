package bai1;

import java.util.Scanner;

public class MAIN {


    public static void main(String[] args) {
        QuanLyThuVien qltv = new QuanLyThuVien();
        Scanner sc = new Scanner(System.in);
        while (true)
        {
            qltv.inMenu();
            int chon=sc.nextInt();
            sc.nextLine();
            switch (chon)
            {
                case 1:
                    qltv.nhapDSTreEm();
                    break;
                case 2:
                    qltv.nhapDSNguoiLon();
                    break;
                case 3:
                    qltv.xuatDSTreEm();
                    break;
                case 4:
                    qltv.xuatDSNguoiLon();
                    break;
                case 5:
                    System.out.println("Tong tien lam the "+ qltv.tinhTongTien());
                    break;
                case 0: return;

                default:
                    System.out.println("Nhap chuc nang tu 1 den 5 ");
                    break;
            }
        }
    }
}
