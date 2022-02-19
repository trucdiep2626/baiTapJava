/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de5_personnhanvien;

import java.util.Date;

/**
 *
 * @author admin
 */
public class NhanVien extends Person{
    private String maNV;
    private double heSoLuong;
    private String donVi;

    public NhanVien() {
    }

    public NhanVien( String hoTen, Date ngaySinh, String diaChi, String gioiTinh,String maNV, double heSoLuong, String donVi) {
        super(hoTen, ngaySinh, diaChi, gioiTinh);
        this.maNV = maNV;
        this.heSoLuong = heSoLuong;
        this.donVi = donVi;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public double getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public String getDonVi() {
        return donVi;
    }

    public void setDonVi(String donVi) {
        this.donVi = donVi;
    }

    @Override
    public String toString() {
        return super.toString() + maNV + "$" + heSoLuong + "$" + donVi;
    }
    
    
    
}
