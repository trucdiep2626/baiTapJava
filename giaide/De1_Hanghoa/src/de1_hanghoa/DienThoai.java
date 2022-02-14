/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de1_hanghoa;

/**
 *
 * @author admin
 */
public class DienThoai extends HangHoa{
    private String nhaSanXuat;
    private String dungLuongBoNho;
    private String mauSac;

    public DienThoai() {
    }

    public DienThoai(String nhaSanXuat, String dungLuongBoNho, String mauSac, String maHang, String tenHang, double giaBan) {
        super(maHang, tenHang, giaBan);
        this.nhaSanXuat = nhaSanXuat;
        this.dungLuongBoNho = dungLuongBoNho;
        this.mauSac = mauSac;
    }

    @Override
    public String toString() {
        return super.toString() + ", nhaSanXuat=" + nhaSanXuat + ", dungLuongBoNho=" + dungLuongBoNho + ", mauSac=" + mauSac ;
    }
    
    

    public String getNhaSanXuat() {
        return nhaSanXuat;
    }

    public void setNhaSanXuat(String nhaSanXuat) {
        this.nhaSanXuat = nhaSanXuat;
    }

    public String getDungLuongBoNho() {
        return dungLuongBoNho;
    }

    public void setDungLuongBoNho(String dungLuongBoNho) {
        this.dungLuongBoNho = dungLuongBoNho;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }
    
    
}
