/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class processStudent {
    Student sv ;
    ArrayList<Student> dssv=new ArrayList<>();
    public void taoDS(int n)
    {
      
        for (int i = 0; i < n; i++) {
            sv = new Student();
            sv.nhap();
            dssv.add(sv);
        }
    }
    public void ghiFile()
    {
        try{
            File f = new File("dsat.dat");
            FileWriter fw= new FileWriter(f);
            BufferedWriter bw= new BufferedWriter(fw);
            for(int i=0;i<dssv.size();i++)
            {
            bw.write(dssv.get(i).toString());
            }
            bw.close();
            fw.close();
        }catch(IOException o){
            
        }
        
    }
    public void docFile(String [] danhSach,int n)
    {
        try{
            File f = new File("dsat.dat");
            FileReader fr= new FileReader(f);
            BufferedReader br= new BufferedReader(fr);
            String line;
            int i=0;
            while ((line = br.readLine()) != null){
                danhSach[i]=br.readLine();
                i++;
              }
            br.close();
            fr.close();
        }catch(IOException o){
            
        }
        
    }
    public void xuatSV(String [] danhSach,int n)
    {
        for (int i = 0; i < n; i++) {
            System.out.println(danhSach[i]);
        }
    }
}
