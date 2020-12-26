package bai3;

import java.util.ArrayList;

public class QuanLy {
    ArrayList<phuongTien> qlpt = new ArrayList<>();
    void inMenu()
    {
        System.out.println("1.Nhap dang ki oto");
        System.out.println("2.Nhap dang ki xe may");
        System.out.println("3.Nhap dang ki xe tai");
        System.out.println("4.Tim phuong tien theo mau");
        System.out.println("5.Thoat");
        System.out.println("Chon chuc nang can dung : ");
    }
    void nhapoto()
    {
        oto o = new oto();
                o.nhap();
                qlpt.add(o);
    }
    void nhapXeMay()
    {
        xeMay xm = new xeMay();
        xm.nhap();
        qlpt.add(xm);
    }
    void nhapXeTai()
    {
        xeTai xt = new xeTai();
        xt.nhap();
        qlpt.add(xt);
    }
    void timTheoMau(String mau)
    {
        for (phuongTien x :qlpt      ) {
            if(mau.compareTo(x.getMau())==0)
                System.out.println(x.toString());
        }
    }
}
