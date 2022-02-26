/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de3;

import java.util.Date;

/**
 *
 * @author admin
 */
public class SinhVienATTT extends SinhVien{
    
    private double hocPhi;

    public SinhVienATTT() {
    }

    public SinhVienATTT(double hocPhi, String maSV, String hoTen, String diaChi, String gioiTinh, Date ngaySinh, double diemTB) {
        super(maSV, hoTen, diaChi, gioiTinh, ngaySinh, diemTB);
        this.hocPhi = hocPhi;
    }

    public double getHocPhi() {
        return hocPhi;
    }

    public void setHocPhi(double hocPhi) {
        this.hocPhi = hocPhi;
    }

    @Override
    public String toString() {
        return super.toString() + hocPhi ;
    }
    
    
    
}
