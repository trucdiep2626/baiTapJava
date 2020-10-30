package bai1;

import java.util.Scanner;

public class MAIN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuanLyTaiLieu qltl= new QuanLyTaiLieu();
        while (true)
        {
            qltl.inMenu();
            int chon=sc.nextInt();
            sc.nextLine();
            switch (chon)
            {
                case 1:
                    qltl.nhapSach();
                    break;
                case 2:
                    qltl.nhapTapChi();
                    break;
                case 3:
                    qltl.nhapBao();
                    break;
                case 4:
                    qltl.inDS();
                    break;
                case 5:
                    System.out.print("Nhap loai can in danh sach : ");
                    String loai=sc.nextLine();
                    if(loai.compareTo("sach")==0)
                        qltl.inDSSach();
                    if(loai.compareTo("tap chi")==0)
                        qltl.inDSSach();
                    if(loai.compareTo("bao")==0)
                        qltl.inDSSach();
                    break;
                case 6:
                    return;
            }
        }
    }
}
