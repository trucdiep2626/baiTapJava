package sanPham;

import java.util.Scanner;

public class sanPham {
    Scanner sc = new Scanner(System.in);
    String maSP;
    String tenSP;
    int giaMuaVao;
    int giaBan;
    float Soluong;
    float tinhLai(float sl)
    {
        return sl*(giaBan-giaMuaVao);
    }
    void nhap()
    {
        System.out.print("Nhap ma san pham : ");
        maSP=sc.nextLine();
        System.out.print("Nhap ten san pham : ");
        tenSP=sc.nextLine();
        System.out.print("Nhap gia mua vao : ");
        giaMuaVao=sc.nextInt();
        System.out.print("Nhap gia ban : ");
        giaBan=sc.nextInt();
        System.out.print("Nhap so luong san pham : ");
        Soluong=sc.nextFloat();
    }

}
