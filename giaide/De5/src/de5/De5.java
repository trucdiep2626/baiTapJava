/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class De5 {

    /**
     * @param args the command line arguments
     */
    
    static ArrayList<ThiSinh> dsts = new ArrayList<>();
    public static void main(String[] args) {
           Scanner input = new Scanner(System.in);
        System.out.println("Nhap so luong thi sinh");
        int n = input.nextInt();
        input.nextLine();
        for (int i = 0; i < n; i++) {
           
            System.out.println("1.Thi sinh A");
            System.out.println("2.Thi sinh C");
             System.out.println("Chon loai thi sinh can nhap");
                int loai = input.nextInt();
        input.nextLine();
        ThiSinh ts=null;
        switch(loai)
        {
            case 1:
                 ts = new ThiSinhKhoiA();
                ts.nhap();
                dsts.add(ts);
                break;
                 case 2:
                 ts = new ThiSinhKhoiC();
                ts.nhap();
                dsts.add(ts);
                break;
        }
        }
        System.out.println("DANH SACH SINH VIEN");
        for (ThiSinh ts : dsts) {
            if (ts instanceof ThiSinhKhoiA) {
                if(((ThiSinhKhoiA) ts).tinhDiem() >20)
                    System.out.println(ts.toString());;
            }
        }
        for (ThiSinh ts : dsts) {
            if (ts instanceof ThiSinhKhoiC) {
                if (((ThiSinhKhoiC) ts).tinhDiem() >20) {
                    System.out.println(ts.toString());;
                }
            }
        }
    }
    
}
