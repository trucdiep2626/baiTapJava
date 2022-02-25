/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demiennam;

import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class SanPhamMua {
    private SanPham sanPham;
    private int soLuong;
    private int thanhTien;

    public SanPhamMua() {
    }

    public SanPhamMua(SanPham sanPham, int soLuong) {
        this.sanPham = sanPham;
        this.soLuong = soLuong;
        this.thanhTien = sanPham.getDonGia()*soLuong;
    }

    public SanPham getSanPham() {
        return sanPham;
    }

    public void setSanPham(SanPham sanPham) {
        this.sanPham = sanPham;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public int getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(int thanhTien) {
        this.thanhTien = thanhTien;
    }

    @Override
    public String toString() {
        return "SanPhamMua{" + "sanPham=" + sanPham + ", soLuong=" + soLuong + ", thanhTien=" + thanhTien + '}';
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final SanPhamMua other = (SanPhamMua) obj;
        if (!Objects.equals(this.sanPham, other.sanPham)) {
            return false;
        }
        return true;
    }
    
    public  void nhap(){
        sanPham.nhapSanPham();
        Scanner n = new Scanner(System.in);
        System.out.println("Nhap so luong: ");
        soLuong = n.nextInt();
        n.nextLine();
    }
}
