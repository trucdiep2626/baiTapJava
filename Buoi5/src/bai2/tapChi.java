package bai2;

public class tapChi extends taiLieu {
    private int soTrang;
    private int ngayXB;
    private String danhMucXB;

    public tapChi() {
    }

    public tapChi(String tenTaiLieu, String maTaiLieu, String tenNXB, String danhMucXB, int soTrang, int ngayXB) {
        super(tenTaiLieu, maTaiLieu, tenNXB);
        this.soTrang = soTrang;
        this.ngayXB = ngayXB;
        this.danhMucXB = danhMucXB;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    public int getNgayXB() {
        return ngayXB;
    }

    public void setNgayXB(int ngayXB) {
        this.ngayXB = ngayXB;
    }

    public String getDanhMucXB() {
        return danhMucXB;
    }

    public void setDanhMucXB(String danhMucXB) {
        this.danhMucXB = danhMucXB;
    }

    @Override
    public String toString() {
        return "tapChi{" +
                super.toString() +
                "soTrang=" + soTrang +
                ", ngayXB=" + ngayXB +
                ", danhMucXB='" + danhMucXB + '\'' +
                '}';
    }
}
