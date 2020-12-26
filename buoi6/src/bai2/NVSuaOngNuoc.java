package bai2;

import java.util.Scanner;

public class NVSuaOngNuoc extends NhanVien {
    private int soGioSua;

    @Override
    void nhap() {
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.print("Nhap so gio sua : ");
        soGioSua=sc.nextInt();
    }

    public NVSuaOngNuoc() {
    }
    int tinhTien()
    {
        return 50000*soGioSua;
    }

    public int getSoGioSua() {
        return soGioSua;
    }

    public void setSoGioSua(int soGioSua) {
        this.soGioSua = soGioSua;
    }

    @Override
    public String toString() {
        return "NVSuaOngNuoc{" +
                super.toString()+
                "soGioSua=" + soGioSua +
                '}';
    }
}
