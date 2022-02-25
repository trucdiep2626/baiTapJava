/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demiennam;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;
import java.util.Scanner;
import jdk.nashorn.internal.ir.BreakNode;

/**
 *
 * @author admin
 */
public class SanPham {

    private String maSP, tenSP;
    private int donGia;
    private Date ngaySX;

    public SanPham() {
    }

    public SanPham(String maSP, String tenSP, int donGia, Date ngaySX) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.donGia = donGia;
        this.ngaySX = ngaySX;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public int getDonGia() {
        return donGia;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }

    public Date getNgaySX() {
        return ngaySX;
    }

    public void setNgaySX(Date ngaySX) {
        this.ngaySX = ngaySX;
    }

    @Override
    public String toString() {
        return "SanPham{" + "maSP=" + maSP + ", tenSP=" + tenSP + ", donGia=" + donGia + ", ngaySX=" + ngaySX + '}';
    }

    public void nhapSanPham() {
        Scanner input = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.print("Nhập mã sản phẩm: ");
        maSP = input.nextLine();
        System.out.print("Nhập tên sản phẩm: ");
        tenSP = input.nextLine();
        System.out.print("Nhập đơn giá: ");
        donGia = input.nextInt();
        input.nextLine();

        while (true) {
            System.out.print("Nhập ngày sản xuất: ");
            String nsx = input.nextLine();
            try {
                ngaySX = sdf.parse(nsx);
                break;
            } catch (Exception e) {
                System.out.println("Ngày sản xuất không đúng định dạng");
            }
        }
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
        final SanPham other = (SanPham) obj;
        if (!Objects.equals(this.maSP, other.maSP)) {
            return false;
        }
        return true;
    }

}
