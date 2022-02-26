/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de5;

import com.sun.javafx.embed.HostDragStartListener;
import com.sun.xml.internal.stream.Entity;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class ThiSinh {
    private String hoTen, ngaySinh, diaChi;

    public ThiSinh() {
    }

    public ThiSinh(String hoTen, String ngaySinh, String diaChi) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
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

    @Override
    public String toString() {
        return  "hoTen=" + hoTen + ", ngaySinh=" + ngaySinh + ", diaChi=" + diaChi ;
    }
    
    public void nhap(){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập họ tên");
        hoTen = input.nextLine();
        System.out.println("Nhập ngày sinh");
        ngaySinh = input.nextLine();
        System.out.println("Nhập dia chi");
        diaChi = input.nextLine();
    }
   
}
