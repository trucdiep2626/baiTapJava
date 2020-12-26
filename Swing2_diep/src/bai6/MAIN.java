/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai6;

import bai7.processStudent;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class MAIN {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n :");
        int n=sc.nextInt();
        String ds[]= new String[n];
        processStudent sv= new processStudent();
        sv.taoDS(n);
        sv.ghiFile();
        sv.docFile(ds, n);
        sv.xuatSV(ds, n);
    }
}
