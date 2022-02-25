/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demiennam;

import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class HoaDon {
    ArrayList<SanPhamMua> hoaDon = new ArrayList<SanPhamMua>();

    public HoaDon() {
    }
    
    public int tinhTongTien(){
        int tongTien =0;
        for (SanPhamMua sanPhamMua : hoaDon) {
            tongTien+=sanPhamMua.getThanhTien();
        }
        return tongTien;
    }
    
    public void themSanPham()
    {
        SanPhamMua spMoi = new SanPhamMua();
        spMoi.nhap();
        if(hoaDon.contains(spMoi))
        {
            int index = hoaDon.indexOf(spMoi);
            int soLuong = hoaDon.get(index).getSoLuong()+1;
            hoaDon.set(index,new SanPhamMua(spMoi.getSanPham(), soLuong));
        }
        else{
            
        }
    }
}
