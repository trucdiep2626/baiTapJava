/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class MAIN {
    public static void main(String[] args) {
        ArrayList<thiSinh> TS=new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n : ");
        int n=sc.nextInt();
                        
        for (int i = 0; i < n; i++) {
            thiSinhKhoiA tsA= new thiSinhKhoiA();
            tsA.nhap();
            TS.add(tsA);
        }
        for (int i = 0; i < n; i++) {
            thiSinhKhoiC tsC= new thiSinhKhoiC();
            tsC.nhap();
            TS.add(tsC);
        }
        for (thiSinh sinh : TS) {
            if(sinh.getTongDiem()>20)
            {
                sinh.xuat();
            }
        }
        
    }
}
