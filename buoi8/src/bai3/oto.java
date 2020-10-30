package bai3;

import java.util.Scanner;

public class oto extends phuongTien{
    protected int soCho;
    protected String kieuDongCo;

    @Override
    void nhap() {
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.print("Nhap so cho : ");
        soCho=sc.nextInt();
        sc.nextLine();
        System.out.print("Nhap kieu dong co : ");
        kieuDongCo=sc.nextLine();
    }

    @Override
    public String toString() {
        return "oto{" +
                super.toString()+
                "soCho=" + soCho +
                ", kieuDongCo='" + kieuDongCo + '\'' +
                '}';
    }

    public oto() {
    }

    public int getSoCho() {
        return soCho;
    }

    public void setSoCho(int soCho) {
        this.soCho = soCho;
    }

    public String getKieuDongCo() {
        return kieuDongCo;
    }

    public void setKieuDongCo(String kieuDongCo) {
        this.kieuDongCo = kieuDongCo;
    }
}
