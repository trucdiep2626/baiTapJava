/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai9;

/**
 *
 * @author admin
 */
public class Number {
    private int min=1;
    private int max=100;
    private int value;

    public Number() {
    }

    public Number( int value) {
        
        this.value = value;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Number{" + "min=" + min + ", max=" + max + ", value=" + value + '}'+"\n";
    }
    void xuat()
    {
        System.out.println(this.toString());
    }
    boolean kiemTraSNT(int n)
    {
        for (int i = 2; i < n; i++) {
           if(n%i==0)
               return false;
        }
        return true;
    }
            
}
