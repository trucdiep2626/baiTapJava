/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de6_number;

/**
 *
 * @author admin
 */
public class Number {
    private int gtA;
    private int gtB;

    public Number() {
    }

    public Number(int gtA, int gtB) {
        this.gtA = gtA;
        this.gtB = gtB;
    }

    public int getGtA() {
        return gtA;
    }

    public void setGtA(int gtA) {
        this.gtA = gtA;
    }

    public int getGtB() {
        return gtB;
    }

    public void setGtB(int gtB) {
        this.gtB = gtB;
    }
    
    
    public int cong(){
        return gtA+gtB;
    }
    
    public int tru(){
        return gtA-gtB;
    }
    
    public int nhan(){
        return gtA*gtB;
    }
    
    public double chia(){
        return (double)gtA/gtB;
    }
    
    public int ucln(){
        int a= gtA;
        int b= gtB;
         if(a == 0){
         return b;
      }else if(b== 0){
        return a;
      }else if(a ==0 && b==0){
        return 1;
      }
      a =Math.abs(a);
      b = Math.abs(b);
      while(a!= b){
       if(a> b){
          a = a-b;
       }else{
        b = b- a;
       }
      }
       return a;
    }

    @Override
    public String toString() {
        return "Number{" + "gtA=" + gtA + ", gtB=" + gtB + ", ucln="+ ucln()+'}';
    }
    
    
}
