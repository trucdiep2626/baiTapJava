/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai7;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class MAIN {
    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    processStudent qlhs = new processStudent();
    qlhs.taoDS(n);
    qlhs.ghiFile();
        ArrayList<Student> danhSach = new ArrayList<>();
    qlhs.docFile(danhSach, n);
    qlhs.xuatSV(danhSach, n);
    
    }
    
}
