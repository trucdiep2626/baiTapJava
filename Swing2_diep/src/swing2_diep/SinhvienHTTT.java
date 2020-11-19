/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing2_diep;

/**
 *
 * @author admin
 */
public class SinhvienHTTT extends Sinhvien{
    private double hocPhi;

    public SinhvienHTTT() {
    }

    public SinhvienHTTT(double hocPhi, String masv, String hoten, String ngaySinh, String gioiTinh, double diemTB) {
        super(masv, hoten, ngaySinh, gioiTinh, diemTB);
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
        return "SinhvienHTTT{" +super.toString() +"hocPhi=" + hocPhi + '}';
    }
    public void xuat()
    {
        System.out.println(this.toString());
    }
}
