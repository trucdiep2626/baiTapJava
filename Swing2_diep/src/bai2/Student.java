/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

/**
 *
 * @author admin
 */
public class Student extends People{
    private String maSV;
      private String email;
      private double diemTK;

    public Student(String maSV, String email, double diemTK, String hoTen, String ngaySinh, String diaChi, String gioiTinh) {
        super(hoTen, ngaySinh, diaChi, gioiTinh);
        this.maSV = maSV;
        this.email = email;
        this.diemTK = diemTK;
    }

    @Override
    public String toString() {
        return "Student{"+super.toString() + "maSV=" + maSV + ", email=" + email + ", diemTK=" + diemTK + '}';
    }
public void xuat()
    {
        System.out.println(this.toString());
    }
    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getDiemTK() {
        return diemTK;
    }

    public void setDiemTK(double diemTK) {
        this.diemTK = diemTK;
    }

    public Student() {
    }
      
}
