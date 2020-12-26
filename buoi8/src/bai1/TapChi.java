package bai1;

import java.util.Scanner;

public class TapChi extends taiLieu {
    private int soPhatHanh;

    @Override
    public String toString() {
        return "TapChi{" +
                super.toString()+
                "soPhatHanh=" + soPhatHanh +
                ", thangPhatHanh='" + thangPhatHanh + '\'' +
                '}';
    }

    private String thangPhatHanh;

    public TapChi() {
    }

    public int getSoPhatHanh() {
        return soPhatHanh;
    }

    public void setSoPhatHanh(int soPhatHanh) {
        this.soPhatHanh = soPhatHanh;
    }

    public String getThangPhatHanh() {
        return thangPhatHanh;
    }

    public void setThangPhatHanh(String thangPhatHanh) {
        this.thangPhatHanh = thangPhatHanh;
    }

    @Override
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.print("Nhap so phat hanh : ");
        soPhatHanh=sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap thang phat hanh : ");
        thangPhatHanh=sc.nextLine();
        setLoai(2);
    }

}
