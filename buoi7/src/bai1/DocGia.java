package bai1;

import java.util.Scanner;

public class DocGia {
    private String hoTen;
    private String ngayLapThe;
    private int thangConHieuLuc;
    private int tienLamThe;

    public int getTienLamThe() {
        return tienLamThe;
    }

    public void setTienLamThe(int tienLamThe) {
        this.tienLamThe = tienLamThe;
    }

    void nhap()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ho va ten : ");
        hoTen=sc.nextLine();
        System.out.print("Nhap ngay lap the : ");
        ngayLapThe=sc.nextLine();
        System.out.print("Nhap so thang con hieu luc : ");
        thangConHieuLuc=sc.nextInt();
        sc.nextLine();
    }


    public DocGia() {
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgayLapThe() {
        return ngayLapThe;
    }

    public void setNgayLapThe(String ngayLapThe) {
        this.ngayLapThe = ngayLapThe;
    }

    public int getThangConHieuLuc() {
        return thangConHieuLuc;
    }

    public void setThangConHieuLuc(int thangConHieuLuc) {
        this.thangConHieuLuc = thangConHieuLuc;
    }

    @Override
    public String toString() {
        return  "hoTen='" + hoTen + '\'' +
                ", ngayLapThe='" + ngayLapThe + '\'' +
                ", thangConHieuLuc=" + thangConHieuLuc +
                ", tienLamThe=" + tienLamThe ;
    }
}
