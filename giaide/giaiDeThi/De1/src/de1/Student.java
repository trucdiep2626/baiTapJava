/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de1;

import java.util.Date;

/**
 *
 * @author admin
 */
public class Student extends Person {

    private String maSv;
    private String email;
    private double diemTk;

    public Student() {
    }

    public Student(String maSv, String email, double diemTk, String hoTen, Date ngaySinh, String diaChi, String gioiTinh) {
        super(hoTen, ngaySinh, diaChi, gioiTinh);
        this.maSv = maSv;
        this.email = email;
        this.diemTk = diemTk;
    }

    public String getMaSv() {
        return maSv;
    }

    public void setMaSv(String maSv) {
        this.maSv = maSv;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getDiemTk() {
        return diemTk;
    }

    public void setDiemTk(double diemTk) {
        this.diemTk = diemTk;
    }

    @Override
    public String toString() {
        return super.toString() + "," + maSv + "," + email + "," + diemTk;
    }
    

}
