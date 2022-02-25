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
public class DiaChi {
    private String to, phuong,quan,thanhPho;

    public DiaChi() {
    }

    public DiaChi(String to, String phuong, String quan, String thanhPho) {
        this.to = to;
        this.phuong = phuong;
        this.quan = quan;
        this.thanhPho = thanhPho;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getPhuong() {
        return phuong;
    }

    public void setPhuong(String phuong) {
        this.phuong = phuong;
    }

    public String getQuan() {
        return quan;
    }

    public void setQuan(String quan) {
        this.quan = quan;
    }

    public String getThanhPho() {
        return thanhPho;
    }

    public void setThanhPho(String thanhPho) {
        this.thanhPho = thanhPho;
    }
    
        public void nhap()
    {
        Scanner n = new Scanner(System.in);
        System.out.println("Nhap to: ");
        to = n.nextLine();
        System.out.println("Nhap phuong: ");
        phuong = n.nextLine();
        System.out.println("Nhap quan: ");
        quan = n.nextLine();
        System.out.println("Nhap thanh pho: ");
        thanhPho = n.nextLine();
    }


    @Override
    public String toString() {
        return "DiaChi{" + "to=" + to + ", phuong=" + phuong + ", quan=" + quan + ", thanhPho=" + thanhPho + '}';
    }
    
    
}
