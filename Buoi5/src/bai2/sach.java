package bai2;

public class sach extends taiLieu {
    private int soTrang;
    private int namXB;
    private int lanTaiBan;
    private String tentacGia;

    public sach() {
    }

    public sach(String tenTaiLieu, String maTaiLieu, String tenNXB, String tentacGia, int soTrang, int namXB, int lanTaiBan) {
        super(tenTaiLieu, maTaiLieu, tenNXB);
        this.soTrang = soTrang;
        this.namXB = namXB;
        this.lanTaiBan = lanTaiBan;
        this.tentacGia = tentacGia;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    public int getNamXB() {
        return namXB;
    }

    public void setNamXB(int namXB) {
        this.namXB = namXB;
    }

    public int getLanTaiBan() {
        return lanTaiBan;
    }

    public void setLanTaiBan(int lanTaiBan) {
        this.lanTaiBan = lanTaiBan;
    }

    public String getTentacGia() {
        return tentacGia;
    }

    public void setTentacGia(String tentacGia) {
        this.tentacGia = tentacGia;
    }

    @Override
    public String toString() {
        return "sach{" +
                super.toString()+
                "soTrang=" + soTrang +
                ", namXB=" + namXB +
                ", lanTaiBan=" + lanTaiBan +
                ", tentacGia='" + tentacGia + '\'' +
                '}';
    }
}
