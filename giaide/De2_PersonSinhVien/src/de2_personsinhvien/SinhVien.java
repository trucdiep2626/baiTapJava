/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de2_personsinhvien;

import java.util.Date;

/**
 *
 * @author admin
 */
public class SinhVien extends Person{
    private String chuyenNganh;
    private double diemQuaTrinh;
    private double diemThanhPhan;

//    public SinhVien() {
//    }

    public SinhVien(String chuyenNganh, double diemQuaTrinh, double diemThanhPhan, String hoTen, Date ngaySinh, String diaChi, String gioiTinh) {
        super(hoTen, ngaySinh, diaChi, gioiTinh);
        this.chuyenNganh = chuyenNganh;
        this.diemQuaTrinh = diemQuaTrinh;
        this.diemThanhPhan = diemThanhPhan;
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }

    public double getDiemQuaTrinh() {
        return diemQuaTrinh;
    }

    public void setDiemQuaTrinh(double diemQuaTrinh) {
        this.diemQuaTrinh = diemQuaTrinh;
    }

    public double getDiemThanhPhan() {
        return diemThanhPhan;
    }

    public void setDiemThanhPhan(double diemThanhPhan) {
        this.diemThanhPhan = diemThanhPhan;
    }
    
    public String getXepHang(){
        double diemTK = diemQuaTrinh*0.3 + diemThanhPhan*0.7;
        if (diemTK < 4.0)
            return "F";
        else if(diemTK >4 && diemTK <5)
            return "D";
        else if(diemTK >= 5 && diemTK <6)
            return "C";
        else if(diemTK >= 6 && diemTK < 8.5)
            return "B";
        return "A";
    }

    @Override
    public String toString() {
        return super.toString()+ ", chuyenNganh=" + chuyenNganh + ", diemQuaTrinh=" + diemQuaTrinh + ", diemThanhPhan=" + diemThanhPhan + ", xepHang="+getXepHang();
    }
    
    
}
