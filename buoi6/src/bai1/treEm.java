package bai1;

import java.util.Scanner;

public class treEm extends docGia {
    private String nguoiDaiDien;
    @Override
    void nhap() {
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.print("Nhap ten nguoi dai dien : ");
        nguoiDaiDien=sc.nextLine();
    }

    public String getNguoiDaiDien() {
        return nguoiDaiDien;
    }

    public void setNguoiDaiDien(String nguoiDaiDien) {
        this.nguoiDaiDien = nguoiDaiDien;
    }

    public treEm() {
    }
    public int tinhTien()
    {
        return getThangConHieuLuc()*5000;
    }
    @Override
    public String toString() {
        return "treEm{" +
                super.toString()+
                "nguoiDaiDien='" + nguoiDaiDien + '\'' +
                '}';
    }
}