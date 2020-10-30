package bai2;

import java.util.Scanner;

public class DaGiac {
    protected int soCanh;
    protected double doDaiCanh[];
    public DaGiac(int soCanh) {
        this.soCanh = soCanh;
        doDaiCanh = new double[soCanh];
    }
    public int getSoCanh() {
        return soCanh;
    }
    public void inDoDaiCanh(int soCanh)
    {
        for (int i=0;i<soCanh;i++)
        {
            System.out.print("   "+doDaiCanh[i]);
        }
    }

    public DaGiac() {
    }
    public int tinhChuVi(int socanh)
    {
        int chuvi=0;
        for (int i=0;i<socanh;i++)
            chuvi+=doDaiCanh[i];
        return chuvi;
    }
}
