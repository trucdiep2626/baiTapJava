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
public class thiSinhKhoiA extends thiSinh{
    private double toan;
    private double hoa;
    private double ly;

    public thiSinhKhoiA() {
    }
    public void nhap()
{
    Scanner sc = new Scanner(System.in);
    super.nhap();
    System.out.println("Nhap diem toan ");
    toan=sc.nextDouble();
    System.out.println("Nhap diem ly ");
    ly=sc.nextDouble();
    System.out.println("Nhap diem hoa ");
    hoa=sc.nextDouble();
    setTongDiem(toan+ly+hoa);
}
 public void xuat()
      {
          System.out.println(this.toString());
      }
    @Override
    public String toString() {
        return "thiSinhKhoiA{"+super.toString() + "toan=" + toan + ", hoa=" + hoa + ", ly=" + ly + '}';
    }
    

    public double getToan() {
        return toan;
    }

    public void setToan(double toan) {
        this.toan = toan;
    }

    public double getHoa() {
        return hoa;
    }

    public void setHoa(double hoa) {
        this.hoa = hoa;
    }

    public double getLy() {
        return ly;
    }

    public void setLy(double ly) {
        this.ly = ly;
    }
    
}
