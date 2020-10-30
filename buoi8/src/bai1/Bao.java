package bai1;

import java.util.Scanner;

public class Bao extends taiLieu {
    private String ngayPhatHanh;

    @Override
    public String toString() {
        return "Bao{" +
                super.toString()+
                "ngayPhatHanh='" + ngayPhatHanh + '\'' +
                '}';
    }

    @Override
    public void nhap() {
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ngay phat hanh : ");
        ngayPhatHanh=sc.nextLine();
        setLoai(3);
    }



    public String getNgayPhatHanh() {
        return ngayPhatHanh;
    }

    public void setNgayPhatHanh(String ngayPhatHanh) {
        this.ngayPhatHanh = ngayPhatHanh;
    }

    public Bao() {
    }
}
