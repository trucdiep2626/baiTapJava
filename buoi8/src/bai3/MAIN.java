package bai3;

import java.util.Scanner;

public class MAIN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuanLy ql= new QuanLy();
        while (true)
        {
            ql.inMenu();
            int chon = sc.nextInt();
            switch (chon)
            {
                case 1:
                    ql.nhapoto();
                    break;
                case 2:
                    ql.nhapXeMay();
                    break;
                case 3:
                    ql.nhapXeTai();
                    break;
                case 4:
                    System.out.print("Nhap mau can hien thi : ");
                    String mau=sc.nextLine();
                    ql.timTheoMau(mau);
                    break;
                case 5:
                    return;
            }
        }
    }

}
