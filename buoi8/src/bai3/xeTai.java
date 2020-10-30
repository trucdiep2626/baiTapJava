package bai3;

import java.util.Scanner;

public class xeTai extends phuongTien {
    protected int trongTai;

    @Override
    void nhap() {
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.print("Nhap trong tai : ");
        trongTai=sc.nextInt();
        sc.nextLine();
    }

    @Override
    public String toString() {
        return "xeTai{" +
                "trongTai=" + trongTai +
                ", hangSX='" + hangSX + '\'' +
                ", nam=" + nam +
                ", giaBan=" + giaBan +
                ", mau='" + mau + '\'' +
                '}';
    }

    public xeTai() {
    }

    public int getTrongTai() {
        return trongTai;
    }

    public void setTrongTai(int trongTai) {
        this.trongTai = trongTai;
    }
}
