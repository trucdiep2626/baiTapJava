/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de3_sinhvienlophoc;

import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class LopHoc {
    private String tenLop;
    private int siSo;
    private ArrayList<SinhVien> dssv = new ArrayList<>();

    public LopHoc() {
    }

    public LopHoc(String tenLop, int siSo) {
        this.tenLop = tenLop;
        this.siSo = siSo;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public int getSiSo() {
        return siSo;
    }

    public void setSiSo(int siSo) {
        this.siSo = siSo;
    }
    
    public void themSv(SinhVien sv){
        dssv.add(sv);
    }
}
