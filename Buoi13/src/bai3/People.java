/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;


import java.util.Date;

/**
 *
 * @author admin
 */
public class People {
    private String hoTen;
      private Date ngaySinh;
      private String diaChi;
      private String gioiTinh;

    public People() {
    }

    public String getHoTen() {
        return hoTen;
    }

    @Override
    public String toString() {
        return  "$" + hoTen + "$" + ngaySinh + "$" + diaChi + "$" + gioiTinh + "$";
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

   

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public People(String hoTen, Date ngaySinh, String diaChi, String gioiTinh) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.gioiTinh = gioiTinh;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }
    
    public void xuat()
    {
        System.out.println(this.toString());
    }
}
