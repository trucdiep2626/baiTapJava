package bai1;

import java.util.Scanner;

public class taiLieu {
    private int MaTaiLieu;
    private String tenNXB;
    private int soBan;
    private int Loai;

    public int getLoai() {
        return Loai;
    }

    public void setLoai(int loai) {
        Loai = loai;
    }

    public taiLieu() {
    }

    public int getMaTaiLieu() {
        return MaTaiLieu;
    }

    public void setMaTaiLieu(int maTaiLieu) {
        MaTaiLieu = maTaiLieu;
    }

    public String getTenNXB() {
        return tenNXB;
    }

    public void setTenNXB(String tenNXB) {
        this.tenNXB = tenNXB;
    }

    public int getSoBan() {
        return soBan;
    }

    public void setSoBan(int soBan) {
        this.soBan = soBan;
    }
    public void nhap()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma : ");
        MaTaiLieu=sc.nextInt();
        sc.nextLine();
        System.out.print("Nhap ten NXB : ");
        tenNXB=sc.nextLine();
        System.out.print("Nhap so ban : ");
        soBan=sc.nextInt();
        sc.nextLine();
    }

    @Override
    public String toString() {
        return  "MaTaiLieu=" + MaTaiLieu +
                ", tenNXB='" + tenNXB + '\'' +
                ", soBan=" + soBan ;
    }
}
