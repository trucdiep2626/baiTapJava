/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de3_sinhvienlophoc;

/**
 *
 * @author admin
 */
public class SinhVien {
    private String hoTen;
    private String maSV;
    private double diemHocPhan;
    private double diemQuaTrinh;

    public SinhVien() {
    }

    public SinhVien(String hoTen, String maSV, double diemHocPhan, double diemQuaTrinh) {
        this.hoTen = hoTen;
        this.maSV = maSV;
        this.diemHocPhan = diemHocPhan;
        this.diemQuaTrinh = diemQuaTrinh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public double getDiemHocPhan() {
        return diemHocPhan;
    }

    public void setDiemHocPhan(double diemHocPhan) {
        this.diemHocPhan = diemHocPhan;
    }

    public double getDiemQuaTrinh() {
        return diemQuaTrinh;
    }

    public void setDiemQuaTrinh(double diemQuaTrinh) {
        this.diemQuaTrinh = diemQuaTrinh;
    }
    
    public double getDiemTrungBinh() {
        return this.diemQuaTrinh*0.3 + this.diemHocPhan*0.7;
    }

    @Override
    public String toString() {
        return "SinhVien{" + "hoTen=" + hoTen + ", maSV=" + maSV + ", diemHocPhan=" + diemHocPhan + ", diemQuaTrinh=" + diemQuaTrinh + ", diemTrungBinh=" + getDiemTrungBinh() +'}';
    }
    
    
}
