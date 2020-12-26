package bai1;

import java.util.Scanner;

public class SinhVien extends Nguoi {

    private String maLop;
    private String nganhHoc;
    private String khoa;

    public SinhVien() {
    }

    public SinhVien(String hoTen, int namSinh, String queQuan, Boolean gioiTinh, String maLop, String nganhHoc, String khoa) {
        super( hoTen, namSinh, queQuan, gioiTinh);
        this.maLop = maLop;
        this.nganhHoc = nganhHoc;
        this.khoa = khoa;
    }


    public String getMaLop() {
        return maLop;
    }

    public void setMaLop(String maLop) {
        this.maLop = maLop;
    }

    public String getNganhHoc() {
        return nganhHoc;
    }

    public void setNganhHoc(String nganhHoc) {
        this.nganhHoc = nganhHoc;
    }

    public String getKhoa() {
        return khoa;
    }

    public void setKhoa(String khoa) {
        this.khoa = khoa;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                super.toString()+
                ", maLop='" + maLop + '\'' +
                ", nganhHoc='" + nganhHoc + '\'' +
                ", khoa='" + khoa + '\'' +
                '}';
    }
}
