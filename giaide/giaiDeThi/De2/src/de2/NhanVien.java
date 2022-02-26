/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de2;

import java.util.Date;

/**
 *
 * @author admin
 */
public class NhanVien extends Person{
    private String phongBan;
    private double heSoLuong;
    private double luongCB;
    private int thamNien;

    public NhanVien() {
    }

    public NhanVien( String hoTen, String diaChi, String gioiTinh, Date ngaySinh,String phongBan, double heSoLuong, double luongCB, int thamNien) {
        super(hoTen, diaChi, gioiTinh, ngaySinh);
        this.phongBan = phongBan;
        this.heSoLuong = heSoLuong;
        this.luongCB = luongCB;
        this.thamNien = thamNien;
    }

    public String getPhongBan() {
        return phongBan;
    }

    public void setPhongBan(String phongBan) {
        this.phongBan = phongBan;
    }

    public double getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public double getLuongCB() {
        return luongCB;
    }

    public void setLuongCB(double luongCB) {
        this.luongCB = luongCB;
    }

    public int getThamNien() {
        return thamNien;
    }

    public void setThamNien(int thamNien) {
        this.thamNien = thamNien;
    }
    
    public double tinhLuong()
    {
        return luongCB*heSoLuong*(1+thamNien/100);
    }

    @Override
    public String toString() {
        return super.toString()+  phongBan + "$" + heSoLuong +"$" + luongCB + "$" + thamNien ;
    }
    
    
}
