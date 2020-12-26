package phanSo;

public class MAIN {
    public static void main(String[] args) {
    phanSo ps1 = new phanSo();
        phanSo ps2 = new phanSo();
        ps1.nhap();
        ps2.nhap();
        System.out.println("phan so rut gon : ");
        ps1.rutGon();
        ps2.rutGon();
        ps1.in();
        ps2.in();
        System.out.print(ps1.tuSo+"\\"+ps1.mauSo+"+"+ps2.tuSo+"\\"+ps2.mauSo+"=");ps1.cong(ps2);
        System.out.print(ps1.tuSo+"\\"+ps1.mauSo+"-"+ps2.tuSo+"\\"+ps2.mauSo+"=");ps1.tru(ps2);
        System.out.print(ps1.tuSo+"\\"+ps1.mauSo+"*"+ps2.tuSo+"\\"+ps2.mauSo+"=");ps1.nhan(ps2);
        System.out.print(ps1.tuSo+"\\"+ps1.mauSo+"\\"+ps2.tuSo+"\\"+ps2.mauSo+"=");ps1.chia(ps2);
    }
}
