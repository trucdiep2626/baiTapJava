package bai1;

import java.util.Scanner;

public class Nguoi {
    Scanner sc = new Scanner(System.in);
    private String hoTen;
    private int namSinh;
    private String queQuan;
    private Boolean gioiTinh;


    public Nguoi() {
    }

    public Nguoi(String hoTen, int namSinh, String queQuan, Boolean gioiTinh) {

        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.queQuan = queQuan;
        this.gioiTinh = gioiTinh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public Boolean getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(Boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String LayGT(Boolean gioiTinh)
    {
        return (gioiTinh==true)?"Nam":"Nu";
    }
    @Override
    public String toString() {
        return " hoTen='" + hoTen + '\'' +
                ", namSinh=" + namSinh +
                ", queQuan='" + queQuan + '\'' +
                ", giơiTinh='" + LayGT(this.gioiTinh) + '\''
                ;
    }
}
