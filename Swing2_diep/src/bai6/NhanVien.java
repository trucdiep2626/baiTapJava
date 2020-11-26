/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai6;

import bai3.*;
import java.util.Date;

/**
 *
 * @author admin
 */
public class NhanVien extends People{
    private String phongBan;
      private double heSoLuong;
      private int thamNien;
      private int luongCB;
      private double luongThuc;

    public void setLuongThuc() {
        this.luongThuc = tinhLuong();
    }
   
public double tinhLuong()
{
    return luongCB*heSoLuong*(1+thamNien/100);
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

    public int getThamNien() {
        return thamNien;
    }

    public void setThamNien(int thamNien) {
        this.thamNien = thamNien;
    }

    public int getLuongCB() {
        return luongCB;
    }

    public void setLuongCB(int luongCB) {
        this.luongCB = luongCB;
    }

    public NhanVien() {
    }

    @Override
    public String toString() {
        return "NhanVien{" +super.toString()+ "phongBan=" + phongBan + ", heSoLuong=" + heSoLuong + ", thamNien=" + thamNien + ", luongCB=" + luongCB + ", luongThuc=" + luongThuc + '}';
    }

    public NhanVien(String phongBan, double heSoLuong, int thamNien, int luongCB, double luongThuc, String hoTen, Date ngaySinh, String diaChi, String gioiTinh) {
        super(hoTen, ngaySinh, diaChi, gioiTinh);
        this.phongBan = phongBan;
        this.heSoLuong = heSoLuong;
        this.thamNien = thamNien;
        this.luongCB = luongCB;
        this.luongThuc = luongThuc;
    }

   
      
}
