/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de10_giangvien;

/**
 *
 * @author admin
 */
public class GiangVien {
    private String hoTen;
    private String maGV;
    private String gioiTinh;
    private String khoa;
    private String diaChi;

    public GiangVien() {
    }

    public GiangVien(String hoTen, String maGV, String gioiTinh, String khoa, String diaChi) {
        this.hoTen = hoTen;
        this.maGV = maGV;
        this.gioiTinh = gioiTinh;
        this.khoa = khoa;
        this.diaChi = diaChi;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getMaGV() {
        return maGV;
    }

    public void setMaGV(String maGV) {
        this.maGV = maGV;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getKhoa() {
        return khoa;
    }

    public void setKhoa(String khoa) {
        this.khoa = khoa;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Override
    public String toString() {
        return "GiangVien{" + "hoTen=" + hoTen + ", maGV=" + maGV + ", gioiTinh=" + gioiTinh + ", khoa=" + khoa + ", diaChi=" + diaChi + "}\n";
    }
    
    
    
}
