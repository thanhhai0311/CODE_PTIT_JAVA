/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit.next;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
class ha {
    private int tu, mau;

    public ha() {
    }

    public ha(int tu, int mau) {
        this.tu = tu;
        this.mau = mau;
    }

    public int getTu() {
        return tu;
    }

    public int getMau() {
        return mau;
    }
    
    
    public ha rutgon(){
        int tu1 = this.tu;
        int mau1 = this.mau;
        while(mau1!=0){
            int tmp = mau1;
            mau1 = tu1%mau1;
            tu1 = tmp;
        }
        int tu2 = this.tu/tu1;
        int mau2 = this.mau/tu1;
        ha ans = new ha(tu2, mau2);
        return ans;
    }
}

class Fraction {
    long numerator;
    long denominator;
    static Scanner sc = new Scanner(System.in);

    void Input() {
        numerator = sc.nextLong();
        denominator = sc.nextLong();
    }

    void Output() {
        System.out.printf("%d/%d", numerator, denominator);
    }

    void Compact() {
        Long a = numerator;
        Long b = denominator;
        while (a != 0) {
            Long x = a;
            a = b % a;
            b = x;
        }
        numerator /= b;
        denominator /= b;
    }
}


public class phanso {
    public static void main(String[] args) {
        Fraction a = new Fraction();
        a.Input();
        a.Compact();
        a.Output();
    }
}
