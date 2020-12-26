package TamGiac;

import java.util.Scanner;

public class MAIN {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        TamGiac tg = new TamGiac();
        System.out.print("Nhập độ dài 3 cạnh : ");
        tg.setA(sc.nextFloat());
        tg.setB(sc.nextFloat());
        tg.setC(sc.nextFloat());
        System.out.println("Chu vi tam giac = "+ tg.ChuVi());

    }
}
