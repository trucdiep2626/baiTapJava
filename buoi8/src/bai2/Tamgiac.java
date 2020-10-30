package bai2;

import java.util.Scanner;

public class Tamgiac extends DaGiac {

    DaGiac tg = new DaGiac(3);

    public Tamgiac( ) {
        this.soCanh=3;
        this.doDaiCanh=new double[3];
    }
    public void nhapDoDaiCanh(int soCanh) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < soCanh; i++) {
            doDaiCanh[i] = sc.nextInt();
        }
    }
    public int tinhChuVi() {
        int cv=0;

        for(int i=0;i<3;i++)
            cv+=this.doDaiCanh[i];
        return cv;
    }
    public double tinhDienTich()

    {
        //tg.inDoDaiCanh(3);
        double p=(this.doDaiCanh[0]+this.doDaiCanh[1]+this.doDaiCanh[2])/2;
        return (double) Math.sqrt(p*(p-this.doDaiCanh[0])*(p-this.doDaiCanh[1])*(p-this.doDaiCanh[2]));
    }

}
