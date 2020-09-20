package sinhVien;

public class Main {
    public static void main(String[] args) {
    SinhVien sv = new SinhVien();
            sv.nhap();
        System.out.println("Diem trung binh = "+sv.diemTB());
        System.out.println("Tien thi lai = "+sv.tienThiLai()*90+"k");
    }
}
