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
public class thiSinh {
    private String hoTen;
      private String ngaySinh;
      private String diaChi;
      private double tongDiem;

    public double getTongDiem() {
        return tongDiem;
    }

    public void setTongDiem(double tongDiem) {
        this.tongDiem = tongDiem;
    }
public void nhap()
{
    Scanner sc = new Scanner(System.in);
    System.out.println("Nhap ten ");
    hoTen=sc.nextLine();
    System.out.println("Nhap ngay sinh ");
    ngaySinh=sc.nextLine();
    System.out.println("Nhap dia chi");
    diaChi=sc.nextLine();
}
    @Override
    public String toString() {
        return "thiSinh{" + "hoTen=" + hoTen + ", ngaySinh=" + ngaySinh + ", diaChi=" + diaChi + '}';
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public thiSinh() {
    }
      public void xuat()
      {
          System.out.println(this.toString());
      }
}
