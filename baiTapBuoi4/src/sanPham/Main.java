package sanPham;

public class Main {
    public static void main(String[] args) {
    sanPham sp = new sanPham();
    sp.nhap();
        System.out.println("neu ban het thi lai "+sp.tinhLai(sp.Soluong));
        float sl= sp.Soluong*2/3;
        if(sp.tinhLai(sl)>0)
            System.out.println("neu ban 2/3 thi lai "+sp.tinhLai( sl));
        else
            System.out.println("neu ban 2/3 thi lo "+sp.tinhLai( sl));
    }
}

