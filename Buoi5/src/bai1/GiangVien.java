package bai1;

import java.util.Scanner;

public class GiangVien extends Nguoi{

    private String khoa;
    private String monHoc;
    private int namKinhNghiem;
    public GiangVien() {
    }

    public GiangVien( String hoTen, int namSinh, String queQuan, Boolean gioiTinh, String khoa, String monHoc, int namKinhNghiem) {
        super(hoTen, namSinh, queQuan, gioiTinh);
        this.khoa = khoa;
        this.monHoc = monHoc;
        this.namKinhNghiem = namKinhNghiem;
    }

    public String getKhoa() {
        return khoa;
    }

    public void setKhoa(String khoa) {
        this.khoa = khoa;
    }

    public String getMonHoc() {
        return monHoc;
    }

    public void setMonHoc(String monHoc) {
        this.monHoc = monHoc;
    }

    public int getNamKinhNghiem() {
        return namKinhNghiem;
    }

    public void setNamKinhNghiem(int namKinhNghiem) {
        this.namKinhNghiem = namKinhNghiem;
    }

    @Override
    public String toString() {
        return "GiangVien{" +
                super.toString()+
                ", khoa='" + khoa + '\'' +
                ", monHoc='" + monHoc + '\'' +
                ", namKinhNghiem=" + namKinhNghiem +
                '}';
    }
}
