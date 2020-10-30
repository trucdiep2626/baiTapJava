package bai2;

import java.util.Scanner;

public class MAIN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so tam giac : ");
        int n=sc.nextInt();
        Tamgiac[] tg = new Tamgiac[n];
                for (int i=0;i<n;i++)
                {
                    System.out.print("Nhap do dai canh cua tam giac thu "+(i+1));
                    tg[i]=nhapTG();
                }
         double max=tg[0].tinhDienTich();
        for (int i=0;i<n;i++)
        {
            if(tg[i].tinhDienTich()>max)
                max=tg[i].tinhDienTich();
        }
        for (int i=0;i<n;i++)
        {
            if(tg[i].tinhDienTich()==max)
                tg[i].inDoDaiCanh(3);
        }

    }
    static Tamgiac nhapTG()
    {
        Tamgiac tamgiac = new Tamgiac();
            tamgiac.nhapDoDaiCanh(3);
        return tamgiac;
    }
}
