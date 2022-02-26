/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de7;

/**
 *
 * @author admin
 */
public class GiangVien extends NhanVien {
    private String maGV, diaChi, khoa;
    private String gioiTinh;

    public String getMaGV() {
        return maGV;
    }

    public void setMaGV(String maGV) {
        this.maGV = maGV;
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



    public String getKhoa() {
        return khoa;
    }

    public void setKhoa(String khoa) {
        this.khoa = khoa;
    }

    public GiangVien(String maGV, String diaChi, String gioiTinh, String khoa,String hoTen) {
        super( maGV, hoTen);
        this.maGV = maGV;
        this.diaChi = diaChi;
        this.gioiTinh = gioiTinh;
        this.khoa = khoa;
    }

    @Override
    public String toString() {
        return super.toString() + maGV + "," + diaChi + "," + gioiTinh + "," + khoa ;
    }
    
    
}
