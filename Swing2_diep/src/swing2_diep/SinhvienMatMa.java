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
public class SinhvienMatMa extends Sinhvien{
    private String donVi;
    private int luong;

    public SinhvienMatMa() {
    }

    public SinhvienMatMa(String donVi, int luong, String masv, String hoten, String ngaySinh, String gioiTinh, double diemTB) {
        super(masv, hoten, ngaySinh, gioiTinh, diemTB);
        this.donVi = donVi;
        this.luong = luong;
    }

    @Override
    public String toString() {
        return "SinhvienMatMa{"+super.toString() + "donVi=" + donVi + ", luong=" + luong + '}';
    }
    public void xuat()
    {
        System.out.println(this.toString());
    }
}
