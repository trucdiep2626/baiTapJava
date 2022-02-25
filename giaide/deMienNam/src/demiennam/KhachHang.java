/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demiennam;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class KhachHang {
    private String maKH;
    private String tenKH;
    private int namSinh;
    private DiaChi diaChi;

    public KhachHang() {
    }

    public KhachHang(String maKH, String tenKH, int namSinh, DiaChi diaChi) {
        this.maKH = maKH;
        this.tenKH = tenKH;
        this.namSinh = namSinh;
        this.diaChi = diaChi;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public DiaChi getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(DiaChi diaChi) {
        this.diaChi = diaChi;
    }

    public void nhap()
    {
        Scanner n = new Scanner(System.in);
        System.out.println("Nhap maKH: ");
        maKH = n.nextLine();
        System.out.println("Nhap ten KH: ");
        tenKH = n.nextLine();
        System.out.println("Nhap  nam sinh");
        namSinh = n.nextInt();
        n.nextLine();
        System.out.println("Nhap dia chi: ");
        diaChi.nhap();
    }
    @Override
    public String toString() {
        return "KhachHang{" + "maKH=" + maKH + ", tenKH=" + tenKH + ", namSinh=" + namSinh + ", diaChi=" + diaChi.toString() + '}';
    }
}
