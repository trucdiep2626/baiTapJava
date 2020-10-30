package bai3;

import java.util.Scanner;

public class phuongTien {

    protected String hangSX;
    protected int nam;
    protected int giaBan;
    protected String mau;

    public phuongTien() {
    }
    void nhap()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap hang san xuat : ");
        hangSX=sc.nextLine();
        System.out.print("Nhap nam san xuat : ");
        nam=sc.nextInt();
        System.out.print("Nhap gia ban : ");
        giaBan=sc.nextInt();
        sc.nextInt();
        System.out.print("Nhap mau : ");
        mau=sc.nextLine();
    }

    @Override
    public String toString() {
        return
                "hangSX='" + hangSX + '\'' +
                ", nam=" + nam +
                ", giaBan=" + giaBan +
                ", mau='" + mau + '\'' ;
    }

    public String getHangSX() {
        return hangSX;
    }

    public void setHangSX(String hangSX) {
        this.hangSX = hangSX;
    }

    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }

    public int getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(int giaBan) {
        this.giaBan = giaBan;
    }

    public String getMau() {
        return mau;
    }

    public void setMau(String mau) {
        this.mau = mau;
    }
}
