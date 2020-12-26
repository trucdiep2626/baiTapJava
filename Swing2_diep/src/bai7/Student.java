/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai7;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Student {
    private String hoTen;
    private int tuoi;

    @Override
    public String toString() {
        return "Student{" + "hoTen=" + hoTen + ", tuoi=" + tuoi + '}';
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public Student() {
    }

    public void nhap()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten :");
        hoTen=sc.nextLine();
        System.out.println("Nhap tuoi :");
        tuoi=sc.nextInt();
        sc.nextLine();
    }
    
}
