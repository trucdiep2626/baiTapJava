package bai2;

import java.util.Scanner;

public class NVGiaoHang extends NhanVien {
    private int soHangGiao;

    public int getSoHangGiao() {
        return soHangGiao;
    }

    public void setSoHangGiao(int soHangGiao) {
        this.soHangGiao = soHangGiao;
    }

    void nhap() {
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.print("Nhap so gio sua : ");
        soHangGiao=sc.nextInt();
    }

    public NVGiaoHang() {
    }
    int tinhTien()
    {
        return 33500*soHangGiao;
    }
    @Override
    public String toString() {
        return "NVGiaoHang{" +
                super.toString()+
                "soHangGiao=" + soHangGiao +
                '}';
    }
}
