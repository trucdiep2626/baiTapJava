package bai2;

import java.util.Scanner;

public class NhanVien {
    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int getChieuCao() {
        return chieuCao;
    }

    public void setChieuCao(int chieuCao) {
        this.chieuCao = chieuCao;
    }

    public int getCanNang() {
        return canNang;
    }

    public void setCanNang(int canNang) {
        this.canNang = canNang;
    }

    private String hoTen;
    private int tuoi;
    private String gioiTinh;
    private String sdt;
    private String diaChi;
    private int chieuCao;
    private int canNang;

    public NhanVien() {
    }
    void nhap()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ho ten : ");
        hoTen=sc.nextLine();
        System.out.print("Nhap tuoi : ");
        tuoi=sc.nextInt();
        sc.nextLine();
        System.out.print("Nhap gioi tinh : ");
        gioiTinh=sc.nextLine();
        System.out.print("Nhap so dien thoai : ");
        sdt=sc.nextLine();
        System.out.print("Nhap dia chi : ");
        diaChi=sc.nextLine();
        System.out.print("Nhap chieu cao : ");
        chieuCao=sc.nextInt();
        System.out.print("Nhap can nang : ");
        canNang=sc.nextInt();
        sc.nextLine();
    }

    @Override
    public String toString() {
        return "hoTen='" + hoTen + '\'' +
                ", tuoi=" + tuoi +
                ", gioiTinh='" + gioiTinh + '\'' +
                ", sdt='" + sdt + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", chieuCao=" + chieuCao +
                ", canNang=" + canNang ;
    }
}
