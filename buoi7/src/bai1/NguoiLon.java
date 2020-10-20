package bai1;

import java.util.Scanner;

public class NguoiLon extends DocGia {
    private String CMND;
    Scanner sc = new Scanner(System.in);

    public NguoiLon() {
    }

    @Override
    void nhap() {
        super.nhap();
        System.out.print("Nhap so CMND : ");
        CMND=sc.nextLine();
        setTienLamThe(tinhTien());
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
