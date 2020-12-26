package bai1;

import java.util.Scanner;

public class Sach extends taiLieu {
    private String tenTacGia;
    private int soTrang;

    public String getTenTacGia() {
        return tenTacGia;
    }

    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    public Sach() {
    }

    @Override
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.print("Nhap ten tac gia : ");
        tenTacGia=sc.nextLine();
        System.out.print("Nhap so trang : ");
        soTrang=sc.nextInt();
        sc.nextLine();
        setLoai(1);
    }

    @Override
    public String toString() {
        return "Sach{" +
                super.toString()+
                "tenTacGia='" + tenTacGia + '\'' +
                ", soTrang=" + soTrang +
                '}';
    }
}
