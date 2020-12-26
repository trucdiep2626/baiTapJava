package bai3;

import java.util.Scanner;

public class xeMay extends phuongTien {
    protected int congSuat;

    @Override
    public String toString() {
        return "xeMay{" +
                super.toString()+
                "congSuat=" + congSuat +
                '}';
    }

    @Override
    void nhap() {
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.print("Nhap cong suat");
        congSuat=sc.nextInt();
        sc.nextLine();
    }

    public int getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(int congSuat) {
        this.congSuat = congSuat;
    }

    public xeMay() {
    }
}
