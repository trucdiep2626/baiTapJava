package bai2;

import java.util.Scanner;

public class NVXeOm extends NhanVien {
    private int sokm;
    void nhap() {
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.print("Nhap so gio sua : ");
        sokm=sc.nextInt();
        setTienLuong(tinhTien());
    }

    public NVXeOm() {
    }
    public int tinhTien()
    {
        return 10000*sokm;
    }

    public int getSokm() {
        return sokm;
    }

    public void setSokm(int sokm) {
        this.sokm = sokm;
    }

    @Override
    public String toString() {
        return "NVXeOm{" +
                super.toString()+
                "sokm=" + sokm +
                '}';
    }
}

