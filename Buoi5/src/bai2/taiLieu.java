package bai2;

public class taiLieu {
    private String tenTaiLieu;
    private String maTaiLieu;
    private String tenNXB;

    public taiLieu(String tenTaiLieu, String maTaiLieu, String tenNXB) {
        this.tenTaiLieu = tenTaiLieu;
        this.maTaiLieu = maTaiLieu;
        this.tenNXB = tenNXB;
    }

    public String getTenTaiLieu() {
        return tenTaiLieu;
    }

    public void setTenTaiLieu(String tenTaiLieu) {
        this.tenTaiLieu = tenTaiLieu;
    }

    public String getMaTaiLieu() {
        return maTaiLieu;
    }

    public void setMaTaiLieu(String maTaiLieu) {
        this.maTaiLieu = maTaiLieu;
    }

    public String getTenNXB() {
        return tenNXB;
    }

    public void setTenNXB(String tenNXB) {
        this.tenNXB = tenNXB;
    }

    public taiLieu() {
    }

    @Override
    public String toString() {
        return  "tenTaiLieu='" + tenTaiLieu + '\'' +
                ", maTaiLieu='" + maTaiLieu + '\'' +
                ", tenNXB='" + tenNXB ;
    }
}
