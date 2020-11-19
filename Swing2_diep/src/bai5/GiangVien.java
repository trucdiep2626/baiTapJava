/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai5;

/**
 *
 * @author admin
 */
public class GiangVien {
    private String maGV;
    private String hoTen;
    private String diaChi;
    private String khoa;
    private String gioiTinh;

    public GiangVien() {
    }

    public GiangVien(String maGV, String hoTen, String diaChi, String khoa, String gioiTinh) {
        this.maGV = maGV;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.khoa = khoa;
        this.gioiTinh = gioiTinh;
    }

    @Override
    public String toString() {
        return "GiangVien{" + "maGV=" + maGV + ", hoTen=" + hoTen + ", diaChi=" + diaChi + ", khoa=" + khoa + ", gioiTinh=" + gioiTinh + '}';
    }
    
            
}
