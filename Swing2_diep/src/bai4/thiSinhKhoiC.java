/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai4;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class thiSinhKhoiC extends thiSinh{
    private double van;
    private double dia;
    private double su;

    public thiSinhKhoiC() {
    }
    public void nhap()
{
    Scanner sc = new Scanner(System.in);
    super.nhap();
    System.out.println("Nhap diem van ");
    van=sc.nextDouble();
    System.out.println("Nhap diem su ");
    su=sc.nextDouble();
    System.out.println("Nhap diem dia ");
    dia=sc.nextDouble();
    setTongDiem(dia+van+su);
}

    @Override
    public String toString() {
        return "thiSinhKhoiC{"+super.toString() + "van=" + van + ", dia=" + dia + ", su=" + su + '}';
    }

    public double getVan() {
        return van;
    }

    public void setVan(double van) {
        this.van = van;
    }

    public double getDia() {
        return dia;
    }

    public void setDia(double dia) {
        this.dia = dia;
    }

    public double getSu() {
        return su;
    }

    public void setSu(double su) {
        this.su = su;
    }
 public void xuat()
      {
          System.out.println(this.toString());
      }

}
