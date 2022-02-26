/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de5;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class ThiSinhKhoiA extends ThiSinh{
    private double toan,ly,hoa;

    public ThiSinhKhoiA() {
    }

    public ThiSinhKhoiA(double toan, double ly, double hoa, String hoTen, String ngaySinh, String diaChi) {
        super(hoTen, ngaySinh, diaChi);
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
    }



    public double getToan() {
        return toan;
    }

    public void setToan(double toan) {
        this.toan = toan;
    }

    public double getLy() {
        return ly;
    }

    public void setLy(double ly) {
        this.ly = ly;
    }

    public double getHoa() {
        return hoa;
    }

    public void setHoa(double hoa) {
        this.hoa = hoa;
    }

    @Override
    public String toString() {
        return "ThiSinhKhoiA{"+super.toString() + "toan=" + toan + ", ly=" + ly + ", hoa=" + hoa + '}';
    }
    
    public void nhap(){
           Scanner input = new Scanner(System.in);
        super.nhap();
        System.out.println("Nhập diem toan");
        toan = input.nextDouble();
         System.out.println("Nhập diem ly");
        ly = input.nextDouble();
         System.out.println("Nhập diem hoa");
        hoa = input.nextDouble();
        input.nextLine();
    }
    

    public double tinhDiem(){
        return ly+toan+hoa;
    }
    
}
