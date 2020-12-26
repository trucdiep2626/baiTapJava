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
public class SinhvienMatMa extends Sinhvien{
    private String donVi;
    private int luong;

    public SinhvienMatMa() {
    }

    public SinhvienMatMa(String donVi, int luong, String masv, String hoten, String ngaySinh, String gioiTinh, float diemTB) {
        super(masv, hoten, ngaySinh, gioiTinh, diemTB);
        this.donVi = donVi;
        this.luong = luong;
    }

    @Override
    public String toString() {
        return "SinhvienMatMa{"+super.toString() + "donVi=" + donVi + ", luong=" + luong + '}';
    }
    public void nhap()
    {
        System.out.println(this.toString());
    }
}
