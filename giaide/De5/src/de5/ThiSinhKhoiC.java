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
public class ThiSinhKhoiC extends ThiSinh{
    private double van,su,dia;

    public ThiSinhKhoiC() {
    }

    public ThiSinhKhoiC(double van, double su, double dia, String hoTen, String ngaySinh, String diaChi) {
        super(hoTen, ngaySinh, diaChi);
        this.van = van;
        this.su = su;
        this.dia = dia;
    }


    public double getVan() {
        return van;
    }

    public void setVan(double van) {
        this.van = van;
    }

    public double getSu() {
        return su;
    }

    public void setSu(double su) {
        this.su = su;
    }

    public double getDia() {
        return dia;
    }

    public void setDia(double dia) {
        this.dia = dia;
    }

    @Override
    public String toString() {
        return "ThiSinhKhoiC{" +super.toString()+ "van=" + van + ", su=" + su + ", dia=" + dia + '}';
    }
    
      public void nhap(){
           Scanner input = new Scanner(System.in);
        super.nhap();
        System.out.println("Nhập diem van");
        van = input.nextDouble();
         System.out.println("Nhập diem su");
        su = input.nextDouble();
         System.out.println("Nhập diem dia");
        dia = input.nextDouble();
         input.nextLine();
    }
      

      public double tinhDiem(){
        return van+su+dia;
    }
    
}
