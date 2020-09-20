package phanSo;

import java.util.Scanner;

public class phanSo {
    Scanner sc = new Scanner(System.in);
    int tuSo;
    int mauSo;
    void nhap()
    {
        System.out.print("Nhap tu so : ");
        tuSo=sc.nextInt();
        System.out.print("Nhap mau so : ");
        mauSo=sc.nextInt();
    }
    void in()
    {
        System.out.println(tuSo+"\\"+mauSo);
    }
    int ucln(int _tuSo, int _mauSo) {
        if (_tuSo == 0 || _mauSo == 0)
            return Math.abs(_tuSo + _mauSo);
        while (_mauSo * _tuSo != 0) {
            if (_tuSo > _mauSo)
                _tuSo %= _mauSo;
            else
                _mauSo %= _tuSo;

        }
        return Math.abs(_tuSo + _mauSo);
    }
        void rutGon()
        {

        int ucln=ucln(tuSo,mauSo);
        tuSo=tuSo/ucln;
        mauSo=mauSo/ucln;
    }
    void cong(phanSo pSo)
    {
        phanSo pSoCong= new phanSo();
        pSoCong.tuSo=this.tuSo*pSo.mauSo+this.mauSo*pSo.tuSo;
        pSoCong.mauSo=this.mauSo*pSo.mauSo;
        pSoCong.rutGon();
        pSoCong.in();
    }
    void tru(phanSo pSo)
    {
        phanSo pSoTru= new phanSo();
        pSoTru.tuSo=this.tuSo*pSo.mauSo-this.mauSo*pSo.tuSo;
        pSoTru.mauSo=this.mauSo*pSo.mauSo;
        pSoTru.rutGon();
        pSoTru.in();
    }
    void nhan(phanSo pSo)
    {
        phanSo pSoNhan= new phanSo();
        pSoNhan.tuSo=this.tuSo*pSo.tuSo;
        pSoNhan.mauSo=this.mauSo*pSo.mauSo;
        pSoNhan.rutGon();
        pSoNhan.in();
    }
    void chia(phanSo pSo)
    {
        phanSo pSoChia= new phanSo();
        pSoChia.tuSo=this.tuSo*pSo.mauSo;
        pSoChia.mauSo=this.mauSo*pSo.tuSo;
        pSoChia.rutGon();
        pSoChia.in();
    }
}
