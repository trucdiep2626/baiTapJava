package bai1;

import java.util.Scanner;

public class MAIN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person p1= new Employee("Diep","tv",2000);
        Person p2= new Customer("Truc","dd",1000);
        System.out.println(p1.toString());
        System.out.println(p2.toString());
    }
}
