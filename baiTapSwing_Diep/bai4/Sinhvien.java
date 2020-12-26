/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baiTapJava.baiTapSwing_Diep.bai4;

/**
 *
 * @author admin
 */
public class Sinhvien {
     private String masv;
    private String hoten;
    private String ngaySinh;
    private String gioiTinh;
    private float diemTB;

    public Sinhvien(String masv, String hoten, String ngaySinh, String gioiTinh, float diemTB) {
        this.masv = masv;
        this.hoten = hoten;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.diemTB = diemTB;
    }

    public String getMasv() {
        return masv;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public float getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(float diemTB) {
        this.diemTB = diemTB;
    }

    public Sinhvien() {
    }

    @Override
    public String toString() {
        return "SinhVien{" + "masv=" + masv + ", hoten=" + hoten + ", ngaySinh=" + ngaySinh + ", gioiTinh=" + gioiTinh + ", diemTB=" + diemTB + '}';
    }
    
    public void nhap()
    {
        System.out.println(this.toString());
    }
}
