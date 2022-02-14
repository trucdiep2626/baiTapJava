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
public class HangHoa {
    private String maHang;
    private String tenHang;
    private double giaBan;

    public HangHoa() {
    }

    public HangHoa(String maHang, String tenHang, double giaBan) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.giaBan = giaBan;
    }

    public String getMaHang() {
        return maHang;
    }

    public void setMaHang(String maHang) {
        this.maHang = maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    @Override
    public String toString() {
        return "maHang=" + maHang + ", tenHang=" + tenHang + ", giaBan=" + giaBan ;
    }
    
    
}
