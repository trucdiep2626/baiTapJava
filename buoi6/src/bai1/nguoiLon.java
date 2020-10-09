package bai1;

import java.util.Scanner;

public class nguoiLon extends docGia {
    private String CMND;
    Scanner sc = new Scanner(System.in);

    public nguoiLon() {
    }

    @Override
    void nhap() {
        super.nhap();
        System.out.print("Nhap so CMND : ");
        CMND=sc.nextLine();
    }
    public int tinhTien()
    {
        return getThangConHieuLuc()*10000;
    }

    @Override
    public String toString() {
        return "nguoiLon{" +
                super.toString()+
                "CMND='" + CMND + '\'' +
                '}';
    }
}
