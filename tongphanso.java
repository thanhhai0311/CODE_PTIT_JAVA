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
class PhanSo {
    private long tu, mau;

    public PhanSo() {
    }

    public PhanSo(long tu, long mau) {
        this.tu = tu;
        this.mau = mau;
    }
    
    public PhanSo rutgon() {
        long a = this.tu;
        long b = this.mau;
        while(a!=0){
            long tmp = a;
            a = b%a;
            b = tmp;
        }
        PhanSo ans = new PhanSo(this.tu/b, this.mau/b);
        return ans;
    }
    
    public PhanSo cong(PhanSo b){
        long x = this.tu*b.mau + this.mau*b.tu;
        long y = this.mau * b.mau;
        PhanSo a = new PhanSo(x, y);
        PhanSo ans = a.rutgon();
        return ans;
    }

    @Override
    public String toString() {
        return this.tu + "/" + this.mau;
    }
    
}

public class tongphanso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long tu1 = sc.nextInt();
        long mau1 = sc.nextInt();
        long tu2 = sc.nextInt();
        long mau2 = sc.nextInt();
        PhanSo a = new PhanSo(tu1, mau1);
        PhanSo b = new PhanSo(tu2, mau2);
        System.out.println(a.cong(b));
    }
}
